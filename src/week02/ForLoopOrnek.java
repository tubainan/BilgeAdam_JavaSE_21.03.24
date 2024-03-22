package week02;

import java.util.Scanner;

public class ForLoopOrnek {
    public static void main(String[] args) {
        //1'den başlayarak kullanıcının dışarıdan girdiği sayıya kadar olan
        //  sayıların 1 fazlasının toplamını ekrana yazdıran algoritma

        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz :");
        int toplam=0;
        int sayi= scanner.nextInt();
        for (int i=1; i<=sayi; i++){
            toplam = toplam+(i+1);
        }
        System.out.println(toplam);
    }
}
