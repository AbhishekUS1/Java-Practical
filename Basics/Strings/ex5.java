package Basics.Strings;

public class ex5 {
    public static void main(String[] args) {
//        StringBuilder sb=new StringBuilder(""); // initialized with the empty string
//        for(char ch='a'; ch<='z'; ch++)
//        {
//            sb.append(ch);
//        }
//        System.out.println(sb);
        String str="";
        for(char ch='a'; ch <='z'; ch++)
        {
            str+=ch;
        }
        System.out.println(str);
    }
}
