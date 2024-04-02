package week04.abstraction.absractexample;

public class Zombie extends Enemy{

    public Zombie(){
        this.health =100;
        this.damage =5;

    }

    @Override
    public void attack() {
        System.out.println("Zombie attacks with" + damage + "damage");
    }
}
