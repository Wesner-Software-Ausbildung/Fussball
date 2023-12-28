package de.szut.soccer4;

import java.util.ArrayList;

public class Team {

    private String name;
    private Coach coach;
    private Goalkeeper goalkeeper;
    private ArrayList<Player> squad = new ArrayList<>();

    public Team (String name, Coach coach, Goalkeeper goalkeeper) {
        this.name = name;
        this.coach = coach;
        this.goalkeeper = goalkeeper;
        this.squad = new ArrayList<Player>();
    }

    public void addPlayer (Player player) {
        this.squad.add(player);
    }

    public int getTotalMotivation () {
        int sum = 0;
        for (int i = 0; i < this.squad.size(); i++) {
            sum += this.squad.get(i).getMotivation();
        }
        return this.squad.size();
    }

}
