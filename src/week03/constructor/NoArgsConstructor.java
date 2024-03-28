package week03.constructor;
/*Bu sınıfın içerisinde isim,soyisim ve ülke fieldları olsun.Ülke fieldını içeriden atayan bir
  parametresiz constructor oluşturalım.
* Ülke değeri bir nesne oluşturulması durumunda direct olarak "Türkiye" değerini alsın.
* Sonrasında bu sınıftan 3 adet nesne üretip , isim , soyisim bilgilerini doldurup, ülkelerinin
* konsol çıktılarını alalım.*/
public class NoArgsConstructor {
    //Konsol çıktılarını alalım
    String isim;
    String soyisim;
    String ulke;
    //Parametresiz constructor
    public NoArgsConstructor(){
        ulke = "Türkiye";
    }

    public static void main(String[] args) {
    /*3 adet nesne üretip , isim , soyisim bilgilerini doldurup, ülkelerinin
* konsol çıktılarını alalım.*/
        NoArgsConstructor nesne1 = new NoArgsConstructor();
        nesne1.isim = "Tuba";
        nesne1.soyisim = "Kalite";

        NoArgsConstructor nesne2 = new NoArgsConstructor();
        nesne2.isim = "Gamze";
        nesne2.soyisim = "Farketmez";

        NoArgsConstructor nesne3 = new NoArgsConstructor();
        nesne3.isim = "Ahmet";
        nesne3.soyisim = "Marka";

        System.out.println("Kişinin Adı : " +nesne1.isim);
        System.out.println("Kişinin Soyadı : " +nesne1.soyisim);
        System.out.println("Kişinin Ülkesi : " +nesne1.ulke);
        System.out.println("Kişinin Adı : " +nesne2.isim);
        System.out.println("Kişinin Soyadı: " +nesne2.soyisim);
        System.out.println("Kişinin Ülkesi : " +nesne2.ulke);
        System.out.println("Kişinin Adı : " +nesne3.isim);
        System.out.println("Kişinin Soyadı : " +nesne3.soyisim);
        System.out.println("Kişinin Ülkesi : " +nesne3.ulke);

    }
}
