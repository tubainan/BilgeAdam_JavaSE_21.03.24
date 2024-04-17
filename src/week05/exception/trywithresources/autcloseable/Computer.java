package week05.exception.trywithresources.autcloseable;

import java.io.IOException;

public class Computer implements AutoCloseable{
    public void run(){
        System.out.println("Computer is running...");
    }

    @Override
    public void close() throws IOException {

    }
}
