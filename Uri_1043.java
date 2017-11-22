
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/09/2017
 * @horario   16:08:46
 */
public class Uri_1043 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        Scanner scan = new Scanner(System.in);
         float a, b, c;
        float perimetro, areaTrapezio;
        a = scan.nextFloat();
        b = scan.nextFloat();
        c = scan.nextFloat();
        if(a < (b + c) && a > (b - c) && b < (a + c) && b > (a - c) && c < (a + b) && c > (a - b)){
            perimetro = a + b + c;
            System.out.println("Perimetro = " + df.format(perimetro));
        }else{
            areaTrapezio = ((a + b)*c)/2;
            System.out.println("Area = " + df.format(areaTrapezio));
        }
        
    }
}
