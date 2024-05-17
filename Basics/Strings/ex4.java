package Basics.Strings;

// Largest String
public class ex4 {

    public static void main(String[] args) {
        String fruits[] = { "apple", "mango", "banana" , "zebra"};
        String largest = fruits[0];
        for (int i = 0; i < fruits.length; i++) {
            if (largest.compareTo(fruits[i]) < 0) {
                largest = fruits[i];
            }
        }
        System.out.println(largest);
    }
}

// compareTo - doesn't ignore the case
///comparetoIgnoreCase - ignores the case
/*Certainly! Let's go through the code step by step:

1. **Array Initialization**:
   ```java
   String fruits[] = { "apple", "mango", "banana" };
   ```
   - This line initializes an array named `fruits` containing three strings: "apple", "mango", and "banana".

2. **Variable Initialization**:
   ```java
   String largest = fruits[0];
   ```
   - Here, we initialize a string variable named `largest` with the first element of the `fruits` array, which is "apple".

3. **Loop to Find Largest String**:
   ```java
   for (int i = 1; i < fruits.length; i++) {
       if (largest.compareTo(fruits[i]) < 0) {
           largest = fruits[i];
       }
   }
   ```
   - This loop iterates through the elements of the `fruits` array, starting from index 1 (`i = 1`).
   - Inside the loop, it compares each element of the array (`fruits[i]`) with the current `largest` string using the `compareTo` method.
   - If `fruits[i]` is lexicographically larger than `largest`, it updates `largest` to `fruits[i]`.

4. **Print Result**:
   ```java
   System.out.println("The lexicographically largest fruit is: " + largest);
   ```
   - Finally, it prints out the lexicographically largest fruit found during the loop.

In summary, the code efficiently finds the lexicographically largest fruit from the array and prints it out.*/