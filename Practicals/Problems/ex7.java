package Practicals.Problems;

// Duplicate elements in an array
public class ex7 {
    public static void main(String[] args) {
        int arr[] = { 3, 5, 3, 5, 12 };
        int count = 0;
        System.out.println("duplicate elements given in an array");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    System.out.println(arr[j]);

                }
            }
        }
        System.out.println("count" + count);
    }
}
