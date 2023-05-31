package com.rpg_example;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        System.out.println("New Ship!");
        Character playerShip = new Character("PlayerShip");

        // Create a Scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What do you want to name your ship?");
        String shipName = userInput.nextLine();
        playerShip.setName(shipName);
        
        System.out.println("What ship type do you want? The sloop is the smallest which makes it the fastest, but also the easiest to sink if hit. The brigantine is the medium size ship which makes it the middle ground in speed and how easly it can be sunk. The galleon is the largest ship which makes it the slowest, but it sinks the slowest. \n\nType 1 for Sloop, 2 for Brigantine, or 3 for Galleon");
        String shipType = userInput.nextLine();
        if(shipType.equals("1"))
        {
            playerShip.setSize(1);
            playerShip.setSpeed(3);
            playerShip.setHealth(15);
        }
        else if(shipType.equals("2"))
        {
            playerShip.setSize(1.5);
            playerShip.setSpeed(2);
            playerShip.setHealth(25);
        }
        else if(shipType.equals("3"))
        {
            playerShip.setSize(2);
            playerShip.setSpeed(1);
            playerShip.setHealth(35);
        }
        else System.out.println("Invalid Input");

        playerShip.getType();
        System.out.println(playerShip);
    }
}