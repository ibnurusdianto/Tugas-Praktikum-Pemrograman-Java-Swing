package Pertemuan6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloInputDialog extends JFrame {

    public HelloInputDialog() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button = new JButton("input");
        button.setBounds(130, 100, 100, 40);

        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog(HelloInputDialog.this, "Inputkan nama anda");
                JOptionPane.showMessageDialog(HelloInputDialog.this, "Hello, " + nama);
            }
        });

        this.add(button);
        this.setSize(200, 200);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                HelloInputDialog h = new HelloInputDialog();
                h.setVisible(true);
            }
        });
    }
}
