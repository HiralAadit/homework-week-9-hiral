package homework_week_9hiral;

//9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map

import java.util.HashMap;

public class Programme9HashMapIntegerString2 {
    public static void main(String[] args) {
        //Create a Hashmap object called people's name and age
        HashMap<String, Integer> people=new HashMap<>();
        people.put("Tony ",12);
        people.put("David ",20);
        people.put(" may",35);
        people.put("Boris",40);
        people.put("John",55);
        people.put("val",67);
        for (String i  :  people.keySet()) {
            System.out.println("key: " + i + " value: " + people.get(i));

    }
    }


    }
