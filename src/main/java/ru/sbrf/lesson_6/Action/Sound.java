package ru.sbrf.lesson_6.Action;

public class Sound {
    private String sound;

    public void say (String sound) {
        System.out.println(sound);
    }

    public String getSound() {
        return sound;
    }

    public String setSound(String sound) throws NullPointerException{
        this.sound = sound;
        return sound;
    }
}
