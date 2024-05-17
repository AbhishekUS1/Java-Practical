package Basics.Arrays;

//Print subarrays and calculate their sum
public class ex11 {
    public static void subarrays(int numbers[]) {
        int ts = 0;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                int sum = 0; // Variable to store the sum of the subarray
                for (int k = start; k <= end; k++) {
                    System.out.print(numbers[k] + " ");
                    sum += numbers[k]; // Add each element to the sum
                }
                ts++;
                System.out.println("Sum: " + sum); // Print the sum of the subarray
            }
            System.out.println();
        }
        System.out.println("Total subarrays are " + ts);
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10 };
        subarrays(numbers);
    }
}
