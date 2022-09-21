package FirstAtiv;

import java.util.Scanner;
import static FirstAtiv.Verify.*;

public class Player {

    public static void players(int num_player, int players[], int v[], int validate[]) {

        Scanner scan = new Scanner(System.in);
        int guess = 0, valid = -1, aux = 0;

        for (int i = 0; i < num_player; i++) {

            valid = -1;
            aux = 0;
            System.out.println("Jogador " + (i + 1)
                    + " deve escolher um numero de 0-100(lembrando que ele precisara estar na lista): ");

            while (valid == -1) {

                guess = scan.nextInt();

                valid = verify(v, guess);

            }

            for (int index = valid; index < v.length; index++) {

                if (v[index] == guess) {
                    aux++;
                } else
                    break;

            }

            for (int index = valid - 1; index < v.length; index--) {

                if (v[index] == guess) {
                    aux++;
                } else
                    break;

            }

            validate[i] = aux;

            System.out.println("O numero " + guess + " foi escolhido com êxito!\n");

            players[i] = guess;

        }

    }

}
