package exerciciosuri;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @autor Anderson Silva Brino
 * @data 09/09/2017
 * @horario 11:12:07
 */
public class Uri_1045 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        double num[] = new double[3], aux;
        for (int i = 0; i < num.length; i++) {
            num[i] = scan.nextDouble();
        }
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num.length - 1; j++) {
                if (num[j] < num[j + 1]) {
                    aux = num[j];
                    num[j] = num[j + 1];
                    num[j + 1] = aux;

                }
            }
        }
        if (num[0] >= num[1] + num[2]) {
            System.out.println("NAO FORMA TRIANGULO");
        } else if (Math.pow(num[0], 2) == (Math.pow(num[1], 2) + Math.pow(num[2], 2))) {
            System.out.println("TRIANGULO RETANGULO");
            if (num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else if (Math.pow(num[0], 2) > (Math.pow(num[1], 2) + Math.pow(num[2], 2))) {
            System.out.println("TRIANGULO OBTUSANGULO");
            if (num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        } else if (Math.pow(num[0], 2) < (Math.pow(num[1], 2) + Math.pow(num[2], 2))) {
            System.out.println("TRIANGULO ACUTANGULO");
            if (num[0] == num[1] && num[1] == num[2] && num[0] == num[2]) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (num[0] == num[1] || num[1] == num[2] || num[0] == num[2]) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
