package lab2_Combinatorial_Problems;

import java.util.Scanner;

public class prob1_Permutations_without_Repetition {
    public static String[] perm;
    public static String[] elements;
    public static boolean[] used;
    public static StringBuilder stringBuilder;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        perm = new String[elements.length];
        used = new boolean[elements.length];

        permute(0);
    }

    private static void permute(int index) {
        if (index >= elements.length) {
            print();
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {
                used[i] = true;
                perm[index] = elements[i];
                permute(index + 1);
                used[i] = false;
            }
        }
    }

    private static void print() {
        stringBuilder = new StringBuilder();
        for (int i = 0; i < perm.length; i++) {
            stringBuilder.append(perm[i] + " ");
        }
        System.out.println(stringBuilder.toString().trim());
    }
}
