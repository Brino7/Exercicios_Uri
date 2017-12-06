package exerciciosuri;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @autor Anderson Silva Brino
 * @data 22/11/2017
 * @horario 15:44:38
 */
public class Uri_1061 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int diaIn = 0, diaFi = 0, horaIn, horaFin, minIn, minFin, segIn, segFin;
        try {
            diaIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia inicial do evento."));
            horaIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora inicial do evento."));
            minIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos iniciais do evento."));
            segIn = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os segundos iniciais do evento."));

            diaFi = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia final do evento."));
            horaFin = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a hora final do evento."));
            minFin = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os minutos finais do evento."));
            segFin = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite os segunds finais do evento."));
        } catch (NumberFormatException er) {
            JOptionPane.showMessageDialog(null, "Numero em formato inválido.");
        }
        if (diaIn == diaFi) {
            int diasSeg = diaIn * (24 * 3600);
        } else {
            int diasSeg;
            diasSeg = ((diaFi * (24 * 3600)) - ((24 * 3600) * diaIn));
        }

    }
}
