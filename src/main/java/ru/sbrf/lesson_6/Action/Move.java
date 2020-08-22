package ru.sbrf.lesson_6.Action;

//интерфейс реализует возможность гулять и бежать
public interface Move {
    public default void walk () {
        System.out.println("Я иду");
    }
    public default void run () {
        System.out.println("Я бегу");
    }
}
