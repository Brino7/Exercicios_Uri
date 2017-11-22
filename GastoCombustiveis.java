
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   15/08/2017
 * @horario   16:21:46
 */
public class GastoCombustiveis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.000");
        int tempogasto, velocidademedia;
        double resultado;
        tempogasto = scan.nextInt();
        velocidademedia = scan.nextInt();
        resultado = (tempogasto * velocidademedia)/12.0;
        System.out.println(df.format(resultado));
    }
}
