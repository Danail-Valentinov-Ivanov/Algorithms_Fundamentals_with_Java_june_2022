package lab1_Recursion_and_Backtracking;

import java.util.Scanner;

public class prob4_Recursive_Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        int factorialNumber = factorial(number);
        System.out.println(factorialNumber);
    }

    private static int factorial(int number) {
        if (number == 0){
            return 1;
        }
        return number * factorial(number - 1);
    }
}
