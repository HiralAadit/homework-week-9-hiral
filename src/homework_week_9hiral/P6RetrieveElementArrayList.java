package homework_week_9hiral;
//Write a Java program to retrieve an element (at a specified index) from a given
     //   array list

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class P6RetrieveElementArrayList {
    public static void main(String[] args){
        //Create list of elements 5 elements
        ArrayList<String> list_String = new ArrayList<String>();
        list_String.add("Water");
        list_String.add("Air");
        list_String.add("Sky");
        list_String.add("Earth");
        list_String.add("Fire");
        //Print the list
        System.out.println(list_String);
        //Retrieve the first and third element
        String element = list_String.get(0);
        System.out.println("First_String: " +element);
       element = list_String.get(2);
        System.out.println("Third element : " +element);
    }

}
