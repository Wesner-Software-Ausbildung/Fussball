package de.szut.soccer2;

import static java.lang.Math.random;

public class Player {
    protected String name;
    protected int age;
    protected int strength;
    protected int powerAtGoalKick;
    protected int motivation;
    protected int numberOfGoals;

    public Player (String name, int age, int strength, int powerAtGoalKick, int motivation, int numberOfGoals) {
        this.name = name;
        this.age = age;
        this.strength = strength;
        this.powerAtGoalKick = validate(powerAtGoalKick);
        this.motivation = motivation;
        this.numberOfGoals = numberOfGoals;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public int getStrength() {
        return strength;
    }
    public void setStrength(int strength) {
        this.strength = strength;
    }
    public int getPowerAtGoalKick() {
        return powerAtGoalKick;
    }
    public void setPowerAtGoalKick(int powerAtGoalKick) {
        this.powerAtGoalKick = powerAtGoalKick;
    }
    public int getMotivation() {
        return motivation;
    }
    public void setMotivation(int motivation) {
        this.motivation = motivation;
    }
    public int getNumberOfGoals() {
        return numberOfGoals;
    }
    public void setNumberOfGoals(int numberOfGoals) {
        this.numberOfGoals = numberOfGoals;
    }
    public int shootAtGoal() {
        int result = getPowerAtGoalKick() - (int) (random() * 3 - 2);
        return validate(result);
    }
    public void addGoal() {
        this.numberOfGoals++;
    }

    public boolean ballHold(int powerAtGoalKick){
        int result = validate(getStrength() - (int) (Math.random()* 3 -2));
        if (result > powerAtGoalKick) {
            return true;
        }
        return false;
    }

    protected int validate(int value) {
        //return value < 1 ? 1 : value > 10 ? 10 : value;
        if (value < 1) {
            return 1;
        }
        else if (value > 10) {
            return 10;
        }
        return value;
    }
    @Override
    public String toString() {
        return "\nPlayer\n" +
                "name: " + this.name +
                "\nage: " + this.age +
                "\nstrength: " + this.strength +
                "\npowerAtGoalKick: " + this.powerAtGoalKick +
                "\nmotivation: " + this.motivation;
    }

}
