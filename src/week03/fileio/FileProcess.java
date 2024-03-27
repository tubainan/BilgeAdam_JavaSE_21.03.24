package week03.fileio;

import javax.imageio.IIOException;
import java.io.File;
import java.io.IOException;

public class FileProcess {
    public static void main(String[] args) throws IOException {
        File directory = new File("myDir");
        boolean bool = directory.mkdir();
        System.out.println(bool);   //false -> klasör zaten var

        File file= new File(directory,"file");
        bool = file.createNewFile();
        System.out.println(bool);      //false -> dosya zaten var
        bool= file.delete();
        System.out.println(bool);      // true ->dosya silindi
        bool = directory.delete();
        System.out.println(bool);      //true ->içerisinde bir dosya olmadığı için artık klasörüde silebilirim

    }
}
