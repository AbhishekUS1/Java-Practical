package DSA.Backtracking;

//Find subsets
public class ex2 {
    public static void subsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            System.out.print(ans);
            return;
        }
        // Recursion
        // Yes Choice
        subsets(str, ans + str.charAt(i), i + 1);
        // No choice
        subsets(str, ans, i + 1);
    }

    public static void main(String[] args) {
        String str = "abc";
        subsets(str, " ", 0);
    }
}
// abc ab ac a bc b c