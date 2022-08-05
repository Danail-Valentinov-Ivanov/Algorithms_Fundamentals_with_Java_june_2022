package lab3_Searching_Sorting_and_Greedy_Algorithms;

public class BubbleSort {
    public static int[] array = new int[]{9, 3, 1, 0, 13, 11};

    public static void main(String[] args) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]){
                    swap(i, j);
                }
            }
        }
        print();
    }

    private static void print() {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    private static void swap(int i, int j) {
        array[i] = array[i] + array[j];
        array[j] = array[i] - array[j];
        array[i] = array[i] - array[j];
    }
}
