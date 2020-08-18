package ru.sbrf.lesson_6.Animal;

import ru.sbrf.lesson_6.Action.ClimbingTrees;
import ru.sbrf.lesson_6.Action.Eating;
import ru.sbrf.lesson_6.Action.Move;
import ru.sbrf.lesson_6.Action.Sound;

public class Cat {
    private String name;
    private ClimbingTrees climbingTrees;
    private Eating eating;
    private Move move;
    private Sound sound;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

        public Sound getSound() {
        return sound;
    }

//    public void setSound(Sound sound) throws NullPointerException{
//        this.sound = sound;
//    }

    String meow = sound.setSound("Мяу");

    //String meow = sound.setSound("Мяу!");
}
