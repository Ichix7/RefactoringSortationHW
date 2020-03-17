public class Selection {
    public int[] SelectionSort(int[] numbers) {
        int Comp = 0;
        int Swap = 0;

        for (int j = 0; j < numbers.length - 1; j++) {
            Comp++;
            int imin = j;

            for (int i = j + 1; i < numbers.length; i++) {
                if (numbers[i] < numbers[imin]) {
                    imin = i;
                }

            }
            if (imin != j) {
                Swap++;
                int temp = numbers[j];
                numbers[j] = numbers[imin];
                numbers[imin] = temp;
            }
        }
        System.out.println("\nCompared: " + Comp);
        System.out.println("Swapped: " +  Swap);
        System.out.println("<Press Enter>");
        return numbers;
    }
}
