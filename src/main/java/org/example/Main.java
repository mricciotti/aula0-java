package org.example;
//import javax.swing.*;
//
//public class Main {
//    public static void main (String[] args){
//        JFrame frame = new JFrame("Minha primeira interface");
//        JButton botao = new JButton("Clique auqi");
//
//        botao.addActionListener(e -> JOptionPane.showMessageDialog(null, "VOCE CLICOU!!"));
//
//        frame.add(botao);
//        frame.setSize(1800,1800);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
public class Main{
public static void main (String[] args) {
    JFrame frame = new JFrame("Formulário de Contato");
    frame.setSize(400, 400);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    JPanel panel = new JPanel();
    panel.setLayout(new FlowLayout());

    JLabel nomeLabel = new JLabel("Nome:");
    JTextField nomeField = new JTextField(20);

    JLabel comentarioLabel = new JLabel("Comentário:");
    JTextArea comentarioArea = new JTextArea(5, 20);

    JCheckBox interesseAWS = new JCheckBox("Tem interesse em AWS?");
    JRadioButton radioSim = new JRadioButton("Sim");
    JRadioButton radioNao = new JRadioButton("Não");
    ButtonGroup grupo = new ButtonGroup();
    grupo.add(radioSim);
    grupo.add(radioNao);

    JButton enviarButton = new JButton("Enviar");
}
}