package DSA.Recursion;
// 1 to 10
public class ex5 {
    static void p1(int n)
    {
        if(n==0)
            return;
        p1(n-1);
        System.out.println(n);
    }

    public static void main(String[] args) {
        p1(10);
    }
}
