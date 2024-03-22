package week02;

import java.util.logging.SocketHandler;

public class ArithmeticOperator {
    public static void main(String[] args) {
        //Değişken tanımlaması
        int number1 = 25 , number2 =3 , number3 =17;
        String websiteName = "Web Sitemiz: " ,websiteUrl = "www.bilgeadam.com";

        //Stringlerle ekleme operatörü kullanırsak
        System.out.println("Merhaba!\n"+ websiteName+ websiteUrl + " Sitemizi ziyaret edin!");    //sout

        //Ekleme ve Çıkarma Operatörleri
        System.out.println("A + B = " + (number1+number2));
        System.out.println("A - C = " +(number1-number3));

        //Çarpma ve Bölme Operatörleri
        System.out.println("A * B = " + (number1* number2));
        System.out.println("A / 5 = " + (number1/ 5 ));

        //Mod Alma Operatörü
        System.out.println("C % B = " + (number3 % number2));
    }
}
