package Pertemuan6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloConfirmDialog extends JFrame {

    public HelloConfirmDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Exit");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int confirmation = JOptionPane.showConfirmDialog(HelloConfirmDialog.this,
                        "Apakah anda yakin ingin keluar dari", "Konfirmasi", JOptionPane.YES_NO_CANCEL_OPTION);
                if (confirmation == JOptionPane.YES_OPTION) {
                    System.exit(0);
                } else {
                    JOptionPane.showMessageDialog(HelloConfirmDialog.this, "Anda menekan tombol NO");
                }
            }
        });

        this.add(button);
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloConfirmDialog h = new HelloConfirmDialog();
                h.setVisible(true);
            }
        });
    }
}
