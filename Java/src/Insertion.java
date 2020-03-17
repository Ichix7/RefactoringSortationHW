public class Insertion {
    public int[] InsertionSort(int[] numbers){
        Sortation sortation = new Sortation();
        for (int j = 2; j < numbers.length; j++)
        {
            int key = numbers[j];
            int i = j - 1;
            while (i > 0 && numbers[i] > key)
            {
                sortation.Comp++;
                numbers[i + 1] = numbers[i];
                i = i - 1;

            }
            sortation.Swap++;
            numbers[i + 1] = key;
        }
        return numbers;
    }
}
