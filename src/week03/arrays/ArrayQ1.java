package week03.arrays;

public class ArrayQ1 {
    //2,-9,0,5,12,-25,22,9,8,12 ,40 sayılarını bir dizi içerisine tanımlayınız. daha sonra for/foreach kullanarak
    // toplamını bulup ekrana yazdıran ve sonrasında ise ortalamasını da hesaplayan ekrana yazdıran java kodunu yazın.
    public static void main(String[] args) {
        int[] numberArr = {2,-9,0,5,12,-25,22,9,8,12};
        int toplam=0;
        double oran=0;
        for (int number: numberArr){
            toplam =toplam+number;
            oran = ((double) toplam/ numberArr.length);
        }
        System.out.println(toplam);
        System.out.println(oran);

        //for döngüsüyle olan çözüm
        for (int i=0; i<numberArr.length; i++){
            toplam +=numberArr[i];
        }
    }
}
