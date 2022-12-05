package Pertemuan2;

import java.awt.event.*;
import javax.swing.*;

public class Biodata extends JFrame {

    public Biodata() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInputNama = new JLabel("Input Nama:");
        labelInputNama.setBounds(50, 30, 100, 20);
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(50, 60, 100, 30);

        JLabel labelInputNotelp = new JLabel("Input NoTelp:");
        labelInputNotelp.setBounds(210, 30, 100, 20);
        JTextField textFieldNotelp = new JTextField();
        textFieldNotelp.setBounds(210, 60, 100, 30);

        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(80, 150, 200, 200);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String noTelp = textFieldNotelp.getText();
                txtOutput.append(nama + " - " + noTelp + "\n -------------------------------- \n");
                textFieldNama.setText("");
                textFieldNotelp.setText("");
            }
        });

        this.add(button);
        this.add(labelInputNama);
        this.add(textFieldNama);
        this.add(labelInputNotelp);
        this.add(textFieldNotelp);
        this.add(txtOutput);

        this.setSize(400, 500);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Biodata b = new Biodata();
                b.setVisible(true);
            }
        });
    }
}