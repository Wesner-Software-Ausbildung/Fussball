package de.szut.soccer;

import de.szut.soccer.Coach;
import de.szut.soccer.Player;

public class SoccerManagerUI {
    public static void main(String[] args) {
        Player rikardo = new Player("Rikardo", 65,22,10,10,0);
        Player anthonio = new Player("Anthonio", 14, 55, 12, 5, 0);
        Coach coach = new Coach("Waldemar", 88, 40);

        System.out.print(rikardo);
        int tryGoal = rikardo.shootAtGoal();
        System.out.print(tryGoal);
        System.out.print(anthonio);
        tryGoal = anthonio.shootAtGoal();
        System.out.print(tryGoal);
        System.out.print(coach);

    }
}
