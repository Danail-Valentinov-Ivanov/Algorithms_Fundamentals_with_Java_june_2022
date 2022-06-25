package lab2_Combinatorial_Problems;

import java.util.Scanner;

public class prob7_N_Choose_K_Count {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int k = Integer.parseInt(scanner.nextLine());

        int binom = binomMethod(n, k);
        System.out.println(binom);
    }

    private static int binomMethod(int n, int k) {
        if (k > n) {
            return 0;
        }
        if (k == n || k == 0) {
            return 1;
        }
        return binomMethod(n - 1, k - 1) + binomMethod(n - 1, k);
    }
}
