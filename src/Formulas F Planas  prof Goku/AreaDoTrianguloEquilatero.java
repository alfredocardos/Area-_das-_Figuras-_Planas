package PROJETO01;

import javax.swing.*;
import java.text.DecimalFormat;

public class AreaDoTrianguloEquilatero {
    public static void main(String[] args) {
        String caminhoImagem = String.format("C:\\Users\\alfre\\Downloads\\01 GIT\\src\\PROJETO01\\Imagens\\goku-icone.png");
        ImageIcon imagem = new ImageIcon(caminhoImagem);
        JOptionPane.showConfirmDialog(null, imagem, "Area do Triangulo Equilatero", -1, JOptionPane.QUESTION_MESSAGE);
        String lado = JOptionPane.showInputDialog("Informe o valor do Lado =Altura");
        Double n1 = Double.parseDouble(lado);
        Double result = (n1 * n1 * Math.sqrt(3)) / 3;
        JOptionPane.showMessageDialog(null, "Beleza... O resultado é: " +new DecimalFormat(".##").format(result));

    }
}
