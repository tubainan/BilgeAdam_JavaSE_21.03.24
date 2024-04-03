package week04.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample01 {
    public static void main(String[] args) {
        Map<String,String>map= new HashMap<>();

        HashMap<String, Integer>languaqeHashMap = new HashMap<>();

        //Elemanlar ekleyelim
        languaqeHashMap.put("Java",8);
        languaqeHashMap.put("Python",1);
        languaqeHashMap.put("JavaScript",3);
        System.out.println("HashMap: "+ languaqeHashMap);
    }
}
