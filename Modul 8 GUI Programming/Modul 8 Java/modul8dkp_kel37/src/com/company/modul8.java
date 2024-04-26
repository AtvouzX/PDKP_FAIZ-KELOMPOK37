package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class modul8 {
    private JLabel labelNIM;
    private JLabel labelNama;
    private JLabel labelKel;
    private JTextField textKel;
    private JTextField textNama;
    private JTextField textNIM;
    private JTextArea textHasil;
    private JCheckBox boxSyarat;
    private JButton SubmitButton;
    private JButton ClearButton;
    private JPanel mainPanel;

    public static void main(String[] args) {
        JFrame frame = new JFrame("DKP GUI");
        frame.setContentPane(new modul8().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setSize(600, 600);
        frame.setResizable(true);
    }

    public modul8() {
    SubmitButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            textHasil.setText("Halo, saya dari kelompok " +
                    textKel.getText() + " bernama " +
                    textNama.getText() + " dengan NIM " +
                    textNIM.getText() + "\nBelajar GUI bersama kak  dan kak George itu menyenangkan bukan? bukan");

        }
    });
    ClearButton.addActionListener(new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {

            textKel.setText("");
            textNama.setText("");
            textNIM.setText("");
            textHasil.setText("");

        }
    });
}
}
