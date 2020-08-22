package ru.sbrf.lesson6.Animal;

import ru.sbrf.lesson6.Action.Climbing;
import ru.sbrf.lesson6.Action.Eating;
import ru.sbrf.lesson6.Action.Move;
import ru.sbrf.lesson6.Action.Sound;

public class Cat implements Sound, Move, Eating, Climbing {

    String name;
    public Cat(String name) {
        this.name = name;
    }

    public void say() {
        System.out.println("Я котэ " + name + ". Мяу!");
    }

}
