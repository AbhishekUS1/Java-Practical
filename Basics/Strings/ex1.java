package Basics.Strings;

import java.util.*;

public class ex1 {
    public static void printletters(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        char arr[] = { 1, 2, 3, 4, 5 };
        String str = "abcd";
        String str2 = new String("xyz");
        // Strings are immutable
        /*
         * Scanner sc=new Scanner(System.in);
         * String name;
         * name=sc.next();
         * System.out.println(name);
         */

        String fullName = "Tony stark";
        System.out.println(fullName.length());

        String firstname = "Sam";
        String lastName = "tony";
        System.out.println(firstname + " " + lastName);
        System.out.println(fullName.charAt(0)); // Character at index
        printletters(str);

        String s1 = "tony";
        String s2 = "tony";
        String s3 = new String("tony");

        if (s1 == s2) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }

        if (s3.equals(s1)) {
            System.out.println("Strings are equal");
        } else {
            System.out.println("Strings are not equal");
        }
    }
}
/*
 * The line of code you've provided creates a new String object with the value
 * "tony" and assigns it to the variable `s3`.
 * 
 * Here's what's happening:
 * 
 * 1. `new String("tony")`: This part creates a new String object with the value
 * "tony". Even though "tony" is already a string literal, using `new String()`
 * explicitly creates a new instance of the String object rather than reusing an
 * existing one from the string pool.
 * 
 * 2. `String s3 = ...`: This part declares a variable named `s3` of type String
 * and assigns the newly created String object with the value "tony" to it.
 * 
 * So, `s3` is a reference to a new String object containing the value "tony".

 */