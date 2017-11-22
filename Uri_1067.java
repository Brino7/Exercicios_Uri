
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   30/09/2017
 * @horario   20:53:13
 */
public class Uri_1067 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        for(int i = 0; i <= num; i++){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }
}
