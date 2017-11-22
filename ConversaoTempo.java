
package exerciciosuri;
import java.util.Scanner;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   15/08/2017
 * @horario   18:23:14
 */
public class ConversaoTempo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int segundos, horas, minutos, numero;
        
        numero = scan.nextInt();
        horas = numero/3600;
        minutos = (numero - (3600*horas)) / 60;
        segundos = (numero - (3600 * horas) - (minutos*60));
        
        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}
