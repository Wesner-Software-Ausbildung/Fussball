package de.szut.soccer4;

public class Goalkeeper extends Player {
    public int reaction;

    public Goalkeeper(String name, int age, int strength, int powerAtGoalKick, int motivation,int numberOfGoals, int reaction) {
        super(name, age, strength, powerAtGoalKick, motivation, 0);
        this.reaction = reaction;
    }

    @Override
    public String toString () {
        return "\nGoalkeeper\n" +
                "Name: " + this.name +
                "\nAge: " + this.age +
                "\nStrength: " + this.strength +
                "\nPowerAtGoalKick: " + this.powerAtGoalKick +
                "\nMotivation: " + this.motivation +
                "\nNumberOfGoals: " + this.numberOfGoals +
                "\nReaction: " + this.reaction;
    }

}
