package Pertemuan3;

import java.awt.event.*;
import javax.swing.*;

public class Biodata extends JFrame {

    private boolean checkBoxSelected;

    public Biodata() {
        this.checkBoxSelected = false;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel labelInputNama = new JLabel("Input Nama:");
        labelInputNama.setBounds(15, 40, 350, 15);
        JTextField textFieldNama = new JTextField();
        textFieldNama.setBounds(15, 65, 350, 30);

        JLabel labelInputNotelp = new JLabel("Input NoTelp:");
        labelInputNotelp.setBounds(15, 100, 350, 15);
        JTextField textFieldNotelp = new JTextField();
        textFieldNotelp.setBounds(15, 120, 350, 30);

        JRadioButton radioButtonL = new JRadioButton("Laki-Laki", true);
        radioButtonL.setBounds(15, 150, 350, 30);

        JRadioButton radioButtonP = new JRadioButton("Perempuan");
        radioButtonP.setBounds(15, 180, 350, 30);

        JCheckBox checkBox = new JCheckBox("Warga Negara Asing");
        checkBox.setBounds(15, 205, 350, 30);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 235, 100, 40);

        JTextArea txtOutput = new JTextArea("");
        txtOutput.setBounds(15, 280, 350, 100);

        ButtonGroup bg = new ButtonGroup();
        bg.add(radioButtonL);
        bg.add(radioButtonP);

        checkBox.addItemListener(new ItemListener() {
            public void itemStateChanged(ItemEvent e) {
                checkBoxSelected = e.getStateChange() == 1;
            }
        });

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = textFieldNama.getText();
                String noTelp = textFieldNotelp.getText();
                String jenisKelamin = "";
                String WNA = "";

                if (radioButtonL.isSelected()) {
                    jenisKelamin = radioButtonL.getText();
                }
                if (radioButtonP.isSelected()) {
                    jenisKelamin = radioButtonP.getText();
                }

                if (checkBoxSelected) {
                    WNA = "Ya";
                } else {
                    WNA = "Tidak";
                }

                txtOutput.append("Nama  :" + nama + "\n" +
                        "Nomor HP   :" + noTelp + "\n" +
                        "Jenis Kelamin  :" + jenisKelamin + "\n" +
                        "WNA    :" + WNA + "\n===============================\n");

                textFieldNama.setText("");
                textFieldNotelp.setText("");
            }
        });

        this.add(button);
        this.add(labelInputNama);
        this.add(textFieldNama);
        this.add(labelInputNotelp);
        this.add(textFieldNotelp);
        this.add(radioButtonL);
        this.add(radioButtonP);
        this.add(checkBox);
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