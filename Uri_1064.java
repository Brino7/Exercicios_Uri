package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @autor Anderson Silva Brino
 * @data 29/09/2017
 * @horario 22:54:18
 */
public class Uri_1064 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        Scanner scan = new Scanner(System.in);
        double num[] = new double[6], media = 0;
        int cont = 0;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            if (num[i] > 0) {
                cont++;
                media += num[i];
            }
        }

        media /= cont;
        System.out.println(cont + " valores positivos");
        System.out.println(df.format(media));
    }
}
