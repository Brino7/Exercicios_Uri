
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   08/08/2017
 * @horario   21:01:26
 */
public class AreaCirculo {
    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        Scanner teclado = new Scanner(System.in);
        double pi = 3.14159, area, raio;
        raio = teclado.nextDouble();
        area = pi*(raio*raio);
        System.out.println("A="+df.format(area));
    
    }
    
    
}

