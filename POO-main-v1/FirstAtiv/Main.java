package FirstAtiv;

import static FirstAtiv.Lista.*;
import static FirstAtiv.Quant.*;
import static FirstAtiv.Player.*;
import static FirstAtiv.Game.*;
//import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] v = new int[100];
        int rep = 0;

        do {
            int num_player_aux = 0, num_player;

            // Quantos n jogadores terao

            num_player = num(num_player_aux);

            int[] players = new int[num_player];
            int[] validate = new int[num_player];

            // criar e preencher lista com 100 numeros inteiros aleatorios
            list(v);

            // criacao do player
            players(num_player, players, v, validate);

            
             // teste das matrizes
             //System.out.println(Arrays.toString(players)); //(numero que o jogador quis acertar)
             //System.out.println(Arrays.toString(validate)); //(numero de repeticoes de kda numero)
             

            // O jogo eh iniciado
            game(players, v, validate);

            // colocar escolha de começar outro jogo ou encerrar o sistema

            System.out.println("Caso queira jogar denovo:(0)\nCaso queira encerrar o jogo:(1)");
            rep = scan.nextInt();

        } while (rep == 0);
    }

}
