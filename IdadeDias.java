
package exerciciosuri;
import java.util.Scanner;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   16/08/2017
 * @horario   19:09:17
 */
public class IdadeDias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numero, ano, mes, dia;
        numero = scan.nextInt();
        ano = (numero/365);
        mes = (numero - (ano*365))/30;
        dia = (numero - (ano*365) - (mes*30));
        
        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}
