package homework_week_9hiral;

//9. Create a HashMap object called people that will store String keys and Integer
//values: And use for each loop to iterate the value from Map

import java.util.HashMap;

public class Programme9HashMapIntegerString {
    public static void main(String[] args) {
        //Create a Hashmap object called people's name and age
        HashMap<String, Integer> people = new HashMap<>();
        people.put("Tony", 12);
        people.put("Mony", 25);
        people.put("Jony", 30);
        people.put("Rony", 40);
        people.put("Dhony", 50);
        for (String i : people.keySet()) {
            System.out.println("Key : " + i + " value : "  +  people.get(i));
        }

    }
}