package week02;

public class LogicalOperator {
    public static void main(String[] args) {
        String username = "tubainan";
        int password = 123456789;
        String str1 = "Tuba";
        String  str2 = "Tuba";

//        System.out.println(str1==str2);
//
//        String str3= new String("Tuba");
//        String str4= new String("Tuba");
//
//        System.out.println(str3.equals(str4));

         System.out.println(username.equals("tubainan"));
         System.out.println(username.equals("tubinan"));
         System.out.println(password == 123456789);
         System.out.println(password == 123456);

        if(username.equals("Tubainan") && password==123456789){
            System.out.println("Giriş Başarılı");
        }
        int character = 'A';
        int character2 = 'a';

        System.out.println(character + "\t" +character2);
    }
}
