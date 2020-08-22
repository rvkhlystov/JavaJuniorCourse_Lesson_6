package ru.sbrf.lesson_6.Action;

//интерфейс реализует возможность жевать и глотать
public interface Eating {
    public default void chew() {
        System.out.println("Я прожевал еду");
    }
    public default void ingest(){
        System.out.println("Я проглотил еду");
    }
}
