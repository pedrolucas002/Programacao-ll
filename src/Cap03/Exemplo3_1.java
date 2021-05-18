package Cap03;
//Exemplo 3.1 do Capitolo 03

import javax.swing.JOptionPane;
public class Exemplo3_1 {
    public static void main(String[] args) {
        Object[] op = {"Masculino", "Feminino"};
        String resp = (String) JOptionPane.showInputDialog(null,
                "Selecione o sexo:\n", "Pesquisa",
                JOptionPane.PLAIN_MESSAGE,
                null,op, "Masculino");
        if (resp == null) {
            JOptionPane.showMessageDialog(null, "Voçê pressionou Cancel");
        }
        if(resp== "Masculino") {
            JOptionPane.showInputDialog(null, "Voçê é homem");
        }
        if(resp== "Feminino") {
            JOptionPane.showInputDialog(null, "Voçê é mulher");
        }
        System.exit(0);
    }
}