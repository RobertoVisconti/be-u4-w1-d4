package entities.eserciziogdr;

import interfaces.Combattente;

import java.util.Random;

public class Mago extends Personaggio implements Combattente {
    Random random = new Random();

    // attribbuti
    private int potereMagico;
    private int mana;

    //costruttore
    public Mago(String nome, int punteggioEnergia, int lv, int potereMagico, int mana) {
        super(nome, punteggioEnergia, lv);

        this.potereMagico = potereMagico;
        this.mana = mana;
    }

    //metodi
    public void medita(int mana) {
        mana++;
    }

    @Override
    public String toString() {
        return "Mago{" +
                "random=" + random +
                ", potereMagico=" + potereMagico +
                ", mana=" + mana +
                "} " + super.toString();
    }

    @Override
    public void agisci(Personaggio avversario) {
        System.out.println("Calcolo del danno:");
        int danno = (int) (potereMagico * mana * lv) / 10;
        double manaRidotto = mana - (danno / 3);
        System.out.println("Danno inflitto:" + " " + danno + " " + " Energia ridotta di:" + " " + manaRidotto);
        avversario.riceviDanno((int) danno);
    }

    @Override
    public void upLvl() {

    }
}
