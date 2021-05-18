package Cap03;
//Exemplo 3.8 do Capitolo 03

import javax.swing.JOptionPane;
public class Exemplo3_9 {
    public static void main(String args[]) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("Froneça um numero"));
        try {
            int y = x / 0; //gera uma exececao
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro.getMessage());
            erro.printStackTrace();
        }
    }
}
