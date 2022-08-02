package lab3_Searching_Sorting_and_Greedy_Algorithms;

public class SelectionSort {
    public static int[] array = new int[]{9, 3, 1, 0, 13, 11};

    public static void main(String[] args) {
        int length = array.length;
        for (int i = 0; i < length - 1; i++) {
            int minValueIndex = i;
            for (int j = i + 1; j < length; j++) {
                if (array[minValueIndex] > array[j]){
                    minValueIndex = j;
                }
            }
            if (minValueIndex != i){
                array[i] = array[i] + array[minValueIndex];
                array[minValueIndex] = array[i] - array[minValueIndex];
                array[i] = array[i] - array[minValueIndex];
            }
        }
        for (int i = 0; i < length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
