package com.rpg_example;

import java.util.Random;
import java.util.Scanner;

public final class App {

    private App() {
    }

    public static void main(String[] args) {
        // Create Islands
        Random rand = new Random();

        Island sailersBounty = new Island("Sailer's Bounty");
        sailersBounty.setTreasure(rand.nextInt(5));
        
        Island smugglersBay = new Island("Smuggler's Bay");
        smugglersBay.setTreasure(rand.nextInt(12));

        Island sandyShallows = new Island("Sandy Shallows");
        sandyShallows.setTreasure(rand.nextInt(2));

        Island[] islands = {sailersBounty, smugglersBay, sandyShallows};

        // Create Player Ship
        System.out.println("New Ship!");
        Character playerShip = new Character("PlayerShip");

        // Create a Scanner object
        Scanner userInput = new Scanner(System.in);
        
        System.out.println("What do you want to name your ship?");
        String shipName = userInput.nextLine();
        playerShip.setName(shipName);
        
        boolean validInput = false;
        while(!validInput)
        {
            System.out.println("What ship type do you  want? The sloop is the smallest which makes it the fastest, but also the easiest to sink if hit. The brigantine is the medium size ship which makes it the middle ground in speed and how easly it can be sunk. The galleon is the largest ship which makes it the slowest, but it sinks the slowest. \n\nType 1 for Sloop, 2 for Brigantine, or 3 for Galleon");
            String shipType = userInput.nextLine();
            if(shipType.equals("1"))
            {
                playerShip.setSize(1);
                playerShip.setSpeed(3);
                playerShip.setHealth(15);
                validInput = true;
            }
            else if(shipType.equals("2"))
            {
                playerShip.setSize(1.5);
                playerShip.setSpeed(2);
                playerShip.setHealth(25);
                validInput = true;
            }
            else if(shipType.equals("3"))
            {
                playerShip.setSize(2);
                playerShip.setSpeed(1);
                playerShip.setHealth(35);
                validInput = true;
            }
            else System.out.println("Invalid Input");
        }
        validInput = false;

        // Output
        playerShip.getType();
        System.out.println(playerShip);

        System.out.println("Hit Enter to See the Islands");
        int islandsPrinted = 0;
        while(islandsPrinted < islands.length)
        {
            String input = userInput.nextLine();
            if(input.equals(""))
            {
                System.out.println(islands[islandsPrinted]);
                System.out.println("Hit Enter for the Next Island");
                islandsPrinted = islandsPrinted + 1;
            }
        }
    }
}