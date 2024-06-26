package week04.collections.list.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayList03 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Java");
        nameList.add("Python");
        nameList.add("C#");

//        List<String> nameList2 = new ArrayList<>();
//        nameList2.addAll(List.of("java","Python","C#"));
//        nameList2.addAll(nameList); -> Bu şekilde de listeye atama yapılabilir
//    }      Bir listeye başka bir listeyi addAll() yardımıyla aktarabilirim

        //Listenin bir elemanını değiştirme
        System.out.println("List before set :"+nameList);
        nameList.set(1,"Scala");
        System.out.println("List after set :"+nameList);

        //Listenin bir elemanını indexle çıkarma(listeden silme)
        System.out.println("List before Remove :"+nameList);
        nameList.remove(2);
        System.out.println("List after Remove :"+nameList);

        //Listenin bir elemanını içeriğiyle çıkarma(Listeden silme)
        System.out.println("List before Remove :"+nameList);
        nameList.remove("Scala");
        System.out.println("List after Remove :"+nameList);
}
}
