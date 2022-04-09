package PROJETO01;

import javax.swing.*;
import java.text.DecimalFormat;

public class AreaDoTrianguloQualquer {
    public static void main(String[] args) {
        String caminhoImagem = String.format("C:\\Users\\alfre\\Downloads\\01 GIT\\src\\PROJETO01\\Imagens\\goku-icone.png");
        ImageIcon imagem = new ImageIcon(caminhoImagem);
        JOptionPane.showConfirmDialog(null, imagem, "Area do Triangulo :)", -1, JOptionPane.QUESTION_MESSAGE);
        String base = JOptionPane.showInputDialog("Informe o valor da base");
        String altura = JOptionPane.showInputDialog("Informe o valor da altura");
        long n1 = Long.parseLong(base);
        long n2 = Long.parseLong(altura);
        long result = (n1 * n2)/2;
        JOptionPane.showMessageDialog(null, "Beleza... O resultado é "+new DecimalFormat(".##").format(result));
    }
}
