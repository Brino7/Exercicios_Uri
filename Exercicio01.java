
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   08/08/2017
 * @horario   19:10:48
 */
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int n1,n2,r = 0;
        
        n1 = teclado.nextInt();
        n2 = teclado.nextInt();
        
        r = n1 + n2;
        
        System.out.println("X = " + r);
        
    }
}
