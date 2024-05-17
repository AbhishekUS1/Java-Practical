package Practicals.Patterns;

public class ex7 {
    public static void pattern(int totrow, int totcolumn) {
        for (int i = 1; i <= totrow; i++) {
            for (int j = 1; j <= totcolumn; j++) {
                if (i == 1 || i == totrow || j == 1 || j == totcolumn) {
                    System.out.print("*");
                } else {
                    System.out.print(" "); // corrected this line
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pattern(4, 5);
    }
}
