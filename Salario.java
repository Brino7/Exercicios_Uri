
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   17:12:13
 */
public class Salario {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        int numero, totaldehoras;
        double valordahora, salario;
        numero = teclado.nextInt();
        totaldehoras = teclado.nextInt();
        valordahora = teclado.nextDouble();
        salario = (totaldehoras * valordahora);
        System.out.println("NUMBER = " + numero);
        System.out.println("SALARY = U$ " + df.format(salario));
    }
}
