package entities.eserciziogdr;

import interfaces.Combattente;

import java.util.Random;

public class Guerriero extends Personaggio implements Combattente {
    Random random = new Random();

    // attribbuti
    private int forza;
    private int resistenza;

    //costruttore esteso
    public Guerriero(String nome, int punteggioEnergia, int lv, int forza, int resistenza) {
        super(nome, punteggioEnergia, lv);

        this.forza = random.nextInt(20, 50);
        this.resistenza = random.nextInt(5, 20);
    }

    //metodi
    public void allenati(int resistenza) {
        resistenza++;
    }

    @Override
    public String toString() {
        return "Guerriero{" +
                "random=" + random +
                ", forza=" + forza +
                ", resistenza=" + resistenza +
                "} " + super.toString();
    }

    @Override
    public void agisci(Personaggio avversario) {
        System.out.println("Calcolo del danno:");
        int danno = (int) (forza * resistenza * lv) / 10;
        double energiaRidotta = punteggioEnergia - (danno / 5);
        System.out.println("Danno inflitto:" + " " + danno + " " + " Energia ridotta di:" + " " + energiaRidotta);
        avversario.riceviDanno((int) danno);
    }

    @Override
    public void upLvl() {
        lv++;

    }
}
