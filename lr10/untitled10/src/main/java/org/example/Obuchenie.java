package org.example;

public interface Obuchenie {
    void obuchat();
    int getStudenty();

    static void pokazatPravila() {
        System.out.println("Учебный год начинается 1 сентября.");
    }
}
