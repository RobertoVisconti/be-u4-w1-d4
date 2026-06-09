package entities.eserciziogdr;

public abstract class Personaggio {

    int lv;
    int punteggioEnergia;
    //attribbuti
    private String nome;

    //costruttore
    public Personaggio(String nome, int punteggioEnergia, int lv) {
        this.nome = nome;
        this.punteggioEnergia = punteggioEnergia;
        this.lv = lv;
    }

    // metodo mostra
    public void mostraStato() {
        System.out.println("Il personaggio ha queste caratteristiche:" + " " + " Nome : " + " " + nome + " Vita: " + " " + punteggioEnergia + "Livello:" + " " + lv);
    }

    public void riceviDanno(int danno) {
        this.punteggioEnergia -= danno;
        if (this.punteggioEnergia < 0) this.punteggioEnergia = 0;
    }

    @Override
    public String toString() {
        return "Personaggio{" +
                "nome='" + nome + '\'' +
                ", punteggioEnergia=" + punteggioEnergia +
                ", lv=" + lv +
                '}';
    }

    public String getNome() {
        return nome;
    }
}
