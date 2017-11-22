
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   20/08/2017
 * @horario   17:27:55
 */
public class TesteSelecao {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, d;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        d = scan.nextInt();
        
        if(b > c && d > a && (c + d) > (a + b) && c > 0 && d > 0){
            System.out.println("Valores aceitos");
        }else{
            System.out.println("Valores nao aceitos");
        }
    }
}
