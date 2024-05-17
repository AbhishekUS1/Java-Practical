package DSA.Backtracking;

public class ex1 {
    public static void changeArr(int arr[], int i, int val)
    {
        //Base case
        if(i==arr.length)
        {
            printArr(arr); //1 2 3 4 5
            return;
        }
        //recursion
        arr[i]=val;
        changeArr(arr,i+1,val+1);
        arr[i]=arr[i]-2;
    }
    
    public static void printArr(int arr[])
    {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int arr[]=new int[5];
        changeArr(arr,0,1);
        printArr(arr);
    }
}
/*
Let's break down how the given code works step by step:

1. The `main` method creates an array `arr` of size 5 and initializes all elements to 0.
2. It then calls the `changeArr` method with the array `arr`, `i` set to 0, and `val` set to 1.

Inside the `changeArr` method:
1. The base case checks if `i` is equal to the length of the array (`arr.length`). If it is true, it calls the `printArr` method to print the array and then returns.
2. If the base case is not met, the current value at index `i` in the array `arr` is set to `val`.
3. The `changeArr` method is then recursively called with `i` incremented by 1 and `val` incremented by 1.
4. After the recursive call returns, the value at index `i` in the array `arr` is decreased by 2 (`arr[i] = arr[i] - 2`).

Now, let's see how the values change in the `arr` array:

1. `changeArr(arr, 0, 1)` is called. `arr[0]` is set to 1.
2. Recursive call with `changeArr(arr, 1, 2)` (`arr[1]` set to 2).
3. Recursive call with `changeArr(arr, 2, 3)` (`arr[2]` set to 3).
4. Recursive call with `changeArr(arr, 3, 4)` (`arr[3]` set to 4).
5. Recursive call with `changeArr(arr, 4, 5)` (`arr[4]` set to 5).

Now the base case is met (`i == arr.length`), and it calls `printArr(arr)`, printing: `1 2 3 4 5`.

As the recursive calls start returning, the values in the array `arr` are decreased by 2 at each step:

1. `arr[4]` becomes 5 - 2 = 3
2. `arr[3]` becomes 4 - 2 = 2
3. `arr[2]` becomes 3 - 2 = 1
4. `arr[1]` becomes 2 - 2 = 0
5. `arr[0]` becomes 1 - 2 = -1

Finally, the `main` method calls `printArr(arr)`, printing: `-1 0 1 2 3`.

So, the final output of the program will be:

```
1 2 3 4 5
-1 0 1 2 3
 */
