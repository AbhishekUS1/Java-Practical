package Polymorphism;

class Test {
    void show(String a) {
        System.out.println(a);
    }

    void show(int a, int b) {
        System.out.println("1");
    }
}

public class ex1 {
    public static void main(String[] args) {
        Test t = new Test();
        t.show("Hello");
        t.show(1, 2);
    }
}