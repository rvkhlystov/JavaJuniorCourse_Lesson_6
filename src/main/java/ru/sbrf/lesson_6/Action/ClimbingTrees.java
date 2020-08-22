package ru.sbrf.lesson_6.Action;

//интерфейс реализует возможность лазать по деревьям
public interface ClimbingTrees {
    public default void ClimbingTrees(){
        System.out.println("Я залез на дерево");
    }
}
