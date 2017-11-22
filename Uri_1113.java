package exerciciosuri;

import java.util.Scanner;

/**
 *
 * @autor Anderson Silva Brino
 * @data 15/10/2017
 * @horario 20:07:57
 */
public class Uri_1113 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1, n2;
        n1 = scan.nextInt();
        n2 = scan.nextInt();
        if (n1 > n2) {
            System.out.println("Decrescente");
        }else if(n1 < n2){
            System.out.println("Crescente");
        }
    }

}
