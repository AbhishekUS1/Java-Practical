package Practicals.Patterns;

// Star pattern
public class ex1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        /*
         * for (int i = 1; i <= 4; i++) {
         * for (int j = 1; j <=i; j++) {
         * System.out.print(j);
         * }
         * System.out.println();
         * }
         */
    }
}
