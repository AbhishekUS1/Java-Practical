package DSA.Sorting;

public class ex1 {
    public static boolean bubbleSort(int[] arr)
    {
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]+ " ");
        }
        System.out.println();
        return false;
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        System.out.println(bubbleSort(arr));
    }
}
