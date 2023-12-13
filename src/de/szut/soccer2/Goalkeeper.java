package de.szut.soccer2;

public class Goalkeeper extends Player {
    public int reaction;

    public Goalkeeper(String name, int age, int strength, int powerAtGoalKick, int motivation,int numberOfGoals, int reaction) {
        super(name, age, strength, powerAtGoalKick, motivation, 0);
        this.reaction = reaction;
    }


}
