package Practicals.Problems;

public class ex13 {
    public static String reverseVowels(String s) {
        if (s == null || s.length() == 0) return s;
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !vowels.contains(chars[start] + "")) {
                start++;
            }
            while (start < end && !vowels.contains(chars[end] + "")) {
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return new String(chars);
    }

    public static void main(String[] args) {
        String s="";
        System.out.println(reverseVowels(s));
    }
}
/*
This function takes a string as an input and returns a new string with the vowels reversed. The function first
checks if the input string is null or empty, and if it is, it returns the input string. Then, it converts the input
string into a character array and initializes two pointers, start and end, to the beginning and end of the array,
respectively. The function then enters a while loop that continues until the start pointer is greater than or equal
to the end pointer. Inside the loop, the function moves the start pointer forward until it finds a vowel, and
moves the end pointer backward until it finds a vowel. Once both pointers are pointing to vowels, the function
swaps the characters at those positions, increments the start pointer, and decrements the end pointer. Finally,
after the loop completes, the function creates a new string from the character array and returns it.
 */
