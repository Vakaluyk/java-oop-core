package ru.geekbrains.java.oop.core.hw1.Obstacles;

import ru.geekbrains.java.oop.core.hw1.Participants.Runner;

public class Wall implements ru.geekbrains.java.oop.core.hw1.obstacles.Obstacles {
    private int width;

    public Wall(int width) {
        this.width = width;
    }

    public void check(Runner runner) {
        runner.jump();
        runner.setSuccess(runner.getMaxWeight() >= width);
        if (runner.getSuccess()) {
            System.out.println("Прыгун " + runner.getName() + " выполнил испытание, перепрыгнув стену высотой: " + width);
        } else {
            System.out.println("Прыгун " + runner.getName() + " не перепрыгнул стену высотой: " + width);
        }
    }
}