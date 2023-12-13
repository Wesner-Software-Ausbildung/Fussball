package de.szut.soccer2;

public class SoccerManagerUI {
    public static void main(String[] args) {
        Player rikardo = new Player("Rikardo", 65,22,10,3,0);
        Player anthonio = new Player("Anthonio", 4, 55, 12, 2, 0);
        Coach coach = new Coach("Waldemar", 88, 40);

        Goalkeeper sergei = new Goalkeeper("Sergei", 32, 90, 10, 3, 0, 4);

        System.out.print(rikardo);
        int tryGoal = rikardo.shootAtGoal();
        System.out.println(tryGoal);
        System.out.print(anthonio);
        tryGoal = anthonio.shootAtGoal();
        System.out.println(tryGoal);
        System.out.println(coach);

            //Hier habe ich nicht verstanden, wie kann ich Punkt 7 machen. Diesen Punkt befindet sich im Aufgabe Teil 2 in txt Daten.
            //Aber jetzt hat den Code funktioniert, aber zeigt nicht, ob Goal war oder nein.

        //System.out.print(sergei);
        //int goal = sergei.ballHold(int powerAtGoalKick);
        //System.out.print(goal);
        System.out.println(sergei);
        tryGoal = sergei.shootAtGoal();
        System.out.print(tryGoal);
    }
}
