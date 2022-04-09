package PROJETO01;

import javax.swing.*;
import java.text.DecimalFormat;

public class AreaDoTrapezio {
    public static void main(String[] args) {
        String caminhoImagem = String.format("C:\\Users\\alfre\\Downloads\\01 GIT\\src\\PROJETO01\\Imagens\\goku-icone.png");
        ImageIcon imagem = new ImageIcon(caminhoImagem);
        JOptionPane.showConfirmDialog(null, imagem, "Area do Trapézio :)", -1, JOptionPane.QUESTION_MESSAGE);
        String baseMaior = JOptionPane.showInputDialog("Informe o valor da base maior");
        String baseMenor = JOptionPane.showInputDialog("Informe o valor da base menor");
        String altura = JOptionPane.showInputDialog("Informe o valor da altura");
        double n1 = Double.parseDouble(baseMaior);
        double n2 = Double.parseDouble(baseMenor);
        double n3 = Double.parseDouble(altura);
        double result = ((n1 + n2) * n3) / 2;
        JOptionPane.showMessageDialog(null, "Beleza... O resultado é: " + new DecimalFormat(".##").format(result));


    }
}
