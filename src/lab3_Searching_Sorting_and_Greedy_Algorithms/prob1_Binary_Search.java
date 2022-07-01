package lab3_Searching_Sorting_and_Greedy_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class prob1_Binary_Search {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).sorted()
                .toArray();
        int number = Integer.parseInt(scanner.nextLine());
        int index = getIndex(array, number);
        System.out.println(index);
    }

    private static int getIndex(int[] array, int number) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        while (startIndex <= endIndex){
            int midIndex = startIndex + (endIndex - startIndex) / 2;
            if (number > array[midIndex]){
                startIndex = midIndex + 1;
            } else if (number < array[midIndex]){
                endIndex = midIndex - 1;
            } else {
                return midIndex;
            }
        }
        return -1;
    }
}
