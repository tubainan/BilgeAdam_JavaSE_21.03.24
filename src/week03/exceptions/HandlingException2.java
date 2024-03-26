package week03.exceptions;

public class HandlingException2 {
    public static void main(String[] args) {

        String name = null;
        try {
            name.toUpperCase();
            System.out.println(name);

        }catch (NullPointerException e){
            e.printStackTrace();// try-catch'e almasak görünecek hatayı konsola yazdırır
            System.out.println(e.getMessage());
            System.out.println("Caught NullPointerException");
        }finally {
            System.out.println("Kod Bitti");
        }

    }
}
