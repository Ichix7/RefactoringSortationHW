public class Bubble {
    public int[] BubbleSort(int[] numbers) {
        int Comp = 0;
        int Swap = 0;

        for (int i = 1; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                Comp++;

                if (numbers[j] > numbers[j + 1]) {
                    Swap++;
                    int temp = numbers[j + 1];
                    numbers[j + 1] = numbers[j];
                    numbers[j] = temp;
                }
            }
        }
        System.out.println("\nCompared: " + Comp);
        System.out.println("Swapped: " +  Swap);
        System.out.println("<Press Enter>");
        return null;
    }
}
