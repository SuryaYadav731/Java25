package Mapp;
import java.util.*;
public class Clearr {
        public static void main(String[] args)
        {
            Map<Integer, String> map = new HashMap<Integer, String>();
            map.put(10, "Surya");
            map.put(15, "4");
            map.put(20, "Yadav");
            map.put(null, "Welcomes");
            map.put(30, "You");
            System.out.println("Initial Mappings are: " + map);
            map.clear();
            System.out.println("Finally the maps look like this: " + map);
        }
    }


