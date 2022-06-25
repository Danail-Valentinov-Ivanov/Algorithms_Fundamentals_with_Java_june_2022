package lab1_Recursion_and_Backtracking;

import java.util.Scanner;

public class prob2_Recursive_Drawing {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        printFigure(number);
    }

    private static void printFigure(int number) {
        if (number == 0){
            return;
        }
        for (int i = 1; i <= number; i++) {
            System.out.print("*");
        }
        System.out.println();

        printFigure(number - 1);

        for (int i = 1; i <= number; i++) {
            System.out.print("#");
        }
        System.out.println();
    }
}
