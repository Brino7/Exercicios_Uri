
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   25/09/2017
 * @horario   18:55:51
 */
public class Uri_1052 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int mes;
        mes = scan.nextInt();
        String mesAno[] = {" ","January","February","March", "April","May","June","July","August","September","October","November","December"};
        for(int i = 1; i < mesAno.length; i++){
            if(mes == i){
                System.out.println(mesAno[i]);
            }
        }
    }
}
