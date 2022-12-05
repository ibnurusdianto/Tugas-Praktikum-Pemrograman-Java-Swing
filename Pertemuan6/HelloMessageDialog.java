package Pertemuan6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloMessageDialog extends JFrame {

    public HelloMessageDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Klik");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(HelloMessageDialog.this,
                        "Hallo, Selamat Datang di Praktikum Pemrograman II");
            }
        });

        this.add(button);
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloMessageDialog h = new HelloMessageDialog();
                h.setVisible(true);
            }
        });
    }
}
