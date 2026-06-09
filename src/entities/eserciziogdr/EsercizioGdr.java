package entities.eserciziogdr;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class EsercizioGdr {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Crea Personaggio:");
        Personaggio[] creaPersonaggi = new Personaggio[3];
        for (int i = 0; i < creaPersonaggi.length; i++) {
            System.out.println("Scegli un Nome:");
            String nome = scanner.nextLine();
            System.out.println("Scegli la classe del personaggio: 1: Guerriero, 2: Mago, 3: Mercante");
            int classe = Integer.parseInt(scanner.nextLine());

            switch (classe) {
                case 1 -> {
                    int punteggioEnergia = random.nextInt(30, 50);
                    int forza = random.nextInt(10, 50);
                    int lv = random.nextInt(20, 50);
                    int resistenza = random.nextInt(15, 50);
                    creaPersonaggi[i] = new Guerriero(nome, punteggioEnergia, forza, lv, resistenza);
                    System.out.println(nome + " : " + creaPersonaggi[i]);
                }

                case 2 -> {
                    int punteggioEnergia = random.nextInt(30, 50);
                    int potereMagico = random.nextInt(10, 50);
                    int lv = random.nextInt(20, 50);
                    int mana = random.nextInt(15, 50);
                    creaPersonaggi[i] = new Mago(nome, punteggioEnergia, potereMagico, lv, mana);
                    System.out.println(nome + " : " + creaPersonaggi[i]);
                }

                case 3 -> {
                    int punteggioEnergia = random.nextInt(30, 50);
                    int ricchezza = random.nextInt(10, 50);
                    int lv = random.nextInt(20, 50);
                    int nOggettiPos = random.nextInt(15, 50);
                    creaPersonaggi[i] = new Mercante(nome, punteggioEnergia, ricchezza, lv, nOggettiPos);
                    System.out.println(nome + " : " + creaPersonaggi[i]);
                }
            }
        }

        System.out.println("Personaggi creati");
        while (true) {
            System.out.println("***** Inizia Combattimento *****");
            System.out.println(Arrays.toString(creaPersonaggi));
            System.out.println("Scegli il tuo personaggio oppure 0 per terminare il programma");
            for (int i = 0; i < creaPersonaggi.length; i++) {
                System.out.println("Cliccare: " + (i + 1) + " per " + creaPersonaggi[i].getNome());
            }
            int personaggio = Integer.parseInt(scanner.nextLine());
            if (personaggio == 0) {
                break;
            } else if (personaggio < 0 || personaggio > creaPersonaggi.length) {
                System.out.println("Scegli un personaggio tra quelli esistenti");
            } else {
                System.out.println("Questo  è il tuo personaggio: " + creaPersonaggi[personaggio - 1]);
                System.out.println("Seleziona il tuo avversario: ");
                for (int i = 0; i < creaPersonaggi.length; i++) {
                    System.out.println("Cliccare: " + (i + 1) + " per " + creaPersonaggi[i].getNome());
                }
                int avversario = Integer.parseInt(scanner.nextLine());
                Personaggio avversario1 = estrazioneCampione(creaPersonaggi, avversario);
            }

            System.out.println(avversario1);


        }


    }

    // METODO
    public static Personaggio estrazioneCampione(Personaggio[] personaggio, int x) {
        return switch (x) {
            case 1, 2, 3 -> personaggio[x - 1];
            default -> null;
        };
    }
}
