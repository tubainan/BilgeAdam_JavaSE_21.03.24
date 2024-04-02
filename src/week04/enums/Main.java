package week04.enums;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(Size.SMALL);
        System.out.println(Size.MEDİUM);
        Test test = new Test(Size.EXTRALARGE);
        test.orderPizza();

        System.out.println("---ORDİNAL---");
        //Ordinal() metodu bana index değerini döner
        System.out.println(Size.SMALL.ordinal());
        System.out.println(Size.MEDİUM.ordinal());
        System.out.println(Size.LARGE.ordinal());
        System.out.println(Size.EXTRALARGE.ordinal());

        System.out.println("\n---compareTo---");
        System.out.println(Size.SMALL.compareTo(Size.MEDİUM));
        System.out.println(Size.MEDİUM.compareTo(Size.SMALL));
        System.out.println(Size.EXTRALARGE.compareTo(Size.SMALL));

        System.out.println("\n---toString---");
        System.out.println(Size.EXTRALARGE.toString());
        String str1= Size.EXTRALARGE.toString();
        if (Size.EXTRALARGE.toString().equals("EXTRALARGE")){
            System.out.println("toString equals");
        }

        System.out.println("\n---name method---");
        if (Size.EXTRALARGE.name().equals("Extralarge")){
            System.out.println("equals name method");

        }
        System.out.println("\n---valueOf methos---");
        if (Size.EXTRALARGE==Size.valueOf("EXTRALARGE")){
            System.out.println("equals valueOf method");
        }

        System.out.println("\n---values method---");
        Size[] sizeArr = Size.values();
        List<Size>sizeList = Arrays.asList(Size.values());

        for (Size size : Size.values()){
            System.out.println(size);
        }
    }
}
