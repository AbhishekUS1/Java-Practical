package Practicals.Problems;

// Prime number
public class ex3 {
    public static void main(String[] args) {
        int number = 97;
        int temp = 0;
        for (int i = 2; i <= number / 2; i++) {
            if (number % i == 0) {
                temp = temp + 1;
                break;
            }
        }
        if (temp == 0 && number > 1) {
            System.out.println(number + " is a prime number");
        } else {
            System.out.println(number + " is not a prime number");
        }
    }
}
/*It seems you're asking if the code snippet I provided is correct or if you want me to explain it further. If you're asking if it's correct, then yes, that part of the code is correct. It checks if `temp` is still `0` after the loop and if the `number` is greater than `1`. If both conditions are met, it prints that the number is prime; otherwise, it prints that the number is not prime.

This conditional statement effectively determines whether the number is prime based on the value of `temp`, which is incremented whenever the number is found to be divisible by any number other than 1 and itself (which is what primes should not do).*/
/*If both conditions are not met, it means that either `temp` is not `0`, indicating that the number has factors other than 1 and itself, or the number is not greater than 1, which is a requirement for prime numbers. In either case, it indicates that the number is not prime.

So, if both conditions are not met, the code will execute the `else` block and print that the number is not a prime number.*/