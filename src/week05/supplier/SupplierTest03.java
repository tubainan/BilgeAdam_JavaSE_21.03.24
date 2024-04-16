package week05.supplier;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.function.Supplier;

//Supplier ile   LocalDate kullanımı
public class SupplierTest03 {
    // araştırma konusu ,Java da tarih formatları
    public static void main(String[] args) {
        LocalDate date = LocalDate.now(); //YYYY / MM / DD
        System.out.println(date);
        Date date1 = new Date();
        LocalDate date2 = LocalDate.ofEpochDay(0); //tarih sistemi 1970'ten beri var o yüzden miladı 1970.01.01 kabul eder
        System.out.println(date2);

        System.out.println(System.currentTimeMillis()); //1970'ten beri geçen mili saniye
        //kanıtı
        long millis = 1713255070723l;
        long second = 1713255070723l/1000l;
        long minute = second/60;
        long hour = minute/60;
        long day = hour/24;
        LocalDate date3 = LocalDate.ofEpochDay(day);
        //System.out.println(date3);

        System.out.println("--------------------------");

        //Tarih ve zaman yöntem1
        Supplier<String> curentDateTime = () -> LocalDateTime.now().toString();
        System.out.println(curentDateTime.get());

        //Tarih ve zaman yöntem2
        Supplier<LocalDateTime> supplier02 = LocalDateTime::now;
        LocalDateTime localDateTime=supplier02.get();
        System.out.println(localDateTime);

        //Tarih ve zaman yöntem3
        Supplier<String> supplier03 = () -> dtf.format(LocalDateTime.now());
        String localDateTimeFormatter = supplier03.get();
        System.out.println(localDateTimeFormatter);
    }
    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-YYYY");
}
