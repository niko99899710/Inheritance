package org.example;

public class Footballer extends Sportsman {
    public Footballer(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public void run() {
        System.out.println("Футболист бегает");
    }

    public void scoringGoals() {
        System.out.println("Футболист забил гол");
    }
}
