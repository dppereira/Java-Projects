package FirstAtiv;

import java.util.Random;
import java.util.Arrays;

public class Lista {

    public static void list(int v[]) {

        Random random = new Random();

        for (int i = 0; i < 100; i++) {

            v[i] = random.nextInt(100);
        }

        Arrays.sort(v);

        // confirmar se a lista foi feita corretamente
        System.out.println(Arrays.toString(v));

    }

}
