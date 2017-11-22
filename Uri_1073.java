
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   01/10/2017
 * @horario   18:48:42
 */
public class Uri_1073 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num, res;
        num = scan.nextInt();
        for(int i = 1; i <= num; i++){
            if (i % 2 == 0){
                res = (int) Math.pow(i, 2);
                System.out.println(i + "^2 = " + res);
            }
        }
    }
}
