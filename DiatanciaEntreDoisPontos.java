
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   15/08/2017
 * @horario   09:50:57
 */
public class DiatanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0000");
        double x1, x2, y1, y2, distancia;
        x1 = scan.nextDouble();
        y1 = scan.nextDouble();
        x2 = scan.nextDouble();
        y2 = scan.nextDouble();
        
        distancia = Math.sqrt(Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2));
        
        System.out.println(df.format(distancia));
    }
}
