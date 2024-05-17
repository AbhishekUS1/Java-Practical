package AccessModifiers;

public class Main {
    public static String foo = "bar";
    private static String foo1 = "bar";

    public static void main(String[] args) {
        System.out.println(foo1);
    }
}
