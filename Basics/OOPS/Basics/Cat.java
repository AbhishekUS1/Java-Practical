package Basics;

public class Cat {
    private String name;

    void meow() {
        System.out.println(name + ": meow ");
    }

    public void setName(String name) {
        this.name = name;
    }
}
