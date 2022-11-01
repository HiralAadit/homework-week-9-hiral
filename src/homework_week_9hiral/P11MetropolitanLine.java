package homework_week_9hiral;

import java.util.HashMap;

public class P11MetropolitanLine {
    public static void main(String[] args) {
       HashMap<String,Integer>metropolitanLine = new HashMap<>();

        metropolitanLine.put("Oxford Circus",1);
        metropolitanLine.put("Regent's Park",2);
        metropolitanLine.put("Baker Street",3);
        metropolitanLine.put("Marylebone",4);
        metropolitanLine.put("Paddington",5);
        for (String i :metropolitanLine.keySet()){
            System.out.println("key: " + i + " value: "+ metropolitanLine.get(i));//
        }

    }



}
