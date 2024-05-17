package Basics;

public class ex1 {
    public static void main(String[] args) {
        Pen pen = new Pen();
        pen.setColor("Blue");
        System.out.println(pen.getColor());
        pen.setTip(12);
        System.out.println(pen.getTip());
        BankAccount myAcc = new BankAccount();
        myAcc.username = "Abhi";
        myAcc.setPassword("dkldgnlkg");

    }
}

class BankAccount {
    public String username;
    private String password;

    public void setPassword(String pwd) {
        this.password = pwd;
    }
}

class Pen {
    private String color;
    private int tip;

    String getColor() {
        return this.color;
    }

    void setColor(String newColor) {
        this.color = newColor;
    }

    int getTip() {
        return this.tip;
    }

    void setTip(int newTip) {
        this.tip = newTip;
    }
}

class Student {
    String name;
    int age;
    float percentage;

    void calculate(int phy, int chem, int math) {
        percentage = (float) (phy + chem + math) / 3;
    }
}