
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * 
 * @autor Anderson Silva Brino 
 * @data   14/08/2017
 * @horario   16:54:29
 */
public class Esfera {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        double raio, pi = 3.14159, volume;
        raio = teclado.nextDouble();
        volume = ((4.0/3) * pi * (raio * raio * raio));
        System.out.println("VOLUME = " + df.format(volume));
    }
}
