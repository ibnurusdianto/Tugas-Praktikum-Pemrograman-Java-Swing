package UTS;

import java.awt.event.*;
import javax.swing.*;

public class Frame extends JFrame {
    public Frame() {
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                int exit = JOptionPane.showConfirmDialog(null,
                        "Apakah anda yakin ingin keluar?", "Keluar",
                        JOptionPane.YES_NO_OPTION);

                if (exit == JOptionPane.YES_OPTION) {
                    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                } else {
                    setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });

        JLabel labelJudul = new JLabel("Input Judul:");
        labelJudul.setBounds(15, 25, 350, 30);
        JTextField textFieldJudul = new JTextField();
        textFieldJudul.setBounds(15, 50, 350, 30);

        JLabel labelGenre = new JLabel("Genre: ");
        labelGenre.setBounds(15, 80, 350, 30);
        JRadioButton genreHoror = new JRadioButton("Horor", true);
        genreHoror.setBounds(15, 100, 350, 30);
        JRadioButton genreFantasy = new JRadioButton("Fantasy");
        genreFantasy.setBounds(15, 125, 350, 30);
        JRadioButton genreRomance = new JRadioButton("Romance");
        genreRomance.setBounds(15, 150, 350, 30);
        JRadioButton genreAction = new JRadioButton("Action");
        genreAction.setBounds(15, 175, 350, 30);

        JLabel labelSinopsis = new JLabel("Sinopsis");
        labelSinopsis.setBounds(15, 210, 350, 30);
        JTextArea textAreaSinopsis = new JTextArea();
        textAreaSinopsis.setBounds(15, 235, 350, 100);

        JButton button = new JButton("Simpan");
        button.setBounds(15, 350, 100, 40);

        javax.swing.JTable table = new JTable();
        JScrollPane scrollableTable = new JScrollPane(table);
        scrollableTable.setBounds(15, 400, 500, 200);

        ButtonGroup bg = new ButtonGroup();
        bg.add(genreHoror);
        bg.add(genreFantasy);
        bg.add(genreRomance);
        bg.add(genreAction);

        TableModel tableModel = new TableModel();
        table.setModel(tableModel);

        button.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                String judul = textFieldJudul.getText();
                String sinopsis = textAreaSinopsis.getText();
                String genre = "";

                if (genreHoror.isSelected()) {
                    genre = genreHoror.getText();
                }
                if (genreFantasy.isSelected()) {
                    genre = genreFantasy.getText();
                }
                if (genreRomance.isSelected()) {
                    genre = genreRomance.getText();
                }
                if (genreAction.isSelected()) {
                    genre = genreFantasy.getText();
                }

                if (judul.trim().isEmpty() || sinopsis.trim().isEmpty()) {
                    JOptionPane.showMessageDialog(Frame.this, "Form tidak boleh ada yang kosong!", "Warning",
                            JOptionPane.WARNING_MESSAGE);
                } else {
                    int confirmation = JOptionPane.showConfirmDialog(Frame.this,
                            "Masukan Data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                    if (confirmation == JOptionPane.YES_OPTION) {
                        Model profil = new Model();
                        profil.setJudul(judul);
                        profil.setSinopsis(sinopsis);
                        profil.setGenre(genre);
                        tableModel.add(profil);

                        textFieldJudul.setText("");
                        textAreaSinopsis.setText("");
                    } else {
                        JOptionPane.showMessageDialog(Frame.this, "Anda tidak memasukan data");
                    }
                }
            }

        });

        this.add(button);
        this.add(labelJudul);
        this.add(textFieldJudul);
        this.add(labelGenre);
        this.add(genreHoror);
        this.add(genreFantasy);
        this.add(genreRomance);
        this.add(genreAction);
        this.add(labelSinopsis);
        this.add(textAreaSinopsis);
        this.add(scrollableTable);

        this.setSize(700, 700);
        this.setLayout(null);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                Frame f = new Frame();
                f.setVisible(true);
            }
        });
    }
}
