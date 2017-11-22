
package exerciciosuri;
import static java.lang.Math.abs;
import java.util.Scanner;
import java.text.DecimalFormat;
/**
 * 
 * @autor Anderson Silva Brino 
 * @data   14/08/2017
 * @horario   18:17:51
 */
public class OMaior {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a, b, c, maiorab;
        a = scan.nextInt();
        b = scan.nextInt();
        c = scan.nextInt();
        
        maiorab = (a + b + abs(a-b))/2;
        maiorab = (maiorab + c + abs(maiorab - c))/2;
                
        System.out.println(maiorab + " eh o maior");
    }
}
