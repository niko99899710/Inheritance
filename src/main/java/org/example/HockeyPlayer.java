package org.example;

public class HockeyPlayer extends Sportsman {
    public HockeyPlayer(String name, String team, int age) {
        super(name, team, age);
    }

    @Override
    public void run() {
        System.out.println("Хоккеист катается");
    }

    public void takeStick (){
        System.out.println("Хоккеист возьми клюшку");
    }
}
