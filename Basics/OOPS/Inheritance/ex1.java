package Inheritance;

public class ex1 {
    public static void main(String[] args) {
        Mammal m = new Mammal();
        m.legs = 10;
        System.out.println(m.legs);
        m.eat();
        Dog d = new Dog();
        d.breed = "tommy";
        System.out.println(d.breed);
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

// Derived class
/*
 * class fish extends Animal{
 * int fins;
 * void swim()
 * {
 * System.out.println("Swims");
 * }
 * }
 */
class Mammal extends Animal {
    int legs;
}

class Dog extends Mammal {
    String breed;
}