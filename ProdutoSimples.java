
package exerciciosuri;
import java.util.Scanner;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   16:17:40
 */
public class ProdutoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int a,b,prod;
        a = teclado.nextInt();
        b = teclado.nextInt();
        prod = a*b;
        System.out.println("PROD = " + prod);
    }
}
