
package exerciciosuri;

import java.util.Scanner;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   01/10/2017
 * @horario   19:13:35
 */
public class Uri_1049 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String nome1, nome2, nome3;
        nome1 = scan.nextLine();
        nome2 = scan.nextLine();
        nome3 = scan.nextLine();
        
        if(nome1.equals("vertebrado")){
            if(nome2.equals("ave")){
                if(nome3.equals("carnivoro")){
                    System.out.println("aguia");
                }else if(nome3.equals("onivoro")){
                    System.out.println("pomba");
                }
            }else if(nome2.equals("mamifero")){
                if(nome3.equals("onivoro")){
                    System.out.println("homem");
                }else if(nome3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }else if(nome1.equals("invertebrado")){
            if(nome2.equals("inseto")){
                if(nome3.equals("hematofago")){
                    System.out.println("pulga");
                }else if(nome3.equals("herbivoro")){
                    System.out.println("lagarta");
                }
            }else if(nome2.equals("anelideo")){
                if(nome3.equals("hematofago")){
                    System.out.println("sanguessuga");
                }else if(nome3.equals("onivoro")){
                    System.out.println("minhoca");
                }
            }
        }
    }
}
