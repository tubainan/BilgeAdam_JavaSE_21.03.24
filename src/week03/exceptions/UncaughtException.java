package week03.exceptions;

public class UncaughtException {
    public static void main(String[] args) {
        UncaughtException uncaughtException = new UncaughtException();
        String name = null;
        uncaughtException.method1(name);
    }
    public void method1(String name){
        System.out.println("Method1");
        try{
            method2(name);
        }catch (NullPointerException e){
            System.out.println("Cught NPE");
        }
        System.out.println("Method1 worked!");
    }
    public void method2(String name){





    }
}
