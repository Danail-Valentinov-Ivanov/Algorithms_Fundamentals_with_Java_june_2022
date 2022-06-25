package lab2_Combinatorial_Problems;

import java.util.Scanner;

public class prob5_Combinations_without_Repetition {
    public static String[] variations;
    public static String[] elements;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        elements = scanner.nextLine().split("\\s+");
        int kSlots = Integer.parseInt(scanner.nextLine());
        variations = new String[kSlots];

        combinations(0, 0);
    }

    private static void combinations(int index, int start) {
        if (index >= variations.length) {
            print(variations);
            return;
        }
        for (int i = start; i < elements.length; i++) {
            variations[index] = elements[i];
            combinations(index + 1, i + 1);
        }
    }

    private static void print(String[] elements) {
        System.out.println(String.join(" ", elements));
    }
}
