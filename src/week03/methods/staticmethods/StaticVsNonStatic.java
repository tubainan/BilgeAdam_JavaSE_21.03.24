package week03.methods.staticmethods;

public class StaticVsNonStatic {
    public static void main(String[] args) {
         int sayi=15;
         int sayi2=20;
        StaticVsNonStatic staticVsNonStatic=new StaticVsNonStatic();
        System.out.println(addNumbers2(sayi, sayi2));
        System.out.println(staticVsNonStatic.addNumbers1(sayi,sayi2));
        System.out.println(StaticVsNonStatic.addNumbers2(sayi,sayi2));
    }
    public int addNumbers1(int a ,int b){
        int sum=a+b;
        return sum;
    }
    public static int addNumbers2(int a ,int b){
        return a+b;
    }
}
//Girilen bi tam sayının karesini alan bir method oluşturalım . bu method nonstatic olsub . daha sonra kullanıcıdan
// 2 adet saAYI isteyelim. bu sayılardan küçük olan sayıkardan başlayarak büyük olan sayıya kladar aradaki bütün sayıların
//karesinin methodunu alalım ve yazdıralım