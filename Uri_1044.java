
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/09/2017
 * @horario   17:03:55
 */
public class Uri_1044 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b;
        a = scan.nextInt();
        b = scan.nextInt();
        if(((b % a) == 0) || ((a % b) == 0)){
            System.out.println("Sao Multiplos");
        }else{
            System.out.println("Nao sao Multiplos");
        }
    }
}
