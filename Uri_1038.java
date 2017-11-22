
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/08/2017
 * @horario   11:06:03
 */
public class Uri_1038 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        int codigo,quant;
        double apagar = 0;
        codigo = scan.nextInt();
        quant = scan.nextInt();
        switch(codigo){
            case 1:
                apagar = quant * 4.00;
                break;
            case 2:
                apagar = quant * 4.50;
                break;
            case 3:
                apagar = quant * 5.00;
                break;
            case 4:
                apagar = quant * 2.00;
                break;
            case 5:
                apagar = quant * 1.50;
                break;
        }
        System.out.println("Total: R$ " + df.format(apagar));
    }
}
