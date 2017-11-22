package exerciciosuri;

import java.util.Scanner;

/**
 *
 * @autor Anderson Silva Brino
 * @data 15/09/2017
 * @horario 17:35:26
 */
public class Uri_1047 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int horaInicial, minutoInicial, horaFinal, minutoFinal;
        horaInicial = scan.nextInt();
        minutoInicial = scan.nextInt();
        horaFinal = scan.nextInt();
        minutoFinal = scan.nextInt();

        if ((horaInicial == horaFinal) && (minutoInicial == minutoFinal)) {
            
            System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");
        
        } else if ((horaFinal > horaInicial) && (minutoFinal > minutoInicial)) {

            int tempoHoras = horaFinal - horaInicial;
            int tempoMin = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + tempoHoras + " HORA(S) E " + tempoMin + " MINUTO(S)");

        } else if ((horaFinal == horaInicial) && (minutoFinal < minutoInicial)) {
            
            int tempoHoras = 24;
            int tempoMin = (minutoFinal*60) - (minutoInicial*60);
            int tempoM = (tempoMin - (minutoFinal - minutoInicial))*(-1);
            int tempoHora = ((3600*tempoHoras) + tempoMin);
            int tempoHoraMinutos = tempoHora / 3600;
            
            System.out.println("O JOGO DUROU " + tempoHoraMinutos + " HORA(S) E " + tempoM + " MINUTO(S)");
            
        } else if((horaFinal == horaInicial) && (minutoFinal > minutoInicial)){
            
            int tempoHoras = horaFinal - horaInicial;
            int tempoMin = minutoFinal - minutoInicial;
           
            System.out.println("O JOGO DUROU " + tempoHoras + " HORA(S) E " + tempoMin + " MINUTO(S)");
        
        }else if((horaFinal > horaInicial) && (minutoFinal == minutoInicial)){
        
            int tempoHoras = horaFinal - horaInicial;
            int tempoMin = minutoFinal - minutoInicial;
            System.out.println("O JOGO DUROU " + tempoHoras + " HORA(S) E " + tempoMin + " MINUTO(S)");
        
        }else if((horaFinal > horaInicial) && (minutoFinal < minutoInicial)){
        
            int tempoHoras = horaFinal - horaInicial;
            int tempoMin = (minutoFinal*60) - (minutoInicial*60);
            int tempoDecorridoHoras = ((tempoHoras * 3600) + tempoMin)/3600;
            int tempoDecorridoMin = ((3600 + tempoMin)/60);
            
            System.out.println("O JOGO DUROU " + tempoDecorridoHoras + " HORA(S) E " + tempoDecorridoMin + " MINUTO(S)");
        
        }else if((horaFinal < horaInicial) && (minutoFinal < minutoInicial)){
        
            int tempoHoras = (24 - horaInicial) + horaFinal;
            int tempoMin = (minutoFinal*60) - (minutoInicial*60);
            int tempoDecorridoHoras = ((tempoHoras * 3600) + tempoMin)/3600;
            int tempoDecorridoMin = (3600 + tempoMin)/60;
            System.out.println("O JOGO DUROU " + tempoDecorridoHoras + " HORA(S) E " + tempoDecorridoMin + " MINUTO(S)");
        
        }else if((horaFinal < horaInicial) && (minutoFinal > minutoInicial)){
            
            int tempoHoras = (24 + (horaFinal - horaInicial));
            int tempoMin = (minutoFinal*60) - (minutoInicial*60);
            int tempoDecorridoHoras = ((tempoHoras * 3600) + tempoMin)/3600;
            int tempoDecorridoMin = tempoMin/60;
            
           System.out.println("O JOGO DUROU " + tempoDecorridoHoras + " HORA(S) E " + tempoDecorridoMin + " MINUTO(S)");
        
        }else if((horaFinal < horaInicial) && (minutoFinal == minutoInicial)){
            
            int tempoHoras = (24 + (horaFinal - horaInicial));
            int tempoMin = minutoFinal - minutoInicial;
            int tempoDecorridoHoras = ((tempoHoras * 3600) + tempoMin)/3600;
            int tempoDecorridoMin = tempoMin;
            
            System.out.println("O JOGO DUROU " + tempoDecorridoHoras + " HORA(S) E " + tempoDecorridoMin + " MINUTO(S)");
        
        }else{
        
            int tempoHoras = horaFinal - horaInicial;
            int tempoMin = minutoFinal - minutoInicial;
            int tempoDecorridoMin = (60 * tempoHoras) + tempoMin;
            int tempoDecorridoHoras = tempoHoras + tempoMin;
            System.out.println("O JOGO DUROU " + tempoDecorridoHoras + " HORA(S) E " + tempoDecorridoMin + " MINUTO(S)");
        
        }

    }

}
