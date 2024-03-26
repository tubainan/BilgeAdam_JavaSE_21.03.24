package week03.exceptions;

import java.io.FileWriter;

public class CheckedException {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("file.txt");
        }catch (Exception e){
            System.out.println("Veri transferinde bir sorun oluştu");
            e.printStackTrace();
        }
    }
}
