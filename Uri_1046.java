
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   15/09/2017
 * @horario   15:49:32
 */
public class Uri_1046 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int h1, h2, tempojogo;
        h1 = scan.nextInt();
        h2 = scan.nextInt();
        
        if(h1 == h2){
            System.out.println("O JOGO DUROU 24 HORA(S)");
        }else if(h1 > h2){
            tempojogo = (24 - h1) + h2;
            System.out.println("O JOGO DUROU " + tempojogo + " HORA(S)");
        }else{
            tempojogo = (h2 - h1);
            System.out.println("O JOGO DUROU " + tempojogo + " HORA(S)");
        }
    }
}
