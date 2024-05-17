package Practicals.Misc;

public class Problem1 {
    private double a;
    private double b;
    private String operation;

    public Problem1(double a, double b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    public double calculate() {
        double result = 0;
        switch (operation) {
            case "addition":
                result = a + b;
                break;
            case "subtraction":
                result = a - b;
                break;
            case "multiplication":
                result = a * b;
                break;
            case "division":
                result = a / b;
                break;
            default:
                System.out.println("Invalid operation");
        }
        return result;
    }

    public static void main(String[] args) {
        Problem1 calc = new Problem1(5, 2, "addition");
        double result = calc.calculate();
        System.out.println(result);
    }
}
/*
 * This is a Java program that defines a class named Problem1 in the package
 * Problems.
 * The class has three private instance variables: a and b of type double,
 * and operation of type String. The class has a constructor that takes three
 * arguments,
 * two doubles and a String, and assigns their values to the instance variables.
 * The class also has a public method named calculate that returns a double.
 * This method uses a switch statement to perform the calculation specified by
 * the value of the
 * operation instance variable. The possible operations are "addition",
 * "subtraction", "multiplication", and "division".
 * If the value of operation is not one of these, the method prints
 * "Invalid operation" to the standard output.
 * The class also has a main method, which is the entry point of the program.
 * This method creates an instance of the Problem1 class
 * with the values 5, 2, and "addition" for its constructor arguments. It then
 * calls the calculate method on this instance and assigns
 * its return value to a local variable named result. Finally, it prints the
 * value of result to the standard output.
 */