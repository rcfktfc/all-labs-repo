package org.example;

import java.util.ArrayList;
import java.util.List;

public class VetKlinika {
    private String nazvanie;
    private List<Pitomec> pacienty;

    public VetKlinika(String nazvanie) {
        this.nazvanie = nazvanie;
        this.pacienty = new ArrayList<>();
    }

    public void zaregistrirovat(Pitomec pitomec) {
        pacienty.add(pitomec);
        System.out.println("В клинику \"" + nazvanie + "\" добавлен пациент: " + pitomec.getImya());
    }

    public Pitomec naytiPitomca(String imya) throws PitomecNeNaydenIsklyuchenie {
        for (Pitomec p : pacienty) {
            if (p.getImya().equalsIgnoreCase(imya)) {
                return p;
            }
        }
        throw new PitomecNeNaydenIsklyuchenie("Питомец с кличкой \"" + imya + "\" не найден в клинике \"" + nazvanie + "\".");
    }

    public void pokazatVseh() {
        System.out.println("Список пациентов клиники \"" + nazvanie + "\"");
        for (Pitomec p : pacienty) {
            System.out.println(p);
        }
    }
}
