package lab1_Recursion_and_Backtracking;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class prob5_Find_All_Paths_in_a_Labyrinth {
    static List<Character> paths = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = Integer.parseInt(scanner.nextLine());
        int cols = Integer.parseInt(scanner.nextLine());
        char[][] labyrinth = new char[rows][cols];

        for (int row = 0; row < rows; row++) {
            labyrinth[row] = scanner.nextLine().toCharArray();
        }

        findPath(labyrinth, 0, 0, ' ');
    }

    private static void findPath(char[][] labyrinth, int row, int col, char direction) {
        if (!isInBounds(labyrinth, row, col) || labyrinth[row][col] == 'V' || labyrinth[row][col] == '*') {
            return;
        }
        paths.add(direction);

        if (labyrinth[row][col] == 'e') {
            printPath();
            paths.remove(paths.size() - 1);
            return;
        }
        labyrinth[row][col] = 'V';

        findPath(labyrinth, row - 1, col, 'U');
        findPath(labyrinth, row + 1, col, 'D');
        findPath(labyrinth, row, col - 1, 'L');
        findPath(labyrinth, row, col + 1, 'R');

        labyrinth[row][col] = '-';
        paths.remove(paths.size() - 1);
    }

    private static void printPath() {
        for (int i = 1; i < paths.size(); i++) {
            System.out.print(paths.get(i));
        }
        System.out.println();
    }

    private static boolean isInBounds(char[][] labyrinth, int row, int col) {
        return row < labyrinth.length && row >= 0 && col < labyrinth[row].length && col >= 0;
    }
}
