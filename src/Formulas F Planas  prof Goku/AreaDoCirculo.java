package PROJETO01;

import sun.misc.FloatingDecimal;

import javax.swing.*;
import java.text.DecimalFormat;

import static javax.swing.JOptionPane.DEFAULT_OPTION;

public class AreaDoCirculo {
    // metodo JOptionPane para criar uma tela de interatividade com o usuario


    public static void main(String[] args) {
        String caminhoImagem = String.format("C:\\Users\\alfre\\Downloads\\01 GIT\\src\\PROJETO01\\Imagens\\goku-icone.png");
        ImageIcon imagem = new ImageIcon(caminhoImagem);
        JOptionPane.showConfirmDialog(null, imagem, "Area do Circulo :) ", -1, JOptionPane.QUESTION_MESSAGE);
        String raio = JOptionPane.showInputDialog("Informe o valor do raio: ");     //leitura do teclado
        float n1 = Float.parseFloat(raio);
        float area = (float) (Math.PI*Math.pow(n1,2));
     JOptionPane.showConfirmDialog(null, "Belezaaa... A area o círculo é =  " + new DecimalFormat(".##").format(area));


    }
    }

