package week03.oop.principles.encapsulation;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();

        p1.setName("Tuba");
        p1.setLastname("inan");
        p1.setAge(19);
        p1.setTcKimlik("12345678910");
        System.out.println("isim : "+p1.getName()
                     +"\nSoyisim : "+p1.getLastname()
                     +"\nYaş :"+p1.getAge());

        System.out.println();
    }
}
