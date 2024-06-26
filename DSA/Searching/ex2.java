package DSA.Searching;

// Linear search
public class ex2 {
    public static int linearsearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 };
        int key = 5;
        int index = linearsearch(numbers, key);
        // If element is found print the index otherwise print not found
        if (index != -1) {
            System.out.println("Element " + key + " is at index " + index);
        } else {
            System.out.println("Element " + key + " is not present in array");
        }
    }
}
