
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/10/2017
 * @horario   16:52:34
 */
public class Uri_1078 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, res;
        num = scan.nextInt();
        for(int i = 1; i <= 10; i++){
            res = i * num;
            System.out.println(i + " x " + num + " = " + res);
        }
    }
}
