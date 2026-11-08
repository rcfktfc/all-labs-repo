package org.example;

public class Racket extends SportsEquipment {
    private int stringTension;

    public Racket(String name, int id, double weight, int stringTension) {
        super(name, id, weight);
        this.stringTension = stringTension;
    }

    public int getStringTension() {
        return stringTension;
    }

    @Override
    public String toString() {
        return super.toString() + ", Type: Racket, StringTension: " + stringTension;
    }
}
