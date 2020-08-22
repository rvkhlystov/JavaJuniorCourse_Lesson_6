package ru.sbrf.lesson6;

import ru.sbrf.lesson6.Animal.Cat;
import ru.sbrf.lesson6.Animal.Dog;

public class Main {
    public static void main(String[] args) {
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
