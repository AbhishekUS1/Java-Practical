package TwoDArrays;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        int matrix[][] = new int[3][3];
        int n = matrix.length, m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter elements of the matrix:");
        try {
            for (int i = 0; i < n; i++) { // Row
                for (int j = 0; j < m; j++) { // Column
                    matrix[i][j] = sc.nextInt();
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Please enter valid integers.");
            return;
        }

        // Output
        System.out.println("Matrix:");
        for (int i = 0; i < n; i++) { // Row
            for (int j = 0; j < m; j++) { // Column
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        search(matrix, 5);
    }

    public static boolean search(int[][] matrix, int key) {
        for (int i = 0; i < matrix.length; i++) { // Row
            for (int j = 0; j < matrix[0].length; j++) { // Column
                if (matrix[i][j] == key) {
                    System.out.println("Found at cell (" + i + "," + j + ")");
                    return true;
                }
            }
        }
        System.out.println("Key not found");
        return false;
    }
}
