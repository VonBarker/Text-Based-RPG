package com.rpg_example;

/**
 * Hello world!
 */
public final class App {

    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        System.out.println("New Ship!");
        Character playerShip = new Character("PlayerShip");

        //Demonstrate getters and setters
        playerShip.setName("Test Ship");
        playerShip.setSize(1);
        playerShip.setSpeed(3);
        playerShip.setHealth(15);
        System.out.println(playerShip.getName());

        System.out.println(playerShip);
    }
}
