package PROJETO01;


import javax.swing.*;

// metodo JOptionPane para criar uma tela de interatividade com o usuario
public class AreaDoQuadrado {
    public static void main(String[] args) {
        String caminhoDaImagem = String.format("C:\\Users\\alfre\\Downloads\\01 GIT\\src\\PROJETO01\\Imagens\\goku-icone.png");
        ImageIcon imagem = new ImageIcon(caminhoDaImagem);
        JOptionPane.showConfirmDialog(null, imagem, "Area do Quadrado :)", -1, JOptionPane.QUESTION_MESSAGE);//caixa de dialogo
        String base = JOptionPane.showInputDialog("Informe o valor da base");             //leitura do teclado
        String altura = JOptionPane.showInputDialog("Informe o valor da altura");          //leitura do teclado
        Float n1 = Float.parseFloat(base);              // converter a string em float
        Float n2 = Float.parseFloat(altura);
        Float areaQuadrado = n1 * n2;

        JOptionPane.showMessageDialog(null, "Voltei... O resultado : " + areaQuadrado);
    }


}




