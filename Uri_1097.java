package exerciciosuri;

/**
 *
 * @autor Anderson Silva Brino
 * @data 17/10/2017
 * @horario 10:08:20
 */
public class Uri_1097 {

    public static void main(String[] args) {
        int i, k = 5,j;
        for (i = 1; i <= 9; i += 2) {
            for (j = k+2; j >= k; j--) {
                System.out.println("I=" + i + " " + "J=" + j);

            }
            k += 2;
        }
    }
}
