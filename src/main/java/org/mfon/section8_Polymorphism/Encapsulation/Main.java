package org.mfon.section8_Polymorphism.Encapsulation;

public class Main {
    public static void main(String[] args) {
//        Player player = new Player();
//        player.name = "Tim";
//        player.health = 20;
//        player.weapon = "Sword";
//
//        int damage = 10;
//        player.loseHealth(damage);
//        System.out.println("Remaining health = " + player.healthRemaining());
//        player.health = 200; //This code actually takes control away from the  Player class,
//        // for managing the Player's health. It didn't call the restoreHealth method,
//        // which has the additional control in place,  that player health can never exceed 100.
//        // This is an example of the first problem, with  a class that's not encapsulated properly.
//
//        player.loseHealth(11);
//        System.out.println("Remaining health = " + player.healthRemaining());

        EnhancedPlayer tim = new EnhancedPlayer("Tim");
        System.out.println("Initial health is " + tim.healthRemaining());

        //Using the other constructor:
        EnhancedPlayer timm = new EnhancedPlayer("Tim", 200, "Sword");
        System.out.println("Initial health is " + tim.healthRemaining());
    }

}
