import java.util.*;

public class ex1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        double b = sc.nextDouble();
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println("String: " + str);
        System.out.println("Double: " + b);
        System.out.println("Int: " + a);
        sc.close();
    }
}

/*
 * The issue with your code lies in how you're reading the input string after
 * reading an integer and a double. When you use `nextInt()` and `nextDouble()`,
 * they only consume the integer and double values respectively, not the newline
 * character. When you call `nextLine()` after `nextDouble()`, it consumes the
 * newline character left from the previous input, resulting in an empty string.
 * To fix this, you can add an extra `sc.nextLine()` to consume the newline
 * character before reading the string. Here's the corrected version of your
 * code:
 * 
 * ```java
 * import java.io.*;
 * import java.util.*;
 * 
 * public class Solution {
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * int a = sc.nextInt();
 * double b = sc.nextDouble();
 * sc.nextLine(); // Consume the newline character left by nextDouble()
 * String str = sc.nextLine();
 * System.out.println("String: " + str);
 * System.out.println("Double: " + b);
 * System.out.println("Int: " + a);
 * }
 * }
 * ```
 * 
 * Now, this code will correctly read the integer, double, and string inputs
 * without skipping any values.
 * Adding `sc.nextLine()` after `sc.nextDouble()` is necessary because when you
 * use `nextDouble()`, it reads the double value but leaves the newline
 * character (generated when you press Enter) in the input buffer.
 * 
 * So, when you subsequently call `nextLine()` to read the string, it
 * immediately encounters this newline character left in the buffer from the
 * previous input, and it consumes that newline character instead of waiting for
 * new input. This results in `str` being assigned an empty string.
 * 
 * By adding `sc.nextLine()` after `sc.nextDouble()`, you consume this leftover
 * newline character, ensuring that the subsequent `nextLine()` call reads the
 * actual string input.
 */