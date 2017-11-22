
package exerciciosuri;

import com.sun.org.apache.xerces.internal.impl.dtd.XMLDTDLoader;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/09/2017
 * @horario   16:55:02
 */
public class Uri_1060 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double num[] = new double[6];
        int cont = 0;
        for(int i = 0; i<num.length; i++){
            num[i] = scan.nextDouble();
        }
        for(int i = 0; i < num.length; i++){
            if(num[i]>0){
                cont++;
            }    
        }
        
        System.out.println(cont + " valores positivos");
        
    }
}
