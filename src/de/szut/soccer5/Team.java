package de.szut.soccer5;

import java.util.ArrayList;
import java.util.Random;

public class Team {

    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private ArrayList <Player> squad = new ArrayList<>();

    public Team (String name, Coach coach, Goalkeeper goalkeeper) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.squad = new ArrayList <Player> ();
    }

    public String getName() {
        return name;
    }
    public void addPlayer (Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation () {
        int sum = 0;
        for (int i = 0; i < this.squad.size(); i++) {
            sum += this.squad.get(i).getMotivation();
        }
        return sum/this.squad.size();
    }

    public int getTotalForce() {
        int sum = 0;
        for (int i = 0; i < this.squad.size(); i++) {
            sum += this.squad.get(i).getStrength();
        }
        return sum/this.squad.size();
    }

    public Coach getCoach() {
        return this.coach;
    }

    public int calculateForceOfTheTeam() {
        int teamStrength = getTotalForce();
        int teamMotivation = getTotalMotivation();
        int coachExperience = this.coach.getExperience();
        int randomValue = new Random().nextInt(7) - 3;

        int teamForce = teamStrength * teamMotivation * coachExperience + randomValue;
        return Math.max(teamForce, 1);
    }

    @Override
    public String toString() {
        return "***Team***\n" +
                "Coach: " + coach.getName() + "\n" +
                "Goalkeeper: " + goalkeeper.getName() + "\n" +
                "Team: " + squad.toString() + "\n";
    }

    public Goalkeeper getGoalkeeper() {
        return this.goalkeeper;
    }

    public Player getRandomPlayer() {
        Random rand = new Random();
        return this.squad.get(rand.nextInt(this.squad.size()));
    }
}
