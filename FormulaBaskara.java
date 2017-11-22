
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   20/08/2017
 * @horario   20:25:00
 */
public class FormulaBaskara {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00000");
        double a, b, c, r1, r2, delta;
        a = scan.nextDouble();
        b = scan.nextDouble();
        c = scan.nextDouble();
        
        delta = Math.pow(b, 2) - 4 * a * c;
        
        if(a == 0 || delta < 0){
            
            System.out.println("Impossivel calcular");
        
        }else{
            
            r1 = (- b + Math.sqrt(delta)) / (2 * a);
            r2 = (- b - Math.sqrt(delta)) / (2 * a);
            
            System.out.println("R1 = " + df.format(r1));
            System.out.println("R2 = " + df.format(r2));
        
        }
    }
}
