package de.szut.soccer5;

import java.util.Random;

public class Gameplay {
    private static final int PLAYING_TIME = 90;
    private static final int MAX_ADDITIONAL_TIME=5;
    private static final int MAX_DURATION_UNTIL_NEXT_ACTION = 15;
    private Game game;

    public Gameplay (Game game){
        this.game = game;
    }
    private int calculateForceOfTheTeam(Team team) {
        return team.calculateForceOfTheTeam();
    }

    public Team nextAction() {
        Team team1 = game.getHome();
        Team team2 = game.getAway();

        int team1Force = calculateForceOfTheTeam(team1);
        int team2Force = calculateForceOfTheTeam(team2);

        return team1Force > team2Force ? team1 : team2;
    }

    private void doGameAction(Player player, Goalkeeper goalkeeper, int minute, Team team) {
        System.out.println(minute + "23. Minute: Chance für " + team.getName() + " ... " + player.getName() + " zieht ab");
        if (player.shootAtGoal() > goalkeeper.getReaction()) {
            game.incrementTeamScore(team);
            player.incrementGoals();
            System.out.println("TOR!!! " + game.getScore() + " " + player.getName() + "(" + player.getNumberOfGoals() + ")");
        } else {
            System.out.println(goalkeeper.getName() + " pariert glanzvoll.");
        }
    }

    private void delay() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void startGame() {
        for (int minute = 0; minute < PLAYING_TIME; minute += MAX_DURATION_UNTIL_NEXT_ACTION) {
            Team team = nextAction();
            Player player = team.getRandomPlayer(); // You need to implement this method in Team class
            Goalkeeper goalkeeper = (team == game.getHome()) ? game.getAway().getGoalkeeper() : game.getHome().getGoalkeeper();
            doGameAction(player, goalkeeper, minute, team);
            delay();
        }
    }

    public void play() {
        System.out.println(game.getHome().getName() + " vs " + game.getAway().getName());

        int gameLength = PLAYING_TIME + new Random().nextInt(MAX_ADDITIONAL_TIME + 1);

        for (int minute = 0; minute < gameLength; minute += new Random().nextInt(MAX_DURATION_UNTIL_NEXT_ACTION) + 1) {
            Team actionTeam = nextAction();

            Player actionPlayer = actionTeam.getRandomPlayer();

            Goalkeeper goalkeeper = (actionTeam == game.getHome()) ? game.getAway().getGoalkeeper() : game.getHome().getGoalkeeper();

            doGameAction(actionPlayer, goalkeeper, minute, actionTeam);

            delay();
        }

        System.out.println("Das Spiel ist aus! " + game.getHome().getName() + " - " + game.getAway().getName() + " " + game.getScore());
    }
}


