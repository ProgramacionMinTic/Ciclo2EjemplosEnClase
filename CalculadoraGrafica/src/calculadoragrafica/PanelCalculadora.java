/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author Danny
 */
public class PanelCalculadora extends JPanel {

    public PanelCalculadora() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        setLayout(new GridLayout(10, 1, 0, 12));

        JLabel tituloEtiqueta = new JLabel("Aplicación Calculadora");
        tituloEtiqueta.setFont(new Font("Arial", Font.BOLD, 50));
        tituloEtiqueta.setForeground(Color.BLUE);
        tituloEtiqueta.setHorizontalAlignment(JLabel.CENTER);

        JTextField campoNumero1 = new JTextField(10);
        campoNumero1.setFont(new Font("Arial", Font.BOLD, 30));
        campoNumero1.setHorizontalAlignment(JTextField.CENTER);

        JTextField campoNumero2 = new JTextField(10);
        campoNumero2.setFont(new Font("Arial", Font.BOLD, 30));
        campoNumero2.setHorizontalAlignment(JTextField.CENTER);

        ButtonGroup grupoBotonesOperacion = new ButtonGroup();
        JRadioButton rbSuma = new JRadioButton("suma");
        rbSuma.setFont(new Font("Arial", Font.ITALIC, 30));
        rbSuma.setHorizontalAlignment(rbSuma.CENTER);

        JRadioButton rbResta = new JRadioButton("resta");
        rbResta.setFont(new Font("Arial", Font.ITALIC, 30));
        rbResta.setHorizontalAlignment(rbSuma.CENTER);

        JRadioButton rbMult = new JRadioButton("mult");
        rbMult.setFont(new Font("Arial", Font.ITALIC, 30));
        rbMult.setHorizontalAlignment(rbSuma.CENTER);

        JRadioButton rbDiv = new JRadioButton("div");
        rbDiv.setFont(new Font("Arial", Font.ITALIC, 30));
        rbDiv.setHorizontalAlignment(rbSuma.CENTER);

        grupoBotonesOperacion.add(rbSuma);
        grupoBotonesOperacion.add(rbResta);
        grupoBotonesOperacion.add(rbMult);
        grupoBotonesOperacion.add(rbDiv);

        JButton botonCalcular = new JButton("Calcular");
        botonCalcular.setFont(new Font("Arial", Font.BOLD, 30));

        JLabel etiquetaResultado = new JLabel();
        etiquetaResultado.setFont(new Font("Arial", Font.BOLD, 40));
        etiquetaResultado.setForeground(Color.RED);
        etiquetaResultado.setHorizontalAlignment(JLabel.CENTER);

        ActionListener oyentePersonalizado = new OyentePersonalizado();
        botonCalcular.addActionListener(oyentePersonalizado);

        add(tituloEtiqueta);
        add(campoNumero1);
        add(campoNumero2);
        add(rbSuma);
        add(rbResta);
        add(rbMult);
        add(rbDiv);
        add(botonCalcular);
    }

}
