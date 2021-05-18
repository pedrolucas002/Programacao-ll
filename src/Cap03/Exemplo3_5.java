package Cap03;
//Exemplo 3.5 do Capitolo 03

import javax.swing.*;
public class Exemplo3_5 {
    public static void main(String args[]) {
        String mes = (String) JOptionPane.showInputDialog("Forneça o número do mês");
        if (mes != null) {
            switch (mes){
                case  "1":
                    mes = "janeiro";
                    break;
                case "2":
                    mes = "fevereiro";
                    break;
                case "3":
                    mes = "Março";
                    break;
                //inserir todos os outros meses
                default:
                    mes = "Mês Desconhecido!";
            }
            JOptionPane.showInputDialog(null, mes);
        }
        System.exit(0);
    }
}
