package Cap03;
//Exemplo 3.8 do Capitolo 03

import java.io.IOException;
import javax.swing.JOptionPane;
public class Exemplo3_8 {
    public static void main(String args[]) throws IOException {
        try {
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Forneça sua idade"));
            if (idade < 18) {
                throw new Exception("Menor de Idade, entrada não permitida!!");
            } else {
                JOptionPane.showMessageDialog(null, "Idade válida, seja bem vindo!");
            }
            //continua a execução normalmente
        }catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.toString());
        }
    }
}
