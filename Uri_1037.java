
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/08/2017
 * @horario   22:21:06
 */
public class Uri_1037 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double numero;
        numero = scan.nextDouble();
        if(numero < 0 || numero > 100){
            System.out.println("Fora de intervalo");
        }else if(numero >= 0 && numero <= 25 ){
            System.out.println("Intervalo [0,25]");
        }else if(numero > 25 && numero <= 50){
            System.out.println("Intervalo (25,50]");
        }else if(numero > 50 && numero <= 75){
            System.out.println("Intervalo (50,75]");
        }else if(numero > 75 && numero <=100){
            System.out.println("Intervalo (75,100]");
        }
    }
}
