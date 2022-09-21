package FirstAtiv;

public class Verify {

    public static int verify(int v[], int guess) {

        int Index_init = 0;
        int Index_last = v.length - 1;

        while (Index_init <= Index_last) {
            int Index_mod = (Index_init + Index_last) / 2;

            if (v[Index_mod] == guess) {
                return Index_mod;
            }

            else if (v[Index_mod] < guess)
                Index_init = Index_mod + 1;

            else if (v[Index_mod] > guess)
                Index_last = Index_mod - 1;

        }
        return -1;
    }
}
