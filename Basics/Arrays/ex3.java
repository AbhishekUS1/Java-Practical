package Basics.Arrays;

// Linear search
public class ex3 {
    public static int linearSearch(int numbers[], int key) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == key) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch1(String menu[], String key) {
        for (int i = 0; i < menu.length; i++) {
            if (menu[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 10, 20, 30, 40, 50 };
        int key = 50;
        int index = linearSearch(numbers, key);
        if (index == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index);
        }

        String menu[] = { "dosa", "chole bhature", "samosa" };
        String key1 = "samosa";
        int index1 = linearSearch1(menu, key1);
        if (index1 == -1) {
            System.out.println("Key not found");
        } else {
            System.out.println("Key found at index: " + index1);
        }
    }
}
