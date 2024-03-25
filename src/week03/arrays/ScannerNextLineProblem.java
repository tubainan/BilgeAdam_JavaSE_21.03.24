package week03.arrays;

import java.util.Scanner;

public class ScannerNextLineProblem {
    public static void main(String[] args) {

        int toplam= 0;
        int sayi;

        do{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Lütfen Bir sayı giriniz : ");
            sayi = scanner.nextInt();
            if (sayi== 0){
                System.out.println("0 sayısını girdiniz.Girilen sayıların toplamı hesaplanıyor..");
                break;
            }
            toplam += sayi;
        }while (true);
        System.out.println("Sayıların toplamı =" + toplam);
    }
}
