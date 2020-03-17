import java.io.*;
import java.util.Random;

public class Sortation {

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

            int Comp = 0;
            int Swap = 0;

            for (int y = 0; y < choices; y++)
            {
                int randomnum = rand.nextInt(100);
                numbers[y] = randomnum;
            }
            //region Bubble
            if (answer.equals("b"))
            {
                for (int i = 1; i < numbers.length; i++)
                {
                    for (int j = 0; j < numbers.length - 1; j++)
                    {
                        Comp++;

                        if (numbers[j] > numbers[j + 1])
                        {
                            Swap++;
                            int temp = numbers[j + 1];
                            numbers[j + 1] = numbers[j];
                            numbers[j] = temp;
                        }
                    }
                }
            }//end bubble

            //region Selection
            if (answer.equals("s"))
            {
                for (int j = 0; j < numbers.length - 1; j++)
                {
                    Comp++;
                    int imin = j;

                    for (int i = j + 1; i < numbers.length; i++)
                    {
                        if (numbers[i] < numbers[imin]) { imin = i; }

                    }
                    if (imin != j)
                    {
                        Swap++;
                        int temp = numbers[j];
                        numbers[j] = numbers[imin];
                        numbers[imin] = temp;
                    }
                }
            }//end Selection

            //region Insertions
            if (answer.equals("i"))
            {
                for (int j = 2; j < numbers.length; j++)
                {
                    int key = numbers[j];
                    int i = j - 1;
                    while (i > 0 && numbers[i] > key)
                    {
                        Comp++;
                        numbers[i + 1] = numbers[i];
                        i = i - 1;

                    }
                    Swap++;
                    numbers[i + 1] = key;
                }
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
