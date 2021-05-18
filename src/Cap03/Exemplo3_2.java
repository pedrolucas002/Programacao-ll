package Cap03;
//Exemplo 3.2 do Capitolo 03

import javax.swing.*;
public class Exemplo3_2 {
    public static void main(String arg[]){
        String aux = JOptionPane.showInputDialog("Forneça o número do mês");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes >= 1 && mes <= 12) {
                    JOptionPane.showInputDialog(null, "Número do mês válido!\n " + mes);
                } else {
                    JOptionPane.showInputDialog(null, "Número do mês invàlido!\n " + mes);
                }
            } catch (NumberFormatException erro) {
                JOptionPane.showInputDialog(null, "Digite apenas valores inteiros "+erro);
            }
            System.exit(0);
        }
    }
}