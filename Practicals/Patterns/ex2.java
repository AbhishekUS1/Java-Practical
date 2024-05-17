package Practicals.Patterns;

public class ex2 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                count = count + 1;
                System.out.print(count + " ");
            }
            System.out.println();
        }
    }
}
/*
 * package Patterns;
 * 
 * public class ex2 {
 * public static void main(String[] args) {
 * int count = 10; // Start count from the last number
 * for (int i = 4; i >= 1; i--) { // Loop in reverse
 * for (int j = 1; j <= i; j++) {
 * System.out.print(count + " "); // Print the count in reverse
 * count--; // Decrement the count
 * }
 * System.out.println();
 * }
 * }
 * }
 */