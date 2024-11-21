package org.example;

public class Skier extends Sportsman {
    public Skier(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public void run() {
        System.out.println("Лыжник скатывается");
    }

    public void foundSki() {
        System.out.println("Найди свои лыжи");
    }
}
