
package exerciciosuri;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/09/2017
 * @horario   23:08:33
 */
public class Uri_1066 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double num[] = new double[5];
        int contp = 0,conti = 0,contpo = 0,contneg = 0;
        for(int i = 0; i<num.length; i++){
            num[i] = scan.nextDouble();
        }
        for(int i = 0; i < num.length; i++){
            if(num[i]%2 == 0){
                contp++;
            }
        }
        for(int i = 0; i < num.length; i++){
            if(num[i]%2 != 0){
                conti++;
            }
        }
        for(int i = 0; i < num.length; i++){
            if(num[i] > 0){
                contpo++;
            }
        }
        for(int i = 0; i < num.length; i++){
        
            if(num[i]<0) {
                contneg++;
            }    
        }
        System.out.println(contp + " valor(es) par(es)");
        System.out.println(conti + " valor(es) impar(es)");
        System.out.println(contpo + " valor(es) positivo(s)");
        System.out.println(contneg + " valor(es) negativo(s)");
        
        
    }
}
