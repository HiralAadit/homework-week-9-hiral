package homework_week_9hiral;
//Write a Java program to test an array list is empty or not. Define array list with
//underground tube names

import java.util.ArrayList;

public class P7IsEmptyRemovingValue2 {
    public static void main(String[] args) {
        ArrayList<String> tubeList = new ArrayList<String>();
        {

            tubeList.add("Harrow & Wealdstone");
            tubeList.add("Watford Junction");
            tubeList.add("Eston");
            tubeList.add("Watford");
            tubeList.add("Baker Street");
            for (String tubename : tubeList) ;
            {
                System.out.println("tubename : " + tubeList);
                System.out.println("Original array list: " + tubeList);
                System.out.println("Checking the above array list is empty or not! : " + tubeList.isEmpty());
                tubeList.removeAll(tubeList);
                System.out.println("Array list after remove all elements" + tubeList);
                System.out.println("Checking the above array list is empty or not!: " + tubeList.isEmpty());
            }
        }
    }
}