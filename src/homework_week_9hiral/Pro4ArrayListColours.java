package homework_week_9hiral;
//Write a Java program to create a new array list, add some colours (string) and
//printout the collection using for each loop

import java.util.ArrayList;

public class Pro4ArrayListColours {
    int a[] = new int[5];

    public static void main(String[] args) {
        ArrayList<String>list_String = new ArrayList<String>();

        list_String.add("Red");
        list_String.add("Orange");
        list_String.add("Green");
        list_String.add("Yellow");
        list_String.add("Blue");
        System.out.println(list_String);
    }
}
