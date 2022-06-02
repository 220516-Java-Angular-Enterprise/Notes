package com.revature.reflection;

public class Hero extends Object {
    private String name;
    private String power;
    private Gender gender;
    private String weakness;

    public Hero() {
        super();
    }

    public Hero(String name, String power, Gender gender, String weakness) {
        this.name = name;
        this.power = power;
        this.gender = gender;
        this.weakness = weakness;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getWeakness() {
        return weakness;
    }

    public void setWeakness(String weakness) {
        this.weakness = weakness;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", Power: " + power + ", Gender: " + gender + ", Weakness: " + weakness;
    }
}
