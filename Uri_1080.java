
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   13/10/2017
 * @horario   16:16:54
 */
public class Uri_1080 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 0, ind = 0;
        
        int num[] = new int [100];
        
        for(int i = 1; i < 100; i++){
            num[i] = scan.nextInt();
        }
        for(int i = 1; i < 100; i++){
            
            if(num[i] > n){
                n = num[i];
                ind = i;
            }
        }
        System.out.println(n);
        System.out.println(ind);
    }
}
