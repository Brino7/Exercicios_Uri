
package exerciciosuri;
import java.util.Scanner;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   16:09:14
 */
public class SomaSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,soma = 0;
        a = teclado.nextInt();
        b = teclado.nextInt();
        soma = a + b;
        System.out.println("SOMA = "+ soma);
    }
}
