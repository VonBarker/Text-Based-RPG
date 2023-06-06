package com.rpg_example;

public class Island {
    // Add fields
    private String name;
    private int treasure;
    
    // Constructor Method
    public Island(String name) {
        this.name = name;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getTreasure() {
        return treasure;
    }
    public void setTreasure(int treasure) {
        this.treasure = treasure;
    }

    //toString override
    public String toString() {
        String output = "Island Data:\n";
        output += "Name: " + this.name;
        output += "\nAmount of Treasure: " + this.treasure;

        return output;
    }
}
