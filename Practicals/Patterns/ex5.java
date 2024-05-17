package Practicals.Patterns;

public class ex5 {
    public static void main(String[] args) {
        int n = 4;
        char ch = '4';
        for (int i = 0; i < n; i++) {
            for (int chars = 0; chars <= i; chars++) {
                System.out.println(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
