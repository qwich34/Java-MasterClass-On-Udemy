package EncapsulationPt1;
public class Player {
    // variables without encapsulation!!!
    public String fullName;
    public int health;
    public String weapon;


    public void loseHealth(int damage) {
        health -= damage;
        if(health <= 0) {
            System.out.println("Player knocked out of game");
        }
    }

    public void restoreHealth(int extraHealth) {
        health += extraHealth;
        if(health > 100) {
            System.out.println("Player restored to 100%");
            health = 100;
        }
    }

    public int healthRemaining() {
        return health;
    }
}
