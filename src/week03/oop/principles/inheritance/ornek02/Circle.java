package week03.oop.principles.inheritance.ornek02;

public class Circle extends  Shape{
    double radius;

    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    void draw() {
        System.out.println("Drawing a circle");
    }

    @Override
    double calculateArea() {
        return Math.PI*radius*radius;
    }
}
