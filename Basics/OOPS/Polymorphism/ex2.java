package Polymorphism;

// can we overload method
public class ex2 {
    // void show(int a) {
    // System.out.println('1');
    // }

    // void show(String a) {
    // System.out.println('2');
    // }

    public static void main(String[] args) {
        System.out.println('1');
        ex2 e = new ex2();
        e.main(20);
    }

    public static void main(int a) {
        System.out.println('2');
    }
}
