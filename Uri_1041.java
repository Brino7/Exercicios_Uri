
package exerciciosuri;

import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   01/09/2017
 * @horario   16:25:17
 */
public class Uri_1041 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double x, y;
        x = scan.nextDouble();
        y = scan.nextDouble();
        if(x > 0 && y > 0){
            System.out.print("Q1\n");
        }else if(x < 0 && y > 0){
            System.out.print("Q2\n");
        }else if(x < 0 && y < 0){
            System.out.print("Q3\n");
        }else if(x > 0 && y < 0){
            System.out.print("Q4\n");
        }else if(x == 0 && y == 0){
            System.out.print("Origem\n");
        }else if(x != 0 && y == 0){
            System.out.print("Eixo X\n");
        }else if(x == 0 && y != 0){
            System.out.print("Eixo Y\n");
        }
    }
}
