package Practicals.Arrays;

// Replace a char
public class ex3 {
    public static void main(String[] args) {
        String s = "Hello world!! Welcome to Coding Simplified";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i] == 'o') {
                ch[i] = 'y';
            }
        }
        System.out.println(ch);
    }
}
