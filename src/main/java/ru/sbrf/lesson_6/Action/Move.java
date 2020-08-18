package ru.sbrf.lesson_6.Action;

public class Move {
    private int speed;
    private int rateAnimal;

    public void walk (int rateAnimal) {
        this.speed = rateAnimal;
    }
    public void run (int rateAnimal) {
        this.speed *= rateAnimal;
    }
}
