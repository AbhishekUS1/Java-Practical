package Basics.Beyondthebasics;

import java.util.Arrays;

public class ex1 {
    public static void main(String[] args) {
        System.out.println("Program was given");
        if(args.length>0) {
            System.out.println("the following arguments");
            System.out.println(Arrays.toString(args));
        }
        else {
            System.out.println("0 arguments");
        }
    }
}
// java ex1.java hello ciao
//[hello, ciao]