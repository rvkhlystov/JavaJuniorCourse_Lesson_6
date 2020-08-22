package ru.sbrf.lesson6.Action;

//интерфейс реализует возможность гулять и бежать
public interface Move {
    default void walk() {
        System.out.println("Я иду");
    }
    default void run() {
        System.out.println("Я бегу");
    }
}
