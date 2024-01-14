package de.szut.soccer5;

public class SoccerManagerUI {
    public static void main(String[] args) {

        Coach coach = new Coach("Terzic", 38, 5);
        Goalkeeper goalkeeper = new Goalkeeper("Bürki", 30, 7, 2, 10, 7, 0);
        Team dortmund = new Team("Borussia Dortmund",coach, goalkeeper);
        dortmund.addPlayer(new Player("Meunier", 29, 7, 5, 8, 0));
        dortmund.addPlayer(new Player("Akanji", 25, 8, 6, 8, 0));
        dortmund.addPlayer(new Player("Hummels", 31, 9, 5, 8, 0));
        dortmund.addPlayer(new Player("Guerreiro", 26, 8, 9, 8, 0));
        dortmund.addPlayer(new Player("Witsel", 31, 9, 6, 8, 0));
        dortmund.addPlayer(new Player("Brandt", 24, 9, 8, 8, 0));
        dortmund.addPlayer(new Player("Sancho", 20, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Bellingham", 17, 7, 7, 7, 0));
        dortmund.addPlayer(new Player("Reus", 31, 10, 8, 8, 0));
        dortmund.addPlayer(new Player("Haaland", 20, 9, 9, 8, 0));

        coach = new Coach("Kohfeld", 38, 9);
        goalkeeper = new Goalkeeper("Pavlenka", 28, 6, 2, 10, 6, 0);
        Team werder = new Team("Werder Bremen", coach, goalkeeper);
        werder.addPlayer(new Player("Gebre Selassie", 34, 7, 6, 8, 0));
        werder.addPlayer(new Player("Friedl", 22, 6, 6, 8, 0));
        werder.addPlayer(new Player("Veljkovic", 24, 6, 5, 8, 0));
        werder.addPlayer(new Player("Augustinsson", 26, 7, 5, 7, 0));
        werder.addPlayer(new Player("Mbom", 20, 6, 6, 8, 0));
        werder.addPlayer(new Player("Eggestein", 24, 8, 6, 8, 0));
        werder.addPlayer(new Player("Füllkrug", 27, 8, 9, 8, 0));
        werder.addPlayer(new Player("Osako", 30, 7, 8, 8, 0));
        werder.addPlayer(new Player("Rashica", 24, 8, 8, 8, 0));
        werder.addPlayer(new Player("Bittencourt", 27, 7, 7, 8, 0));

        System.out.println(werder.toString());
        System.out.println(dortmund.toString());

        Game game = new Game(werder, dortmund);
        System.out.println('\n' + "Spielstand: " + game.getScore());
        game.increaseGoalsHome();
        System.out.println('\n' + "Spielstand: " + game.getScore());
        game.increateGoalsAway();

        System.out.println(dortmund.toString());
        System.out.println("Mannschaftsstärke: " + dortmund.getTotalForce());
        System.out.println("Motivation: "+ dortmund.getTotalMotivation());

        System.out.println("Mannschaft: Werder");
        System.out.println("Mannschaftsstärke: " + werder.getTotalForce());
        System.out.println("Motivation: "+ werder.getTotalMotivation());

        System.out.println('\n'+"Mannschaft: Dortmund");
        System.out.println("Mannschaftsstärke: " + dortmund.getTotalForce());
        System.out.println("Motivation: "+ dortmund.getTotalMotivation());

        System.out.println('\n'+"Spielstand: "+ game.getScore());

        //System.out.println('\n'+"Starke: "+ team.getCalculateForceOfTheTeam());




      /*  System.out.print(rikardo);
        int tryGoal = rikardo.shootAtGoal();
        System.out.println(tryGoal);
        System.out.print(anthonio);
        tryGoal = anthonio.shootAtGoal();
        System.out.println(tryGoal);
        System.out.println(coach);

        //System.out.print(sergei);
        //int goal = sergei.ballHold(Goalkeeper);
        //System.out.print(goal);

        System.out.println(sergei);
        tryGoal = sergei.shootAtGoal();
        System.out.print(tryGoal); */
    }
}
