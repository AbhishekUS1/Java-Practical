public class Main {
    // int x = 10;

    public static void main(String[] args) {
        // Main myObj = new Main();
        // System.out.println(myObj.x);
        // myObj.x = 25; // x is now 25
        // System.out.println(myObj.x);
        // System.out.println(myObj.x);
        int a = 5, b = 3, sum = 0, tot = 0, total1 = 0;
        for (int i = 1; i <= b; i++) {
            sum = a * i;
            System.out.println(sum);
            tot += sum;
            total1 = tot / b;
        }
        System.out.println("correct answer is " + total1);
    }
}