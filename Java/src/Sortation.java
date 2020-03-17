import java.io.*;
import java.util.Random;

public class Sortation {

    public static int Comp = 0;
    public static int Swap = 0;
    public static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public static  void main(String args[])throws IOException{
        runSort();
    }

    public static void runSort()throws IOException{
        int[] numbers = createArray();
        ChooseSortMethod(numbers);
        displayResult(numbers);
        runSort();
    }

    public static void ChooseSortMethod(int [] numbers) throws IOException{
        String answer = "";
        System.out.println("Choose sort method: Selection (s), Bubble(b), Insertion(i), or Quit(q): ");
        answer = obj.readLine().toLowerCase();

        //start Bubble
        if (answer.equals("b"))
        {
            Bubble bubble = new Bubble();
            bubble.BubbleSort(numbers);
        }
        //start Selection
        if (answer.equals("s"))
        {
            Selection selection = new Selection();
            selection.SelectionSort(numbers);
        }
        //start Insertions
        if (answer.equals("i"))
        {
            Insertion insertion = new Insertion();
            insertion.InsertionSort(numbers);
        }
        if (answer.equals("q"))
        {
            System.exit(0);
        }
    }

    public static void displayResult(int[] numbers) throws IOException{
        for (int x = 0; x < numbers.length; x++)
        {
            System.out.print(" " + numbers[x]);
        }

        System.out.println("\nCompared: " + Comp);
        System.out.println("Swapped: " +  Swap);
        System.out.println("<Press Enter>");
        obj.readLine();
    }
    public static int[] createArray() throws IOException{
        System.out.println("How many numbers?: ");
        String num = obj.readLine();
        int[] numbers = new int[Integer.parseInt(num)];
        Random rand = new Random();

        for (int y = 0; y < numbers.length; y++)
        {
            int randomnum = rand.nextInt(100);
            numbers[y] = randomnum;
        }
        return numbers;
    }

}
