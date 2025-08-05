package org.example;//package org.example;
//
//import javax.swing.*;
//import java.awt.*;
//import java.awt.event.MouseAdapter;
//import java.awt.event.MouseEvent;
//
//public class FormularioContato {
//    public static void main(String[] args) {
//        JFrame frame = new JFrame("Formulário de Contato");
//        frame.setSize(450, 450);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//
//        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT, 10, 10));
//
//        // Componentes
//        JLabel nomeLabel = new JLabel("Nome:");
//        JTextField nomeField = new JTextField(20);
//
//        JLabel comentarioLabel = new JLabel("Comentário:");
//        JTextArea comentarioArea = new JTextArea(5, 20);
//        JScrollPane comentarioScroll = new JScrollPane(comentarioArea);
//
//        JCheckBox interesseAWS = new JCheckBox("Tem interesse em AWS?");
//
//        JLabel novidadesLabel = new JLabel("Receber novidades?");
//        JRadioButton radioSim = new JRadioButton("Sim");
//        JRadioButton radioNao = new JRadioButton("Não");
//        ButtonGroup grupo = new ButtonGroup();
//        grupo.add(radioSim);
//        grupo.add(radioNao);
//
//        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 0));
//        radioPanel.add(radioSim);
//        radioPanel.add(radioNao);
//
//        JButton enviarButton = new JButton("Enviar");
//
//        // Adicionando componentes ao painel
//        panel.add(nomeLabel);
//        panel.add(nomeField);
//
//        panel.add(comentarioLabel);
//        panel.add(comentarioScroll);
//
//        panel.add(interesseAWS);
//
//        panel.add(novidadesLabel);
//        panel.add(radioPanel);
//
//        panel.add(enviarButton);
//
//        // Action Listener
//        enviarButton.addActionListener(e -> {
//            String nome = nomeField.getText().trim();
//            String comentario = comentarioArea.getText().trim();
//
//            if (nome.isEmpty() || comentario.isEmpty()) {
//                JOptionPane.showMessageDialog(frame, "Preencha todos os campos!", "Erro", JOptionPane.ERROR_MESSAGE);
//                return;
//            }
//
//            String interesse = interesseAWS.isSelected() ? "Sim" : "Não";
//            String novidades = radioSim.isSelected() ? "Sim" : (radioNao.isSelected() ? "Não" : "Não informado");
//
//            String mensagem = String.format(
//                    "Nome: %s\nComentário: %s\nInteresse em AWS: %s\nReceber novidades: %s",
//                    nome, comentario, interesse, novidades
//            );
//
//            JOptionPane.showMessageDialog(frame, mensagem, "Dados Enviados", JOptionPane.INFORMATION_MESSAGE);
//        });
//
//        // Mouse Hover
//        enviarButton.addMouseListener(new MouseAdapter() {
//            public void mouseEntered(MouseEvent e) {
//                enviarButton.setText("Clique para Enviar");
//            }
//
//            public void mouseExited(MouseEvent e) {
//                enviarButton.setText("Enviar");
//            }
//        });
//
//        frame.add(panel);
//        frame.setLocationRelativeTo(null); // Centraliza
//        frame.setVisible(true);
//    }
//}
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class FormularioContato {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Formulário de Contato");
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());

        JLabel nomeLabel = new JLabel("Nome:");
        JTextField nomeField = new JTextField(20);

        JLabel comentarioLabel = new JLabel("Comentário:");
        JTextArea comentarioArea = new JTextArea(5, 10);

        JCheckBox interesseAWS = new JCheckBox("Tem interesse em AWS?");
        JRadioButton radioSim = new JRadioButton("Sim");
        JRadioButton radioNao = new JRadioButton("Não");
        ButtonGroup grupo = new ButtonGroup();
        grupo.add(radioSim);
        grupo.add(radioNao);

        JButton enviarButton = new JButton("Enviar");

        // Adiciona os componentes ao painel
        panel.add(nomeLabel);
        panel.add(nomeField);
        panel.add(comentarioLabel);
        panel.add(comentarioArea);
        panel.add(interesseAWS);
        panel.add(radioSim);
        panel.add(radioNao);
        panel.add(enviarButton);

        // Action Listener
        enviarButton.addActionListener(e -> {
            String nome = nomeField.getText();
            String comentario = comentarioArea.getText();
            System.out.println("Nome: " + nome + ", Comentário: " + comentario);
        });

        // Mouse Listener (extra)
        enviarButton.addMouseListener(new MouseAdapter() {
            public void mouseEntered(MouseEvent e) {
                enviarButton.setText("Clique para Enviar");
            }

            public void mouseExited(MouseEvent e) {
                enviarButton.setText("Enviar");
            }
        });

        frame.add(panel);
        frame.setVisible(true);
    }
}
