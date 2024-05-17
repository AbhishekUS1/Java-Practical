package Practicals.Problems;

public class ex2 {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 7;
        System.out.println("Before swap " + n1 + " " + n2);
        n1 = n1 ^ n2;
        n2 = n1 ^ n2;
        n1 = n1 ^ n2;
        System.out.println("After swap " + n1 + " " + n2);
    }
}
