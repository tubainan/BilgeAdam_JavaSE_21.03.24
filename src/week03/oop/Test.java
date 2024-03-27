package week03.oop;

public class Test {
    public  static  void main(String[]args){
        ClassName className1 = new ClassName();
        System.out.println(className1.sayHello(" Tuba"));
        System.out.println(className1.sum(1,5));

        ClassName className2 = new ClassName();
        System.out.println(className2.sayHello(" Ahmet"));
        System.out.println(className2.sum(8,12));

        Person p1 = new Person();
        p1.name = "Tuba";
        p1.gender = "Female";
        p1.nickname ="Erişilemez";
        p1.sleep();
        p1.walk();

        Person p2= new Person();
        p2.name = "Ahmet Mücahit";
        p2.nickname ="Marka";
        p2.sleep();
        p2.walk();

    }
}
