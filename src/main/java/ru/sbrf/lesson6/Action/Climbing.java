package ru.sbrf.lesson6.Action;

//интерфейс реализует возможность лазать по деревьям
public interface Climbing {
    default void ClimbingTrees(){
        System.out.println("Я залез на дерево");
    }
}
