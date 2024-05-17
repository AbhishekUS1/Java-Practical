package Basics.Collections;

import java.util.ArrayList;
import java.util.List;

//Lists
public class ex1 {
    public static void main(String[] args) {
        List<String> colors = new ArrayList();
        colors.add("blue");
        colors.add("Purple");
        System.out.println(colors);
        for (String color : colors) {
            System.out.println(colors);
        }
        colors.forEach(System.out::println);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        // colors.add(1);
        // colors.add(new Object());
    }
}
