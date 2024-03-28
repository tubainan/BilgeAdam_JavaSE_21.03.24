package week03.constructor;

public class ConstructorOverloading {
    String country ;
    String language;

    ConstructorOverloading(String country, String Language ){

    }
    ConstructorOverloading(String country){  //Parameterized Constructor(Parametreli C)
        this.country = country;
    }
    ConstructorOverloading(){   //NoArgsConstructor

    }

    public static void main(String[] args) {
        //no-args-constructor. Şu an herhangi bir constructor tanımlanmadığı için default constructor
        //olarak bana no-args-constructor java tarafından getirilir
        ConstructorOverloading obj1 =new ConstructorOverloading();
        obj1.country = "Turkey";
        obj1.language ="Turkish";
        System.out.println(obj1.country+ " "+obj1.language);
        /*
        1.'de NoArgsConstructor kullandık. iki field'ın değerini de
         nesneyi oluşturduktan sonra , ayrı ayrı atadık

         */
        ConstructorOverloading obj2 =new ConstructorOverloading();
        obj2.country = "Turkey";
        obj2.language ="Turkish";
        System.out.println(obj2.country+ " "+obj2.language);
        /*Parameterized Constructor kullandık. Fieldların birinin değerini nesneyi
         oluştururken ragüman olarak verdik (country),diğerini ise nesneyi oluşturduktan
          sonra ,dışarıdan atamasını yaptık.*/

        ConstructorOverloading obj3 =new ConstructorOverloading();
        obj3.country = "Turkey";
        obj3.language ="Turkish";
        System.out.println(obj3.country+ " "+obj3.language);

        /* 3.'de bütün fieldları Parameterized Constructor ile aldık.Dolayısıyla dışarıdan değer ataması
         yapmama gerek kalmadı. Nesneyi oluştururken içine de doldurdum . AllArgsConstructor */
    }
}
