package week04.collections.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayList02 {
    public static void main(String[] args) {
        List<String> animalList =new ArrayList<>();
        animalList.add("Kedi");
        animalList.add("köpek");
        animalList.add("kirpi");
        animalList.add("Rakub");
        animalList.add("Arı");

        System.out.println("ArrayList :"+ animalList);

        String str = animalList.get(1);
        System.out.println("Element at index 1 is :"+str);
        int i = 0;
        System.out.println("Element at index 0 is :"+ animalList.get(i));
    }
}
