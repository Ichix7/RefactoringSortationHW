import java.io.*;
import java.util.Random;

public class Sortation {
    public static int Comp = 0;
    public static int Swap = 0;
    public static  void main(String args[]) throws IOException  {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));




        String answer = "";

        do
        {
            System.out.println("Hello Friends: Choose One: Selection (s), Bubble(b), Insertion(i), or Quit(q): ");
            answer = obj.readLine();
            System.out.println("How many numbers?: ");
            String num = obj.readLine();
            int choices = Integer.parseInt(num);

            int[] numbers = new int[choices];
            Random rand = new Random();

            for (int y = 0; y < choices; y++)
            {
                int randomnum = rand.nextInt(100);
                numbers[y] = randomnum;
            }

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

            for (int x = 0; x < numbers.length; x++)
            {
                System.out.print(" " + numbers[x]);
            }

            System.out.println("\nCompared: " + Comp);
            System.out.println("Swapped: " +  Swap);
            System.out.println("<Press Enter>");
            obj.readLine();

        } while (answer != "q");
    }

}
