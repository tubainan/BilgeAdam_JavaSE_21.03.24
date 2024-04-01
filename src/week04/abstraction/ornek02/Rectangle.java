package week04.abstraction.ornek02;

public class Rectangle extends Shape{

    private double width;
    private double height;

    Rectangle(double width,double height){
        this.width =width;
        this.height =height;
    }

    @Override
    public double calculateArea() {
        return width*height;
        //2.yöntem:
    }// alt + insert -> implement method

    //1.yöntem , elle yazarız
//    @Override
//    public double calculateArea(){
//        return 0.0;
//    }
}
