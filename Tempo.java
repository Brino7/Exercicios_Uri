
package exerciciosuri;

/**
 * 
 * @autor Anderson Silva Brino 
 * @data   20/08/2017
 * @horario   22:36:45
 */
public class Tempo {
    public static void main(String[] args) {
        long totalMilisegundos = System.currentTimeMillis() - 10800000;
        long totalSegundos = totalMilisegundos / 1000;
        long segundoAtual = totalSegundos % 60;
        long totalMinutos = totalSegundos / 60;
        long minutoAtual = totalMinutos % 60;
        long totalHora = totalMinutos / 60;
        long horaAtual = totalHora % 24;
        
        System.out.println(horaAtual + ":" + minutoAtual + ":" + segundoAtual);
    }
}