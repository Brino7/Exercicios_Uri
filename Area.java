
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   14/08/2017
 * @horario   17:52:16
 */
public class Area {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        double areatriangulo, areacirculo, areatrapezio, 
               areaquadrado, arearetangulo, pi = 3.14159, a, b, c;
        
        a = teclado.nextDouble();
        b = teclado.nextDouble();
        c = teclado.nextDouble();
        
        areatriangulo = (a * c)/2;
        areacirculo = (pi * (c*c));
        areatrapezio = (a + b) * c / 2;
        arearetangulo = (a*b);
        areaquadrado = (b*b);
        
        System.out.println("TRIANGULO: " + df.format(areatriangulo));
        System.out.println("CIRCULO: " + df.format(areacirculo));
        System.out.println("TRAPEZIO: " + df.format(areatrapezio));
        System.out.println("QUADRADO: " + df.format(areaquadrado));
        System.out.println("RETANGULO: " + df.format(arearetangulo));
    }
}
