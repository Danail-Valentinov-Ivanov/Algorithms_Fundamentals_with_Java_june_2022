package lab1_Recursion_and_Backtracking;

import java.util.Scanner;

public class prob3_Generating_0_1_Vectors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.parseInt(scanner.nextLine());
        Integer[] memory = new Integer[number];
        generateVector(memory, 0);
    }

    private static void generateVector(Integer[] memory, int index) {
        if (index >= memory.length){
            print(memory);
            return;
        }
        for (int i = 0; i <= 1; i++) {
            memory[index] = i;
            generateVector(memory, index + 1);
        }
    }

    private static void print(Integer[] memory) {
        for (Integer e: memory) {
            System.out.print(e);
        }
        System.out.println();
    }
}
