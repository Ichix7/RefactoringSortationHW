public class Insertion {
    public int[] InsertionSort(int[] numbers){
        int Comp = 0;
        int Swap = 0;

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
        System.out.println("\nCompared: " + Comp);
        System.out.println("Swapped: " +  Swap);
        System.out.println("<Press Enter>");
        return numbers;
    }
}
