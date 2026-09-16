package br.com.fiap.concessionaria.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class CarroView extends JFrame {
    private JTextField marcaField = new JTextField(10);
    private JTextField modeloField = new JTextField(10);
    private JTextField anoField = new JTextField(4);
    private JButton salvarButton = new JButton("Salvar carro");
    private JTextArea displayArea = new JTextArea(10,30);

    public CarroView() {
        JPanel carroPanel = new JPanel();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(400, 300);

        carroPanel.add(new JLabel("Marca: "));
        carroPanel.add(marcaField);
        carroPanel.add(new JLabel("Modelo: "));
        carroPanel.add(modeloField);
        carroPanel.add(new JLabel("Ano: "));
        carroPanel.add(anoField);
        carroPanel.add(salvarButton);
        carroPanel.add(new JScrollPane(displayArea));

        this.add(carroPanel);
    }

    public String getMarca() { return marcaField.getText(); }
    public String getModelo() { return modeloField.getText(); }
    public int getAno() { return Integer.parseInt(anoField.getText()); }

    public void addSalvarCarroListener(ActionListener listener) {
        salvarButton.addActionListener(listener);
    }

    public void displayCarros(String carros) {
        displayArea.setText(carros);
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

}
