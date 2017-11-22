
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   30/09/2017
 * @horario   21:02:57
 */
public class Uri_1070 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        for(int i = 0; i < 13; i++){
            if(num % 2 != 0){
                System.out.println(num);
            }
            num++;
        }
    }
}
