package Basics.Arrays;

// Binary search
public class ex6 {
    public static int binarySearch(int numbers[], int key) {
        int start = 0, end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            // comparisions
            if (numbers[mid] == key) {
                return mid;
            }
            if (numbers[mid] < key) {
                // right
                start = mid + 1;
            } else {
                // left
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        // Prerequisite : Array should be sorted in ascending order for binary search to
        // work properly
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 12 };
        int key = 10;
        System.out.println("index for key is" + binarySearch(numbers, key));
    }
}
