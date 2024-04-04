package week04.collections.map.hashmap;

import java.lang.management.ManagementPermission;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HashMapExample03 {
    public static void main(String[] args) {
        // List<String>list = new ArrayList<>();
       // Map<Integer,List<List<List<Integer>>>> hashMap = new HashMap<>();

        Map<String,List<String>> hashMap = new HashMap<>();
        hashMap.put("Ankara",List.of("Polatlı","Yenimahalle","Çankaya","Kazan"));
        hashMap.put("istanbul",List.of("Kadıköy","Beyoğlu","Üsküdar","Beylikdüzü"));
        Map<String,Map<String,List<String>>> nestedHashMap = new HashMap<>();
        nestedHashMap.put("Türkiye" , hashMap);
        System.out.println(nestedHashMap);


        for (Map.Entry<String,Map<String,List<String>>>entry : nestedHashMap.entrySet()){
            System.out.println(entry);
            for (Map.Entry<String,List<String>>entry1 : entry.getValue().entrySet()){
                System.out.println("\t"+ entry1.getKey());
                for (String country : entry1.getValue()){
                    System.out.println("\t\t" + country);
                }
            };
        };



    }
}
