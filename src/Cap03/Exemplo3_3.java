package Cap03;
//Exemplo 3.3 do Capitolo 03

import javax.swing.*;
public class Exemplo3_3 {
    public static void main(String args[]) {
        String aux = JOptionPane.showInputDialog("Forneça o número do mês");
        if (aux != null) {
            try {
                int mes = Integer.parseInt(aux);
                if (mes == 1) {
                    aux = "Janeiro";
                } else if (mes == 2) {
                    aux = "Fevereiro";
                } else if (mes == 3) {
                    aux = "Março";
                } //inserir todos os outros meses
                else  if (mes == 12) {
                    aux = "Dezembro";
                } else {
                    aux = "Mês Desconhecido!";
                }
                JOptionPane.showInputDialog(null, aux);
            } catch (NumberFormatException erro) {
                JOptionPane.showInputDialog(null, "Digite apenas valores inteiros "+erro);
            }
        }
        System.exit(0);
    }
}