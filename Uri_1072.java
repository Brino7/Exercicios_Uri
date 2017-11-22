
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/10/2017
 * @horario   15:55:51
 */
public class Uri_1072 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numv, in = 0, out = 0;
        numv = scan.nextInt();
        int num[] = new int[numv] , numint;
        for(int i = 0; i < num.length; i++){
            num[i] = scan.nextInt();
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] >= 10 && num[i] <= 20){
                in++;
            }else{
                out++;
            }
        }
        System.out.println(in + " in");
        System.out.println(out + " out");
    }
}
