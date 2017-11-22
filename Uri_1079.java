
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   06/10/2017
 * @horario   17:22:53
 */
public class Uri_1079 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        double numv[][] = new double[num][3], media = 0;
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 3; j++){
                numv[i][j] = scan.nextDouble();
            }
        }
        for(int i = 0; i < num; i++){
            for(int j = 0; j < 3; j++){
              
                //System.out.print(numv[i][j] + " ");
                media = ((numv[i][j] * 2) + (numv[i][j] * 3) + (numv[i][j] * 5))/10;
            }
            //System.out.print("\n");
            System.out.println(df.format(media));
        }
    }
}
