package Practicals.Problems;

import java.util.ArrayList;
import java.util.List;
public class ex15 {
    public static void main(String[] args) {
        String str = "abc";
        List<String> permutations = getPermutations(str);
        System.out.println(permutations);
    }

    public static List<String> getPermutations(String str) {
        List<String> permutations = new ArrayList<>();
        getPermutations(str, "", permutations);
        return permutations;
    }

    private static void getPermutations(String str, String prefix, List<String> permutations) {
        if (str.length() == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < str.length(); i++) {
                getPermutations(str.substring(0, i) + str.substring(i + 1), prefix + str.charAt(i), permutations);
            }
        }
    }
}