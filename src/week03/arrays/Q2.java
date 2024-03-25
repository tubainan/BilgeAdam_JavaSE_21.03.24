package week03.arrays;

import java.util.Scanner;

public class Q2 {
    // 0 sayısı girilene kadar sayıların toplamını veren program
    //kullanıcıdan 0 girene kadar hep sayılar alan ve 0 girdiğinde o zamana kadar girdiiği tüm sayıların
    // toplamını ekrana yazdıran java kodunu yazınız
    public static void main(String[] args) {

        int toplam= 0;
        int sayi;
        while (true){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen Bir sayı giriniz : ");
            sayi = scanner.nextInt();
            if (sayi== 0){
                System.out.println("0 sayısını girdiniz.Girilen sayıların toplamı hesaplanıyor..");
                break;
            }
            toplam += sayi;

        }

    }
}
