package Polymorphism;

public class ex4 {
    void show(int a, float b) {
        System.out.println("int float method");
    }

    void show(float a, int b) {
        System.out.println("float int method");
    }

    public static void main(String[] args) {
        ex4 e = new ex4();
        e.show(1, 1.2f); // compile time polymorphism - method overloading
        e.show(2.5f, 1); // runtime polymorphism - method overriding
    }
}
