package com.rpg_example;

public class Character {
    // Add fields
    private String id;
    private String name;
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
        String output = "Ship\n";
        output += "ID: " + this.id;
        output += "\nName: " + this.name;
        output += "\nSize: " + this.size;
        output += "\nSpeed: " + this.speed;
        output += "\nHealth: " + this.health;

        return output;
    }
}
