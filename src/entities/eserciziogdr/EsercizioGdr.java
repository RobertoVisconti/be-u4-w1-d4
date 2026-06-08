package entities.eserciziogdr;

import java.util.Scanner;

public class EsercizioGdr {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Crea Personaggio:");
        Personaggio[] creaPersonaggi = new Personaggio[3];
        for (int i = 0; i < creaPersonaggi.length; i++) {
            System.out.println("Scegli un Nome:");
            String nome = scanner.nextLine();
            System.out.println("Scegli la classe del personaggio: 1: Guerriero, 2: Mago, 3: Mercante");
            int classe = Integer.parseInt(scanner.nextLine());

            switch (classe){
                case 1 -> creaPersonaggi = new Guerriero(nome)
            }
        }

    }


}
