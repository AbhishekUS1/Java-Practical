package Practicals.Arrays;

// Print first character of every word
public class ex1 {
    public static void main(String[] args) {

        String text = "Hello User!! Welcome";

// Convert the string to an array of characters
        char[] characters = text.toCharArray();

// Iterate through each character
        for (int i = 0; i < characters.length; i++) {
            // Check if the character is not a space
            if (characters[i] != ' ') {
                // If it's the first character or the previous character was a space, print it
                if (i == 0 || characters[i - 1] == ' ') {
                    System.out.println(characters[i]);
                }
            }
        }
    }
}
        /*
             * for(int i = 0; i < a.length; i++) {
             * if(a[i] != ' ' && (i == 0 || a[i - 1] == ' ')) {
             * System.out.println(a[i]);
             * }
             * }
             */
