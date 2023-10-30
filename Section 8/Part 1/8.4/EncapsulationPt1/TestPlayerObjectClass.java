package EncapsulationPt1;

public class TestPlayerObjectClass {
    public static void main(String[] args) {
        Player player = new Player();

        //Our blueprint class player had changed the name of the variable,
        //Which caused an error
        // make them encapsulated to avoid this problem
        //player.name = "Tim";

        player.fullName = "Tim";
        player.health = 20;
        player.weapon = "Sword";

        int damage = 10;
        player.loseHealth(damage);

        System.out.println("Remaining health = " + player.healthRemaining());

        player.health = 200;
        player.loseHealth(11);

        System.out.println("Remaining health = " + player.healthRemaining());
    }
}
