package ru.sbrf.lesson_6;

import ru.sbrf.lesson_6.Animal.Cat;
import ru.sbrf.lesson_6.Animal.Dog;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Cat vaska = new Cat("Васька");
        vaska.say();
        vaska.chew();
        vaska.ingest();
        vaska.walk();
        vaska.run();
        vaska.ClimbingTrees();

        Dog chip = new Dog("Чип");
        chip.say();
        chip.chew();
        chip.ingest();
        chip.walk();
        chip.run();
        chip.swim();
    }
}
