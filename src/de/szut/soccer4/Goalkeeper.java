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
                "name: " + this.name +
                "\nage: " + this.age +
                "\nstrength: " + this.strength +
                "\npowerAtGoalKick: " + this.powerAtGoalKick +
                "\nmotivation: " + this.motivation +
                "\nnumberOfGoals: " + this.numberOfGoals +
                "\nreaction: " + this.reaction;
    }

}
