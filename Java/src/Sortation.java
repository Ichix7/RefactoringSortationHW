import java.io.*;
import java.util.Random;

public class Sortation {

    public static int Comp = 0;
    public static int Swap = 0;
    public static BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));

    public static  void main(String args[])throws IOException{
        ChooseSortMethod();
    }

    public static void ChooseSortMethod() throws IOException{

        String answer = "";
        System.out.println("Hello Friends: Choose One: Selection (s), Bubble(b), Insertion(i), or Quit(q): ");
        answer = obj.readLine();

        int[] numbers = createArray();

        //region Bubble
        if (answer.equals("b"))
        {
            Bubble bubble = new Bubble();
            bubble.BubbleSort(numbers);
        }//end bubble

        //region Selection
        if (answer.equals("s"))
        {
            Selection selection = new Selection();
            selection.SelectionSort(numbers);
        }//end Selection

        //region Insertions
        if (answer.equals("i"))
        {
            Insertion insertion = new Insertion();
            insertion.InsertionSort(numbers);
        }//end Insertions

        displayResult(numbers);
        ChooseSortMethod();
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
