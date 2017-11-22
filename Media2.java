
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   16:37:53
 */
public class Media2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        double a, b, c, media;
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        media = ((a*2)+(b*3)+(c*5))/10;
        System.out.println("MEDIA = " + df.format(media));
        
    }
}
