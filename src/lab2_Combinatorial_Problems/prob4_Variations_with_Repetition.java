package lab2_Combinatorial_Problems;

import java.util.Scanner;

public class prob4_Variations_with_Repetition {
    public static String[] variations;
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int kSlots = Integer.parseInt(scanner.nextLine());
        variations = new String[kSlots];

        variations(0);
    }

    private static void variations(int index) {
        if (index >= variations.length) {
            print(variations);
            return;
        }
        for (int i = 0; i < elements.length; i++) {
            variations[index] = elements[i];
            variations(index + 1);
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
