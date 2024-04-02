package week04.abstraction.absractexample;

public class Game {



    public static void main(String[] args) {
        Enemy goblin= new Goblin();
        Enemy zombie = new Zombie();
        goblin.attack();
        zombie.attack();

        zombie.takeDamage(20);
        zombie.takeDamage(30);
        zombie.takeDamage(60);

    }
}
