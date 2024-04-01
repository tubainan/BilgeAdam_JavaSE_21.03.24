package week04.polymorphism.runtime.ornek01;

public class Main {
    public static void main(String[] args) {
        //Animal sınıfından oluşturulan bir nesne, animal tipinde bir referansla tutuluyor.
        Animal animal = new Animal();
        Animal animal2 = new Dog(); //Dog sınıfından oluşturulan bir nesne Animal tipinde bir referansla tutuluyor
        animal2.makeSound();

    }
}
