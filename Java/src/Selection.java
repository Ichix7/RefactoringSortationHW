public class Selection {
    public int[] SelectionSort(int[] numbers) {
        Sortation sortation = new Sortation();
        for (int j = 0; j < numbers.length - 1; j++) {
            sortation.Comp++;
            int imin = j;

            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[imin]) {
                    imin = i;
                }

            }
            if (imin != j) {
                sortation.Swap++;
                int temp = numbers[j];
                numbers[j] = numbers[imin];
                numbers[imin] = temp;
            }
        }
        return numbers;
    }
}
