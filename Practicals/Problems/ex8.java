package Practicals.Problems;
//reverse an array
public class ex8 {
    public static void main(String[] args) {
        int arr[] = new int[]{3, 7, 1};
        System.out.println("length of the array is "+arr.length);
        System.out.println("array in reverse order");
        for (int i = arr.length - 1; i >= 0; i--) {//arr.length 3-1=1 3-2=7 3-3=3
            System.out.println(arr[i] + " ");
        }
    }
}
