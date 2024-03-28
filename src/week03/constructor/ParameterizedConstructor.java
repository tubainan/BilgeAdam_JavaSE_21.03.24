package week03.constructor;
/*Ad, syad, yaş ve cinsiyet fieldlarını belirleyelim. ve sonrasında bu sınıfın 2 adet nesnesini
oluşturalım .Bu nesnelerin yaş ve cinsiyet değerleri ,constructor parametresinden oluşturma anında
verilsin. Diğer 2 değeri elle girelim.*/
public class ParameterizedConstructor {
    String name;
    String surname;
    int age;
    String gender;
    ParameterizedConstructor(int age, String gender){
        //isim çakışması olacağı için "this." anahtar kelimesini kullanrak sınıfımın
        // field'ı olan age 'e erişeceğimi belirtiyorum
        this.age= age;
        this.gender=gender;
    }
    public static void main(String[] args) {
        ParameterizedConstructor obj1 = new ParameterizedConstructor(24,"Bayan");
        ParameterizedConstructor obj2 = new ParameterizedConstructor(22,"Erkek");
        obj1.name = "Tuba ";
        obj1.surname= "Kalite";

        obj2.name = "Ahmet";
        obj2.surname= "Marka";
//Nesne bilgilerini yazalım
        System.out.println("Kişinin Adı : "+ obj1.name);
        System.out.println("Kişinin Soyadı : "+obj1.surname);
        System.out.println("Kişinin yaşı : "+obj1.age);
        System.out.println("Kişinin Cinsiyeti"+obj1.gender);

        System.out.println("Kişinin Adı : "+obj2.name);
        System.out.println("Kişinin Soyadı : "+obj2.surname);
        System.out.println("Kişinin yaşı : "+obj2.age);
        System.out.println("Kişinin Cinsiyeti"+obj2.gender);

        System.out.println("Kişinin Adı : "+ obj1);
        System.out.println("Kişinin Soyadı : ");
        System.out.println("Kişinin yaşı : ");
        System.out.println("Kişinin Cinsiyeti");
    }

}
