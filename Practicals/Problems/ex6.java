package Practicals.Problems;

// Palindrome
public class ex6 {
    public static void main(String[] args) {
        int rem, sum = 0, temp;
        int num = 151;
        temp = num;
        while (num > 0) {
            rem = num % 10; // 151%10=1 15%10=5 1%10=1
            sum = (sum * 10) + rem; // (0*10)+1=1 (1*10)+5=15 (15*10)+1=151
            num = num / 10; // 151/10=15 15/10=1 1/10=0
        }
        if (temp == sum) {
            System.out.println("palindrome number");
        } else {
            System.out.println("not a palindrome number");
        }
    }
}
