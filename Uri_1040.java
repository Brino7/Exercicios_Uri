
package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   29/08/2017
 * @horario   23:03:00
 */
public class Uri_1040 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.0");
        double n1, n2, n3, n4, media,notex = 0;
        n1 = scan.nextDouble();
        n2 = scan.nextDouble();
        n3 = scan.nextDouble();
        n4 = scan.nextDouble();
        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        System.out.println("Media: " + df.format(media));
        if(media >= 7.0){
            System.out.println("Aluno aprovado.");
        }else if(media < 5.0){
            System.out.println("Aluno reprovado.");
        }else if(media >= 5.0 && media <= 6.9){
            System.out.println("Aluno em exame.");
            notex = scan.nextDouble();
            System.out.println("Nota do exame: " + df.format(notex));
            media = (media + notex) / 2;
        
        if(media >= 5.0){
            System.out.println("Aluno aprovado.");
        }else{
            System.out.println("Aluno reprovado.");
        }
        System.out.println("Media final: " + df.format(media));
        }
        
        
    }
}
