package FirstAtiv;

import java.util.Scanner;
import java.lang.Math;

public class Game {

    public static void game(int players[], int v[], int validate[]) {

        Scanner scan = new Scanner(System.in);

        int[] win = new int[players.length];

        int guess = 0, aux = 0, comp = 0;

        System.out.println("Que os jogos comecem!\n");

        for (int i = 0; i < players.length; i++) {

            System.out.println(
                    "Jogador " + (i + 1) + ", quantas vezes voce acha que o numero " + players[i]
                            + " apareceu na lista");

            aux = 0;
            for (int j = 0; j < 5; j++) {

                guess = scan.nextInt();

                comp = validate[i] - guess;

                if (validate[i] == guess) {
                    System.out.println("Voce acertou!\n");
                    aux++;
                    break;
                } else if (Math.abs(comp) < 2) {
                    System.out.println("Esta quente!");
                } else if (Math.abs(comp) < 3) {
                    System.out.println("Esta esquentando!");
                } else if (Math.abs(comp) < 4) {
                    System.out.println("Esta frio!");
                } else {
                    System.out.println("Esta congelado!");
                }

                aux++;
            }

            win[i] = aux;

            guess = 0;

        }

        aux = 5;
        int aux2 = 0;

        for (int i = 0; i < win.length; i++) {

            if (win[i] < aux) {
                aux = win[i];
                aux2 = i;
            }

        }

        System.out.println("O vencedor eh o jogador " + (aux2 + 1) + " com " + win[aux2] + " tentativas!");

    }

}
