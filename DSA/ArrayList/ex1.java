package DSA.ArrayList;

import java.util.ArrayList;

public class ex1 {
    public static void main(String[] args) {
        //Classname objectname=new Classname()
        ArrayList<Integer> list=new ArrayList<>();
        ArrayList<Integer> list2=new ArrayList<>();
        ArrayList<Integer> list3=new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        //get operation
        /*int element=list.get(2);
        System.out.println(element);*/

        //remove operation
        //list.remove(2);
        //System.out.println(list);

        //set element at index
        list.set(2,10);
        System.out.println(list);

        //contains
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        //.Size()
        System.out.println(list.size() + " size");
    }
}
