package ru.sbrf.lesson6.Action;

//интерфейс реализует возможность жевать и глотать
public interface Eating {
    default void chew() {
        System.out.println("Я прожевал еду");
    }
    default void ingest(){
        System.out.println("Я проглотил еду");
    }
}
