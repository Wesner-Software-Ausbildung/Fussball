package de.szut.soccer4;

public class Game {
    private Team home;
    private Team away;
    private int goalsHome;
    private int goalsAway;

    public Game (Team home, Team away) {
        this.home = home;
        this.away = away;
    }

    public Team getHome () {
        return home;
    }
    public void setHome (Team home){
        this.home = home;
    }
    public Team getAway () {
        return away;
    }
    public void setAway (Team away) {
        this.away = away;
    }
    public int getGoalsHome () {
        return goalsHome;
    }
    public void setGoalsHome (int goalsHome) {
        this.goalsHome = goalsHome;
    }
    public int getGoalsAway () {
        return goalsAway;
    }
    public void setGoalsAway (int goalsAway) {
        this.goalsAway = goalsAway;
    }

    public void increaseGoalsHome() {
        this.goalsHome++;
    }

    public void  increateGoalsAway() {
        this.goalsAway++;
    }

    @Override
    public String toString() {
        return home + "-" + away;
    }
    public String getScore() {
        return goalsHome + "-" + goalsAway;
    }
}
