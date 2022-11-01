package homework_week_9hiral;
/*Write a Java program to iterate through all elements in an array list using
Iterator.

 */


import java.util.ArrayList;
import java.util.Iterator;

public class Pro5HasSetArray {
    int b[] = new int[5];
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList();


        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);
        //System.out.println("size : " + list);
       // Creating an instance of Iterator
        Iterator itr = list.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

// Q: Why hasnext

    }




}
