package DSA.Recursion;
// 1 to N
public class ex1 {
    /*public static int fun(int n)
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
    }*/
        static void printNumbers(int n) {
            if (n <= 0) {
                return;
            }
            printNumbers(n - 1);
            System.out.print(n + " ");
        }

        public static void main(String[] args) {
            int n = 10;
            printNumbers(n);
        }
    }