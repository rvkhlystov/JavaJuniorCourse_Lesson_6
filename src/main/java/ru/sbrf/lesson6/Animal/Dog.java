package ru.sbrf.lesson6.Animal;

import ru.sbrf.lesson6.Action.*;

public class Dog implements Sound, Move, Eating, Swimming {

    String name;
    public Dog(String name){
        this.name = name;
    }



    public void say() {
        System.out.println("Я собакин " + name + ". Гав!");
    }

    public void swim() {
        System.out.println("Я плаваю по собачьи");
    }


}
