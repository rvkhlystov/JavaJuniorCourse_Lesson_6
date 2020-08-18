package ru.sbrf.lesson_6.Action;

//возможность задать размер порции еды в кг на прием пищи
public class Eating {
    private float foodServing = 1;
    private float rateFoodServing;

    public void eat(float rateFoodServing) {
        this.foodServing *= rateFoodServing;
    }

}
