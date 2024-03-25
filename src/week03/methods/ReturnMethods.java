package week03.methods;

public class ReturnMethods {
    public static void main(String[] args) {
        int sum = sum(5,10);
        int sum2 = sum(10,15);
        System.out.println(sum);
        System.out.println(sum2);

        int sum3= sum(sum,sum2);
    }
    public  static int sum(int number1, int number2){
        return number1+number2;
    }
}
