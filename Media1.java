
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   16:25:10
 */
public class Media1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00000");
        double a, b, media;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        media = ((a*3.5) + (b*7.5))/11;
        System.out.println("MEDIA = " + df.format(media));
    }
}
