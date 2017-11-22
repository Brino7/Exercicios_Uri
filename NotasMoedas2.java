package exerciciosuri;

import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;

/**
 *
 * @autor Anderson Silva Brino
 * @data 19/08/2017
 * @horario 18:02:33
 */
public class NotasMoedas2 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        int i, notas, moeda,j;
        double numero, resto;
        int not[] = {100, 50, 20, 10, 5, 2};
        double moedas[] = {1.00,0.50,0.25,0.10,0.05,0.01};
        
        numero = scan.nextDouble();
        
        System.out.println("NOTAS:");
        
        resto = (numero%100);
        notas = (int)(numero/100);
        System.out.println(notas + " nota(s) de R$ 100.00");

        for(i = 1; i < 6; i++){
            
            notas = (int)(resto/not[i]);
            resto = (resto%not[i]);
            System.out.println(notas + " nota(s) de R$ " + df.format((not[i])));
            
        }
        System.out.println("MOEDAS:"); 
        
        //resto = (numero%1);
        //resto = Math.round(resto);
        resto += 0.001; // para resolver o problema de arredondamento.
        //System.out.println(resto);
        for(j = 0; j < 6; j++){
           
           moeda = (int)(resto/moedas[j]);
           resto = (resto%moedas[j]);                    
           System.out.println(moeda + " moeda(s) de R$ " + df.format((moedas[j])));
           
        }
    }
}
