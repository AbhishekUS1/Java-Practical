package Basics.Arrays;

public class ex4 {
    public static int fun(int n)
    {
        if(n==0)
        {
            return 0;
        }
        else {
            fun(n-1);
            System.out.println(n);
        }
        return n;
    }
    public static void main(String[] args) {
        fun(10);
    }
}
