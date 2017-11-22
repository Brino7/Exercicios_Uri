
package exerciciosuri;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   16:48:33
 */
public class Diferenca {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a, b, c, d,diferenca;
        a = teclado.nextInt();
        b = teclado.nextInt();
        c = teclado.nextInt();
        d = teclado.nextInt();
        diferenca = ((a*b)-(c*d));
        System.out.println("DIFERENCA = " + diferenca);
    }
}
