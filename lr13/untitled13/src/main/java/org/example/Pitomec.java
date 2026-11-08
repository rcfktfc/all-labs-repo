package org.example;

public class Pitomec {
    private String imya;
    private String vid;
    private int vozrast;
    private double ves;
    private String vladelec;

    public Pitomec(String imya, String vid, int vozrast, double ves, String vladelec) throws NepravilnyeDannyeIsklyuchenie {
        if (vozrast < 0) {
            throw new NepravilnyeDannyeIsklyuchenie("Неверный возраст: " + vozrast + ". Возраст не может быть меньше 0.");
        }
        if (ves <= 0) {
            throw new NepravilnyeDannyeIsklyuchenie("Неверный вес: " + ves + ". Вес должен быть строго больше 0.");
        }
        this.imya = imya;
        this.vid = vid;
        this.vozrast = vozrast;
        this.ves = ves;
        this.vladelec = vladelec;
    }

    public String getImya() {
        return imya;
    }

    public String getVid() {
        return vid;
    }

    public int getVozrast() {
        return vozrast;
    }

    public double getVes() {
        return ves;
    }

    public String getVladelec() {
        return vladelec;
    }

    public void posetitVeterinara(String procedura) throws VeterinarIsklyuchenie {
        if (procedura == null || procedura.isEmpty()) {
            throw new VeterinarIsklyuchenie("Ошибка ветеринара: процедура не указана.");
        }
        if (procedura.equalsIgnoreCase("Опасная операция") && ves < 1.0) {
            throw new VeterinarIsklyuchenie("Ошибка ветеринара: питомец " + imya + " слишком мал для операции (вес: " + ves + " кг).");
        }
        System.out.println("Питомец " + imya + " (" + vid + ") успешно прошел процедуру: " + procedura + ".");
    }

    public void obnovitVes(double noviyVes) throws NepravilnyeDannyeIsklyuchenie {
        if (noviyVes <= 0) {
            throw new NepravilnyeDannyeIsklyuchenie("Нельзя установить вес " + noviyVes + ". Вес должен быть больше 0.");
        }
        System.out.println("Вес питомца " + imya + " изменен с " + this.ves + " кг на " + noviyVes + " кг.");
        this.ves = noviyVes;
    }

    @Override
    public String toString() {
        return imya + " (" + vid + "), Возраст: " + vozrast + ", Вес: " + ves + " кг, Владелец: " + vladelec;
    }
}