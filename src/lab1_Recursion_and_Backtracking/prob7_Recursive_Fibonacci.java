package lab1_Recursion_and_Backtracking;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class prob7_Recursive_Fibonacci {
    public static void main(String[] args) {
        Map<Long, Long> map = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        long fibonacciNumber = Long.parseLong(scanner.nextLine());
        long fibonacciMember = getFibonacci(map, fibonacciNumber);
        System.out.println(fibonacciMember);
    }

    private static long getFibonacci(Map<Long, Long> map, long fibonacciNumber) {
        if (fibonacciNumber == 1) {
            return 1;
        }
        if (fibonacciNumber == 0) {
            return 1;
        }
        if (map.containsKey(fibonacciNumber)) {
            return map.get(fibonacciNumber);
        }
        long fibonacciMember = getFibonacci(map, fibonacciNumber - 2)
                + getFibonacci(map, fibonacciNumber - 1);
        map.put(fibonacciNumber, fibonacciMember);
        return fibonacciMember;
    }
}
