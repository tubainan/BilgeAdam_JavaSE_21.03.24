package week04.wrapper;

public class BoxingUnboxing {
    int number =2;
    Integer integer = number; //auto boxing
    Integer integer2 =5; //auto boxing
    int number2= integer2; //auto boxing

    //boxing
    Integer boxing =new Integer(100);
    Integer boxing2= Integer.valueOf(100);

    //Auto unboxing
    Integer number3 = 100; //auto unboxing
    int autoUnboxing = number3; //auto Unboxing

    //Unboxing
    int unBoxing = number3.intValue();
}
