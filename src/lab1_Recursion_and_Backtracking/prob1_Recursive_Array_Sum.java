package lab1_Recursion_and_Backtracking;

import java.util.Arrays;
import java.util.Scanner;

public class prob1_Recursive_Array_Sum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[]array = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int sumNumbers = sum(array, array.length - 1);
        System.out.println(sumNumbers);
    }

    public static int sum(int[] array, int index){
        if (index < 0){
            return 0;
        }
        return array[index] + sum(array, index - 1);
    }
}
