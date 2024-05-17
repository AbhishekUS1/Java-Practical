package DSA.Recursion;
// Tail recursion
public class ex6 {
    static void fun(int n,int k)
    {
        if(n==0)
            return;
        System.out.println(k);
        fun(n-1,k+1);
    }

    public static void main(String[] args) {
        fun(10,1);
        //System.out.println(fact(3,1));
    }
}
