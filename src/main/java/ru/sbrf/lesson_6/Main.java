package ru.sbrf.lesson_6;

import ru.sbrf.lesson_6.Animal.Cat;

public class Main {
    public static void main(String[] args) throws NullPointerException {
        Cat vaska = new Cat();
        vaska.setName("Васька");
        System.out.println(vaska.getSound());
    }
}
