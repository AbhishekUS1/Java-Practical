package Polymorphism;

public class ex3 {
    void show(int a) {
        System.out.println("int method");
    }

    void show(String a) {
        System.out.println("String method");
    }

    public static void main(String[] args) {
        System.out.println('1');
        ex3 e = new ex3();
        e.show(20);
        e.show('a');// char is also treated as int in java so it will call the first method not
                    // the second one // int method
    }
}
