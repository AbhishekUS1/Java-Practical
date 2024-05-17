package DSA.Recursion;
// N to 1
public class ex4 {
    static void p1(int n)
    {
        if(n==0)
            return;
        System.out.println(n);
        p1(n-1);
    }
    public static void main(String[] args) {
        p1(10);
    }
}
