
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   01/09/2017
 * @horario   19:22:16
 */
public class Uri_1042 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num[] = new int[3], i,j,aux, num1[] = new int[3];
        for(i = 0; i < num.length; i++){
            num[i] = scan.nextInt();
        }
        for(i = 0; i < num.length; i++){
            num1[i] = num[i];
        }
        for(i = 0; i < num.length; i++ ){
           for(j = 0; j < num.length - 1; j++)
            if(num[j] > num[j+1]){
                aux = num[j];
                num[j] = num[j+1];
                num[j+1] = aux;
                
            }         
        }
      
        for(i = 0; i < num.length; i++){
            
            System.out.println(num[i]);
        }
        System.out.println("");
        
        for(i = 0; i < num1.length;i++){
            System.out.println(num1[i]);
        }
    }
}
