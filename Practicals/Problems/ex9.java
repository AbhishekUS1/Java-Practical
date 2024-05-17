package Practicals.Problems;

// Copy all elements of one array into another array
public class ex9 {
    public static void main(String[] args) {
        // initialize first array
        int arr1[] = new int[] { 1, 2, 3 };
        // create another arr2 which is same size as arr1
        int arr2[] = new int[arr1.length];// if it was a big array
        // copy all elements of arr1 to arr2
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[i] + "");
            arr2[i] = arr1[i];
        }
        System.out.println("Display elements of second array");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i] + "");
        }
    }
}
// First we copy and then we display it.