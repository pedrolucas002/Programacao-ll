package Cap03;
//Exemplo 3.6 do Capitolo 03

import javax.swing.JOptionPane;
import java.util.Locale;

public class Exemplo3_6 {
    public static void main(String args[]) {
        try {
            String aux1 = JOptionPane.showInputDialog("Forneça o valor do 1º nùmero:");
            int num1 = Integer.parseInt(aux1.toString());
            String aux2 = JOptionPane.showInputDialog("Forneça o valor do 2º número:");
            int num2 = Integer.parseInt(aux2.toString());
            JOptionPane.showInputDialog(null, "Soma = " + (num1 + num2));
            JOptionPane.showInputDialog(null, "Subtração = " + (num1 - num2));
            JOptionPane.showInputDialog(null, "Multiplicação = "+ (num1 * num2));
            JOptionPane.showInputDialog(null, "Divisão = " + (num1 / num2));
        } catch (ArithmeticException erro) {
            JOptionPane.showInputDialog(null, "Erro de divisão por zero!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NumberFormatException erro) {
            JOptionPane.showInputDialog(null, "Erro de Conversão!\n" + erro.toString(), "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (NullPointerException erro) {
            JOptionPane.showInputDialog(null, "Tecla Cancel pressionada\n" + erro.toString(), "Cancelado pelo usúario", JOptionPane.ERROR_MESSAGE);
        } finally {
            JOptionPane.showInputDialog(null, "Final da execução!");
        }
        System.exit(0);
    }
}
