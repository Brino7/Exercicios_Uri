package exerciciosuri;

import java.util.Scanner;

/**
 *
 * @autor Anderson Silva Brino
 * @data 06/10/2017
 * @horario 16:46:06
 */
public class Uri_1075 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        num = scan.nextInt();
        for (int i = 1; i < 10000; i++) {
            if (i % num == 2) {
                System.out.println(i);
            }
        }
    }
}
