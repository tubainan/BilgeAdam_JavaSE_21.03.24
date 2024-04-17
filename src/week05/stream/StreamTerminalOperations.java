package week05.stream;

import java.util.*;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.Arrays.stream;

public class StreamTerminalOperations {
    public static void main(String[] args) {
        //count() -> sonlu bir Stream'deki ögelerin sayısını belirler
        Stream<String> s2 = Stream.of("k1","k2","k3");
        long countElement = s2.count();
        System.out.println(countElement);

        //min() , max() String veya Array'in minimum veya maximum değerlerini buulabiliriz
        Stream<String> stream01 = Stream.of("eagle","lion","racoon");
        Stream<String> stream02 = Stream.of("eagle","lion","racoon");

        Comparator<String> comp =Comparator.comparingInt(String::length);

        Optional<String> min = stream01.min(comp);
        Optional<String> max = stream02.max(comp);

        System.out.println(min);
        System.out.println(max);

        String[] stringArr = "merhaba dünya ben Alperen, nasılsın?".split(" ");

        System.out.println(stream(stringArr).min(String::compareTo).get());
        System.out.println(stream(stringArr).max(String::compareTo).get());

        Comparator<String> lengthCompare = Comparator.comparingInt(String::length);
        System.out.println(stream(stringArr).min(lengthCompare).get());

        // findAny() & findFirst()
        //findAny() -> Stream'deki öğelerden birini döndürür
        //Stream'de hiçbir öğe yoksa boş bir Optional<T> object döndürür

        //findFirst() Stream'deki ilk öğeyi döndürür.Hiçbir öğe yoksa  Optional<T> nesnesi döndürür
        //findFirst() akışın ilk öğelerini döndürür ancak findAny() akıştaki herhangi bir öğeyi
        // seçmekte özgürdür.(Özellikle paralel Stream kullandığımızda )

        Stream<String> s = Stream.of("monkey","gorilla","dog");
        Stream<String> infinite = Stream.generate(() -> "chimp");

        s.findAny().ifPresent(System.out::println);
        infinite.findAny().ifPresent(System.out::println);

        OptionalDouble temperature = DoubleStream.of(-10.1,-5.0,30.0,7.3,41.2,2.2)
                .filter(temp -> temp>0)
                .findFirst();

        OptionalDouble temperature2 = DoubleStream.of(-10.1,-5.0,30.0,7.3,41.2,2.2)
                .filter(temp -> temp>0)
                .findFirst();

        System.out.println(temperature);
        System.out.println(temperature2);

        //anyMatch() , allMatch() , noneMatch()
        List<String> list =Arrays.asList("monkey","2","chimp");

        Stream<String> infinite01 = Stream.generate(() -> "chimp");
        Stream<String> infinite02 = Stream.generate(() -> "chimp");

        Predicate<String> pred = x -> Character.isLetter(x.charAt(0));
        //anyMatch() Stream'de verilen Predicate ile eşleşen herhangi bir öğe varsa true değerini döndürür
        //Stream boşsa veya eşleşen öğe yoksa false değerini döndürür.
        System.out.println(list.stream().anyMatch(pred)); //true döndü

        //allMatch() yalnızca Stream'deki tüm öğelerin verilen Predicate ile eşleşmesi durumunda true değerini döndürür
        //Stream boşsa true değerini döndürür.
        System.out.println(list.stream().allMatch(pred));  //false döndü

        //noneMatch() yalnızca Stream'deki öğelerin hiçbiri verilen Predicate ile eşlenmediğinde true değerini döndürür.
        //Stream boşsa true değerini döndürür.
        //Sonsuz Streamler için için sonlandırılabilir, sonlandırılmayabilir(verilere bağlıdır.)
        System.out.println(list.stream().noneMatch(pred)); //false döndü

        //infinitive
        System.out.println(infinite01.anyMatch(pred)); //true döndü
        //System.out.println(infinite01.stream().allMatch(pred)); //false döndü // -> endLess loop

        System.out.println(infinite02.noneMatch(pred));  //false döndü

        //forEach() pipeline'daki terminal işlemidir
        Stream<String> s01 = Stream.of("Monkey", "Gorilla", "Chimp");
        //s01.forEach(System.out::println);

        List<String> list01 = new ArrayList<>();
        s01.forEach((str) -> {
            String sUpper = str.toUpperCase();
            list01.add(sUpper);
        });
        System.out.println(list01);

        //map() vs forEach()

        List<Integer>numbers = Arrays.asList(1,2,3,4,5);
        numbers.forEach(number -> System.out.println(number*2));
        System.out.println(numbers);

        //map()
        //1.yol
        List<Integer> mappedNumbers= numbers.stream()
                .map(number -> number*2)
                .map(number -> number*2)
                .collect(Collectors.toList())
                .stream().map(number -> number*2)
                .collect(Collectors.toList());
        System.out.println(mappedNumbers);
        //2.yol
//        List<Integer> mappedNumbers= numbers.stream()
//                .map(number -> number*2)
//                .map(number -> number*2)
//                .collect(Collectors.toList());
//        mappedNumbers.forEach(System.out::println);
//        mappedNumbers=mappedNumbers.stream().map(number-> number*2).collect(Collectors.toList());


        System.out.println(mappedNumbers);

        Stream<Integer> stream =Stream.of(3,5,6);
        Stream<Integer> stream2 =Stream.of(3,5,6);

        System.out.println(stream.reduce(10,(a,b) -> a*b));
        //10,3 -> 10*3 => 30, a=30
        //30,5 -> 30*5 => 150, a=150
        //150,6 -> 150*6 => 900, a=900
        //900,null -> girmiyor => return a
        System.out.println(stream2.reduce((a,b) -> a*b));
        //3,5 -> 3*5 => 15, a=15
        //15,6 -> 15*6 =>90, a=90
        //90,null -> girmiyor => return a

        List<Integer> intList = List.of(3,5,6);
        int a= 0;
        int b= 0;
        for (int i= 0; i<intList.size(); i++){
            if (i==0){
                a = intList.get(i);
            }
            if (i != intList.size()-1){
                b = intList.get(i+1);
            }else {
                System.out.println(a);
                break;
            }
            a = a*b;
        }
        Optional<Integer> total = Optional.of(1);
        if (intList.size() ==0){
            System.out.println(Optional.empty());
        }else {
            for (int i = 0 ; i<intList.size(); i++){
                total = Optional.of(total.get() * intList.get(i));
            }
            System.out.println(total);
        }
        Stream<String> stream03 = Stream.of("w1","o2","l3","f4");
        //String word = stream03.reduce("X",(x,y) ->x.concat(y));   böyle de yazılabilir
        String word = stream03.reduce("X",String::concat);
        System.out.println(word);

        Stream<String> stream04 = Stream.of("w","o","l","f");
        String word2 = stream04.reduce("",(c, d) -> c+"--"+d);
        System.out.println(word2);

        //collect
        String frenchCounting = "un:deux:trois:quatre";
//        List<String> gmailList = Arrays.stream(Pattern.compile(":")
//                .split(frenchCounting)).collect(Collectors.toList());
        List<String>gmailList = Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toList());
        System.out.println(gmailList);

        List<String> gmailList2 = List.of(frenchCounting.split(":"));
        System.out.println(gmailList2);


        //collect(Collectors.toSet())
        Set<String> gmailSet =Pattern.compile(":")
                .splitAsStream(frenchCounting).collect(Collectors.toSet());
        System.out.println(gmailSet);

        //collect(Collectors.toMap())
        Map<String, Integer> nameLength = Stream.of("Albus","Percival","Wulfric","Brian","Dumbledore")
                .collect(Collectors.toMap(name -> name, String::length));
        System.out.println(nameLength);

        Optional<String> name = Stream.of("Albus","Percival","Wulfric","Brian","Dumbledore")
                .reduce(String::concat);

        Map<String, Integer> nameLength2 = Stream.of(name.get())
                .collect(Collectors.toMap(name2 -> name2, String::length));
        System.out.println(nameLength2);

        //StringBuilder();
        Stream<String> stream05 = Stream.of("w","o","l","f");
        StringBuilder word3 = stream05
                .collect(StringBuilder::new
                        //(a,b)
                ,StringBuilder::append //a
                ,StringBuilder::append); //b
        System.out.println(word3);

        Stream<String> stream06 = Stream.of("w","o","l","f");
        TreeSet<String> set = stream06.collect(Collectors.toCollection(TreeSet::new));
        System.out.println(set);




    }
}
