package week04.collections.map.hashmap;

import java.util.HashMap;



public class HashMapExample02 {
    public static void main(String[] args) {
        HashMap<Integer ,String>languageHashMap = new HashMap<>();
        languageHashMap.put(1, "Java");
        languageHashMap.put(2, "Python");
        languageHashMap.put(3, "C");
        languageHashMap.put(4,"Java");
        System.out.println("HashMap :" + languageHashMap);

        //Belirli bir Key'e denk gelen value yu döndürür
        String value = languageHashMap.get(2);
        System.out.println("Value at key 2 :"+ value);

        //keyleri bir set olarak dönme. -> keySet();
        System.out.println("Keys : "+ languageHashMap.keySet());

        //value'ları bir set olarak dönme. -> values();
        System.out.println("Values : "+ languageHashMap.values());

        //key/value pair (çift)'ini  bir set olarak dönme.
        System.out.println("Key/Value mappings :"+ languageHashMap.entrySet());

        //Key varsa Value'sunu dön , yoksa default'ta "Not Found" dön. ->Bu key var,
        // dolayısıyla value değerini döner
        String value1= languageHashMap.getOrDefault(1,"Not Found");
        System.out.println("Value for key 1 : "+ value1);

        //Key varsa Value'sunu dön , yoksa default'ta "Not Found" dön. ->Bu key yok,
        // dolayısıyla default değerini döner
        String value2= languageHashMap.getOrDefault(5,"Not Found");
        System.out.println("Value for key 5 : "+ value2);

        //Bir key var diye kontrol etmek
        if (languageHashMap.containsKey(2)){
            System.out.println("Map contains key value of : 2 ");
        }else {
            System.out.println("Key not found.");
        }

        //Bir value var diye kontrol etmek
        if (languageHashMap.containsValue("Java")){
            System.out.println("Map contains value of Java ");
        }else {
            System.out.println("no souch value");
        }

        //Bir key ile ilişkili Value'yu değiştirmek. (replace())
        System.out.println("Original HashMap : "+languageHashMap);

        languageHashMap.replace(4,"Swift");
        System.out.println("HashMap after replace() :"+ languageHashMap);

        //Bütün value değerlerini upperCase' e  çevirmek. (replaceAll())
        languageHashMap.replaceAll((K,V) -> V.toUpperCase());
        System.out.println("Updated HashMap :" + languageHashMap);

        //Bir HashMap' ten öğeleri kaldırmak/ silmek. (remove(K))
        String value3= languageHashMap.remove(4);
        System.out.println("Removed Value : "+ value3);
        System.out.println("Updated HashMap :"+languageHashMap);

        //Bir HashMap' ten bir Key/Value çiftin kaldırmak/silmek
        Boolean isDeleted =languageHashMap.remove(3,"C");
        System.out.println("isDeleted :" + isDeleted);
        System.out.println("Updated HashMap :" + languageHashMap);



    }
}
