package FirstAtiv;

import java.util.Scanner;

public class Quant {

    public static int num(int num_player_aux) {

        Scanner scan = new Scanner(System.in);

        while (num_player_aux < 1) {
            System.out.println("Numero de jogadores: ");
            num_player_aux = scan.nextInt();
        }

        System.out.println("Os " + num_player_aux + " jogadores devem escolher seus numeros!\n");

        return num_player_aux;

    }

}
