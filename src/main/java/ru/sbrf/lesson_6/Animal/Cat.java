package ru.sbrf.lesson_6.Animal;

import ru.sbrf.lesson_6.Action.ClimbingTrees;
import ru.sbrf.lesson_6.Action.Eating;
import ru.sbrf.lesson_6.Action.Move;
import ru.sbrf.lesson_6.Action.Sound;

public class Cat implements Sound, Move, Eating, ClimbingTrees {

    String name;
    public Cat(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Я котэ " + name + ". Мяу!");
    }

}
