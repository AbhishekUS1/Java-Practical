package Practicals.Misc;

public class Problem2 {
        public static void main(String[] args) {
            System.out.print("Enter the value of a: ");
            int a = 6;
            for (int i = 1; i <= a; i++) {
                System.out.print(2 * i - 1); //2*1-1= 1 2*2-1=3 2*3-1=5 2*4-1=7 2*5-1=9 2*6-1=11
                if (i < a) {
                    System.out.print(" ");
                }
            }
        }
}
