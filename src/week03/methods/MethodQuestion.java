package week03.methods;

import java.security.PublicKey;
import java.util.Scanner;

public class MethodQuestion {
    /*Girilen bi tam sayının karesini alan bir method oluşturalım . bu method nonstatic olsub . daha sonra kullanıcıdan
    2 adet saAYI isteyelim. bu sayılardan küçük olan sayıkardan başlayarak büyük olan sayıya kladar aradaki bütün sayıların
    karesinin methodunu alalım ve yazdıralım  */
    public static void main(String[] args) {
        MethodQuestion methodQuestion = new MethodQuestion(); //-> MethodQuestion()->constructor method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz : ");
        int num1 = scanner.nextInt(); // ->scanner.nextInt()+"\n";
        scanner.nextLine();
        System.out.print("Lütfen 2. sayıyı giriniz : ");
        int num2 = Integer.parseInt(scanner.nextLine()); // Integer.parseInt("\n"),
        int min;
        int max;
        if (num1 > num2) {
            max = num1;
            min = num2;

        } else {
            max = num2;
            min = num1;
        }
        for (int i = min; i <= max; i++) {
            System.out.println(methodQuestion.getSquare(i));
        }
       /* min= Math.min(num1, num2);
        max Math.max(num1 , num2);
        System.out.println(min);
        System.out.println(max);*/
    }
    public long getSquare(int number){
        return (long) Math.pow(number,2); //
       // return  number*number
    }
}


