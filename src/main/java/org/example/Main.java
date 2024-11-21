package org.example;

public class Main {
    public static void main(String[] args) {

        Footballer[] footballer = new Footballer[2];
        System.out.println("Футбол");

        footballer[0] = new Footballer("Tim", "leon", 10);
        footballer[1] = new Footballer("Bim", "leon", 11);
        footballer[0].run();
        footballer[1].run();
        footballer[0].scoringGoals();
        footballer[1].scoringGoals();
        System.out.println("Это " + footballer[0].getName() + " и " + footballer[1].getName());

        HockeyPlayer[] hockeyPlayers = new HockeyPlayer[2];
        System.out.println("Хоккей");

        hockeyPlayers[0] = new HockeyPlayer("Tom", "pig", 12);
        hockeyPlayers[1] = new HockeyPlayer("Bom", "pig", 13);
        hockeyPlayers[0].run();
        hockeyPlayers[1].run();
        hockeyPlayers[0].takeStick();
        hockeyPlayers[1].takeStick();
        System.out.println("Это " + hockeyPlayers[0].getName() + " и " + hockeyPlayers[1].getName());

        Skier[] skiers = new Skier[2];
        System.out.println("Лыжи");

        skiers[0] = new Skier("Boltick", "duck", 10);
        skiers[1] = new Skier("Bick", "duck", 12);
        skiers[0].run();
        skiers[1].run();
        skiers[0].foundSki();
        skiers[1].foundSki();
        System.out.println("We are " + skiers[0].getName() + " and " + skiers[1].getName());
    }
}