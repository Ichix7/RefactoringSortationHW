import java.io.*;
import java.util.Random;

public class Sortation {
    public int Comp = 0;
    public int Swap = 0;
    public static  void main(String args[]) throws IOException  {
        BufferedReader obj = new BufferedReader(new InputStreamReader(System.in));
        Bubble bubble = new Bubble();
        Selection selection = new Selection();
        Insertion insertion = new Insertion();

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
                bubble.BubbleSort(numbers);
            }//end bubble

            //region Selection
            if (answer.equals("s"))
            {
                selection.SelectionSort(numbers);
            }//end Selection

            //region Insertions
            if (answer.equals("i"))
            {
                insertion.InsertionSort(numbers);
            }//end Insertions

            for (int x = 0; x < numbers.length; x++)
            {
                System.out.print(" " + numbers[x]);
            }
            obj.readLine();

        } while (answer != "q");
    }

}
