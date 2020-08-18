package ru.sbrf.lesson_6.Action;

//Определяем возможную высоту (в метрах) лазания по деревьям
// исходя из уровня страха (чем меньше значение,тем выше уровень страха)
public class ClimbingTrees {
    private int height = 2;
    private int fearLevel;


    public void ClimbingTrees(int fearLevel) {
        this.height *= fearLevel;
    }
}
