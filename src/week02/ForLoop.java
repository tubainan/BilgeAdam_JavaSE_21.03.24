package week02;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // scanner. nextInt(), scanner.nextLong() ,scanner.nextDouble(),
        // scanner.nextFloat(), scanner.nextLine();
        int deger, count=1;
        System.out.print("Lütfen bir tamsayı giriniz: ");
        deger = scanner.nextInt();
        for (int i =1; i<=deger; i++) {
            if (i % 2 == 0){
                count++;
            }
        }System.out.println(deger+ " Sayısına kadar olan Çift Sayısı: " + count);
    }
}
