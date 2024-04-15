package week05.consumer;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class ConsumerTest02 {
    public static void main(String[] args) {

        //1.Kullanım
        Consumer<Integer> consumer1 = x-> System.out.println(x * 2);
        Stream.of(1,2).forEach(consumer1);

        //2.Kullanım
        Consumer<Integer> consumer2 = x-> System.out.println(x);
        Stream.of(1,2).forEach(consumer2);

        //3.Kullanım
        Stream.of(1,2).forEach(x-> System.out.println(x+2));

        //4.Kullanım
        Stream.of(1,2).forEach(System.out::println);
    }
}
