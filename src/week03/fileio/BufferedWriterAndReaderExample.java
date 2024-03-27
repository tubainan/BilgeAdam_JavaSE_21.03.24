package week03.fileio;

import week02.WhileLoop;

import java.io.*;

public class BufferedWriterAndReaderExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw= new FileWriter("buffered.txt");
        BufferedWriter bw= new BufferedWriter(fw);
        bw.write("hello");
        bw.write("world");
        bw.newLine();
        bw.write("java");
        bw.close();
        fw.close();

        FileReader fr = new FileReader("buffered.txt");
        BufferedReader br =new BufferedReader(fr);

        String data = null;
        while ((data= br.readLine())!=null) {
            System.out.println(data);
        }
        fr.close();
        br.close();
    }
}
