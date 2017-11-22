
package exerciciosuri;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/09/2017
 * @horario   23:04:17
 */
public class Uri_1065 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double num[] = new double[5];
        int cont = 0;
        for(int i = 0; i<num.length; i++){
            num[i] = scan.nextDouble();
        }
        for(int i = 0; i < num.length; i++){
            if(num[i]%2 == 0){
                cont++;
            }    
        }
        
        System.out.println(cont + " valores pares");
    }
}
