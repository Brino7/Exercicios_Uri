
package exerciciosuri;
import static java.lang.Math.abs;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   15/08/2017
 * @horario   09:21:42
 */
public class Consumo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        int quilometragem;
        double combustivelgasto, consumomedio;
        
        quilometragem = scan.nextInt();
        combustivelgasto = scan.nextDouble();
        
        consumomedio = quilometragem / combustivelgasto;
        
        System.out.println(df.format(consumomedio) + " km/l");
        
    }
}
