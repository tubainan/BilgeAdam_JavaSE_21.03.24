package week04.collections.arraylist;

import java.util.Arrays;
import java.util.List;

public class ArrayList06 {
    public static void main(String[] args) {
        List<Integer>numberList = Arrays.asList(1,2,3,4);
        numberList.replaceAll(number ->number*2); //Lambda expression
        System.out.println(numberList);

        for (Integer e:numberList){
            numberList.set(numberList.indexOf(e), e*2);
        }
        System.out.println(numberList);
    }
}
