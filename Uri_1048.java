package exerciciosuri;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner; 

public class Uri_1048 {
 
    public static void main(String[] args){
 
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        DecimalFormat df = new DecimalFormat();
        df.applyPattern("0.00");
        double salario, reajuste = 0, novosalario = 0;
        String porcentagem = "0";
        salario = scan.nextDouble();
        if((salario >= 0) && (salario <= 400)){
            reajuste = salario * 0.15;
            novosalario = salario + reajuste;
            porcentagem = "15";
        }else if(salario >= 400.01 && salario <= 800){
            reajuste = salario * 0.12;
            novosalario = salario + reajuste;
            porcentagem = "12";
        }else if(salario >= 800.01 && salario <= 1200){
            reajuste = salario * 0.10;
            novosalario = salario + reajuste;
            porcentagem = "10";
        }else if(salario >= 1200.01 && salario <= 2000){
            reajuste = salario * 0.07;
            novosalario = salario + reajuste;
            porcentagem = "7";
        }else if(salario >= 2000){
            reajuste = salario * 0.04;
            novosalario = salario + reajuste;
            porcentagem = "4";
        }
        System.out.println("Novo salario: "+ df.format(novosalario));
        System.out.println("Reajuste ganho: " + df.format(reajuste));
        System.out.println("Em percentual: " + porcentagem + "%");
 
    }
 
}