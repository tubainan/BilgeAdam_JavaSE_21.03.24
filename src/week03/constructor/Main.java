package week03.constructor;

public class Main {
    private String name;
 Main(){
     System.out.println("Constructor Called....");
     name= "Contructor name field.";
 }
    public static void main(String[] args) {
        Main obj = new Main();
        Main obj2= new Main();
       // obj.name = "Contructor name field.";
        //obj2.name= "Contructor name field.";
        System.out.println("The name is : " + obj.name+ "\nthe second name is : " + obj.name);

    }
}
