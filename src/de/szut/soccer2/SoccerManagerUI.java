package de.szut.soccer2;

public class SoccerManagerUI {
    public static void main(String[] args) {
        Player rikardo = new Player("Rikardo", 65,22,9,3,0);
        Player anthonio = new Player("Anthonio", 4, 55, 12, 2, 0);
        Coach coach = new Coach("Waldemar", 88, 40);

        Goalkeeper goalkeeper = new Goalkeeper("Sergei", 32, 90, 9, 3, 0, 4);

        System.out.print(rikardo);
        int tryGoal = rikardo.shootAtGoal();
        System.out.println(tryGoal);
        rikardo.scoreGoal();
        System.out.print(anthonio);
        tryGoal = anthonio.shootAtGoal();
        System.out.println(tryGoal);
        rikardo.scoreGoal();
        System.out.println(coach);

        System.out.println(goalkeeper);
        boolean goal = goalkeeper.ballHold(tryGoal);
        System.out.println(goal);

        //System.out.println(sergei);
        //tryGoal = sergei.shootAtGoal();
        //System.out.print(tryGoal);
    }
}
