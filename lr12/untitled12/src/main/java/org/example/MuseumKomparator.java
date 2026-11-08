package org.example;

import java.util.Comparator;

public class MuseumKomparator implements Comparator<Museum> {
    @Override
    public int compare(Museum m1, Museum m2) {
        int sravnenieReytinga = Double.compare(m2.getAverageRating(), m1.getAverageRating());

        if (sravnenieReytinga == 0) {
            return m2.getName().compareTo(m1.getName());
        }

        return sravnenieReytinga;
    }
}
