package Basics.Arrays;

// Max subarray sum
public class ex12 {
    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5 };
        maxsubarrays(numbers);
    }

    public static void maxsubarrays(int numbers[]) {
        int currsum = 0;
        int maxsum = Integer.MIN_VALUE;
        for (int i = 0; i < numbers.length; i++) {
            int start = i;
            for (int j = i; j < numbers.length; j++) {
                int end = j;
                currsum = 0;
                for (int k = start; k <= end; k++) {
                    // Sub array sum
                    currsum += numbers[k];
                }
                System.out.println(currsum);
                if (maxsum < currsum) {
                    maxsum = currsum;
                }
                System.out.println();
            }
            System.out.println("Break");
        }
        System.out.println("max sum is " + maxsum);
    }
}
