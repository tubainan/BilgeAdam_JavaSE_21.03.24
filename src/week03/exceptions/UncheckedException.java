package week03.exceptions;

public class UncheckedException {
    //->Runtime hataları yani çalışma zamanında gerçekleşen hatalar
    public static void main(String[] args) {
        String name = null;

        //kötü kod  yaklaşımı
        try{
            if(name.equals("Tuba")){
                System.out.println("name: Tuba");
            }
        }catch (NullPointerException e){
            System.out.println("Catch!");
        }
        //idare eder, fena değil kod yapısı
        if (name !=null && name.equals("Tuba")){
            System.out.println("name : Tuba");
        }
        //En iyi kod yapısı
        if ("Tuba".equals(name)){
            System.out.println("name: Tuba");
        }
        // null değerler sadece objelere verilebiilir
    }
}
