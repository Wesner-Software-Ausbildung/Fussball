package de.szut.soccer2;

public class SoccerManagerUI {
    public static void main(String[] args) {
        Player rikardo = new Player("Rikardo", 65,22,10,10,0);
        Player anthonio = new Player("Anthonio", 4, 55, 12, 5, 0);
        Coach coach = new Coach("Waldemar", 88, 40);

        System.out.print(rikardo);
        int tryGoal = rikardo.shootAtGoal();
        System.out.println(tryGoal);
        System.out.print(anthonio);
        tryGoal = anthonio.shootAtGoal();
        System.out.println(tryGoal);
        System.out.println(coach);
    }
}
