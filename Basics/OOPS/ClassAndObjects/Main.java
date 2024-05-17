package ClassAndObjects;

public class Main {
    public static void main(String[] args) {
        // Classes
        // Cat rose = new Cat("Rose", 2);
        Cat rose = new Cat("Rose", 2);
        rose.meow();
        System.out.println(rose.getName());
        System.out.println(rose.getAge());
        System.out.println();

        Cat star = new Cat();
        star.setName("star");
        star.meow();
        System.out.println(star.getName());
        // System.out.println(star.getAge());

        Cat jupiter = new Cat("jupiter", 28);
        System.out.println(jupiter.getName());
        System.out.println(jupiter.getAge());
    }
}