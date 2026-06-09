package entities.eserciziogdr;

import java.util.Random;

public class Mercante extends Personaggio {
    Random random = new Random();

    //attribbuti
    private int ricchezza;
    private int nOggettiPos;

    public Mercante(String nome, int punteggioEnergia, int lv, int ricchezza, int nOggettiPos) {
        super(nome, punteggioEnergia, lv);

        this.ricchezza = ricchezza;
        this.nOggettiPos = nOggettiPos;
    }

    @Override
    public String toString() {
        return "Mercante{" +
                "random=" + random +
                ", ricchezza=" + ricchezza +
                ", nOggettiPos=" + nOggettiPos +
                "} " + super.toString();
    }
}
