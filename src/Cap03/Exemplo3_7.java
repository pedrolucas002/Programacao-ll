package Cap03;
//Exemplo 3.7 do Capitolo 03

import java.io.*;
import javax.swing.JOptionPane;
public class Exemplo3_7 {
    public static void main(String args[]) throws IOException {
        String frase = JOptionPane.showInputDialog("Entre com uma frase:");
        try {
            FileWriter file = new FileWriter("c:/temp/frases.txt", true);
            PrintWriter out = new PrintWriter(file);
            out.println(frase);
            file.close();
            out.close();
            JOptionPane.showInputDialog(null, "Frase armazena no arquivo!");
        } catch (FileNotFoundException erro) {
            JOptionPane.showInputDialog(null, "Erro, verifique se a pasta c:/temp existe!");
        }
    }
}
