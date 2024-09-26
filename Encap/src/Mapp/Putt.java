package Mapp;
import java.util.HashMap;
import java.util.Map;

public class Putt {
        public static void main(String[] args) {
            Map<String, Integer> map = new HashMap<>();
            map.put("One", 1);
            map.put("Two", 2);
            System.out.println("Map after adding elements: " + map);
            Integer oldValue = map.put("Two", 22);
            System.out.println("Previous value for key 'Two': " + oldValue);
            System.out.println("Map after updating 'Two': " + map);
        }
    }


