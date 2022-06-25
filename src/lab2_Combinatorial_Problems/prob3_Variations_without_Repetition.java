package lab2_Combinatorial_Problems;

import java.util.Scanner;

public class prob3_Variations_without_Repetition {
    public static String[] variations;
    public static String[] elements;
    public static boolean[] used;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int kSlots = Integer.parseInt(scanner.nextLine());
        variations = new String[kSlots];
        used = new boolean[elements.length];

        variations(0);
    }

    private static void variations(int index) {
        if (index >= variations.length) {
            print(variations);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            if (!used[i]) {

                used[i] = true;
                variations[index] = elements[i];
                variations(index + 1);
                used[i] = false;
            }
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
