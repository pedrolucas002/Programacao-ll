package Cap03;
//Exemplo 3.4 do Capitolo 03

import javax.swing.JOptionPane;
public class Exemplo3_4 {
    public static  void main(String[] args) {
        int a = 10, b =15, maior;
        if (a > b) {
            maior = a;
        }else {
            maior = b;
        }
        JOptionPane.showInputDialog(null, "Usando um if comum: " + maior);

        int c = 10, d = 8;
        maior = (c > d) ? c : d;
        JOptionPane.showInputDialog(null, "Usando um if resumido: " + maior);
    }
}
