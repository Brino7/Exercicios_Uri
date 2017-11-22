
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/09/2017
 * @horario   17:56:54
 */
public class Uri_1071 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
       int y = scan.nextInt();
       int soma = 0;
       if (x > y) {
           x--;
           for (int i = x; i > y; i--) {
               if (i % 2 != 0) {
                   soma += i;
               }
           }
       }  if(y > x){
           y--;
           for (int i = y; i >x; i--) {
               if (i % 2 != 0) {
                   soma += i;
               }
           }
       }
       System.out.println(soma);
    }
}
