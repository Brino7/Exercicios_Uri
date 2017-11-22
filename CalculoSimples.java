
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   18:31:31
 */
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        int codigo1, codigo2, numerodepecas1, numerodepecas2;
        double valorunitario1, valorunitario2, valortotal;
        codigo1 = teclado.nextInt();
        numerodepecas1 = teclado.nextInt();
        valorunitario1 = teclado.nextDouble();
        
        codigo2 = teclado.nextInt();
        numerodepecas2 = teclado.nextInt();
        valorunitario2 = teclado.nextDouble();
        
        valortotal = ((valorunitario1 * numerodepecas1) + (valorunitario2 * numerodepecas2));
        
        System.out.println("VALOR A PAGAR: R$ " + df.format(valortotal));
        
    }
}
