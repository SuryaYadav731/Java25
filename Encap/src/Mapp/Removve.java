package Mapp;
import java.util.*;
public class Removve {
        public static void main(String[] args)
        {
            Map<Integer, String> map = new HashMap<>();
            map.put(1, "One");
            map.put(3, "Three");
            map.put(5, "Five");
            map.put(7, "Seven");
            map.put(9, "Nine");
            System.out.println(map);
            map.remove(3);
            System.out.println(map);
            map.remove(1);
            System.out.println(map);
        }
    }


