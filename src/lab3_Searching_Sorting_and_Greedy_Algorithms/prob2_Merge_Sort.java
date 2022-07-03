package lab3_Searching_Sorting_and_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class prob2_Merge_Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();
        sort(array);
        StringBuilder stringBuilder = new StringBuilder();
        for (int element : array) {
            stringBuilder.append(element).append(" ");
        }
        System.out.println(stringBuilder);
    }

    private static void sort(int[] array) {
        mergeSort(array, 0, array.length - 1);
    }

    private static void mergeSort(int[] array, int begin, int end) {
        if (begin >= end) {
            return;
        }
        int midIndex = (begin + end) / 2;
        mergeSort(array, begin, midIndex);
        mergeSort(array, midIndex + 1, end);
        merge(array, begin, midIndex, end);
    }

    private static void merge(int[] array, int begin, int midIndex, int end) {
        if (midIndex < 0 || midIndex >= array.length || array[midIndex] < array[midIndex + 1]) {
            return;
        }
        int leftBegin = begin;
        int rightBegin = midIndex + 1;
        int[] helpArray = new int[array.length];
        for (int i = begin; i <= end; i++) {
            helpArray[i] = array[i];
        }
        for (int i = begin; i <= end; i++) {
            if (leftBegin > midIndex) {
                array[i] = helpArray[rightBegin++];
            } else if (rightBegin > end) {
                array[i] = helpArray[leftBegin++];
            } else if (helpArray[leftBegin] < helpArray[rightBegin]) {
                array[i] = helpArray[leftBegin++];
            } else {
                array[i] = helpArray[rightBegin++];
            }
        }
    }
}
