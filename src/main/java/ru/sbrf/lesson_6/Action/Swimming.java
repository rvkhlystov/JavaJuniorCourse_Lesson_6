package ru.sbrf.lesson_6.Action;

//в зависимости от выносливости задаем дистанцию для плавания
public class Swimming {
    private int distance = 1;
    private int rateHardiness;

    public void swim(int rateHardiness) {
        this.distance *= rateHardiness;
    }

}
