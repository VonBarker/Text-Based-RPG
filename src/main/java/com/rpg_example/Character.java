package com.rpg_example;

public class Character {
    // Add fields
    private String id;
    private String name;
    private String type;
    private double size;
    private int speed;
    private int health;

    // Constructor Method
    public Character(String id) {
        this.id = id;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public void getType() {
        if(size == 1)  type = "Sloop";
        if(size == 1.5)  type = "Brigantine";
        if(size == 2)  type = "Galleon";
    }

    public double getSize() {
        return size;
    }
    public void setSize(double size) {
        this.size = size;
    }

    public int getSpeed() {
        return speed;
    }
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }

    //toString override
    public String toString() {
        String output = "Ship Data:\n";
        output += "ID: " + this.id;
        output += "\nName: " + this.name;
        output += "\nType: " + this.type;
        output += "\nSize: " + this.size;
        output += "\nSpeed: " + this.speed;
        output += "\nHealth: " + this.health;

        return output;
    }
}
