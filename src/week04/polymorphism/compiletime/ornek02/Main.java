package week04.polymorphism.compiletime.ornek02;

public class Main {
    public static void main(String[] args) {
        Calculator cal = new Calculator();

        System.out.println(cal.sum(10,20));
        System.out.println(cal.sum(10.5, 20.5));
        System.out.println(cal.sum(10,20,30));
        System.out.println(cal.sum(10,20,30,40));

    }
}

