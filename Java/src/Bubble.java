public class Bubble {
    public int[] BubbleSort(int[] numbers) {
        Sortation sortation = new Sortation();
        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                sortation.Comp++;

                if (numbers[j] > numbers[j + 1]) {
                    sortation.Swap++;
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        return numbers;
    }
}
