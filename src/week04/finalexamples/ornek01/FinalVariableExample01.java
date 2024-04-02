package week04.finalexamples.ornek01;

public class FinalVariableExample01 {
    private static final double PI =3.14159;  //final değişkenler büyük harfle yazılır

    public static void main(String[] args) {
        final int age =10;
        System.out.println(age);
        //age = 25; //-> Bunu uygulayamayız age değişkeni final olduğu için
        System.out.println(age);
    }
}
