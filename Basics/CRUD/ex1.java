package Basics.CRUD;

public class ex1 {

        // Function to count inversions in an array
        public static int countInversions(int[] arr) {
            int n = arr.length;
            int count = 0;

            for (int i = 0; i < n - 1; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (arr[i] > arr[j]) {
                        // Increment count if the pair is an inversion
                        count++;
                        // Print the inversion pair if needed
                        System.out.println("(" + arr[i] + ", " + arr[j] + ")");
                    }
                }
            }

            return count;
        }

        public static void main(String[] args) {
            int[] arr = {2, 4, 5, 6, 7};

            int inversions = countInversions(arr);

            System.out.println("Number of inversions: " + inversions);
        }
    }


