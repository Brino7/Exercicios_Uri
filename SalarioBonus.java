
package exerciciosuri;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   09/08/2017
 * @horario   17:43:14
 */
public class SalarioBonus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        String nome;
        double salariofixo, vendido, bonus, salario;
        nome = teclado.nextLine();
        salariofixo = teclado.nextDouble();
        vendido = teclado.nextDouble();
        bonus = (vendido * 0.15);
        salario = (salariofixo + bonus);
        System.out.println("TOTAL = R$ " + df.format(salario));
    }
}
