/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.OyentePersonalizado;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author Danny
 */
public class PanelCarro extends JPanel {
    
    public PanelCarro() {
        inicializarComponentes();
        
    }
    
    private void inicializarComponentes() {
        
        JLabel tituloEtiqueta = new JLabel("Aplicación Carro");
        tituloEtiqueta.setFont(new Font("Arial", Font.BOLD, 50));
        tituloEtiqueta.setForeground(Color.blue);
        tituloEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JLabel placaEtiqueta = new JLabel("Placa: ");
        placaEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        placaEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campo1 = new JTextField(10);
        campo1.setFont(new Font("Arial", Font.ITALIC, 30));
        campo1.setHorizontalAlignment(JTextField.CENTER);
        
        JLabel cilindrajeEtiqueta = new JLabel("Cilindraje: ");
        cilindrajeEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        cilindrajeEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campo2 = new JTextField(10);
        campo2.setFont(new Font("Arial", Font.ITALIC, 30));
        campo2.setHorizontalAlignment(JTextField.CENTER);
        
        JLabel ciudadEtiqueta = new JLabel("Ciudad: ");
        ciudadEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        ciudadEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campo3 = new JTextField(10);
        campo3.setFont(new Font("Arial", Font.ITALIC, 30));
        campo3.setHorizontalAlignment(JTextField.CENTER);
        
        JLabel concesionarioEtiqueta = new JLabel("Conce: ");
        concesionarioEtiqueta.setFont(new Font("Arial", Font.BOLD, 40));
        concesionarioEtiqueta.setHorizontalAlignment(JLabel.CENTER);
        
        JTextField campo4 = new JTextField(10);
        campo4.setFont(new Font("Arial", Font.ITALIC, 30));
        campo4.setHorizontalAlignment(JTextField.CENTER);
        
        JButton botonEviar = new JButton("Enviar!!!");
        botonEviar.setFont(new Font("Arial", Font.BOLD, 60));
        
        ActionListener oyentePersonalizado = new OyentePersonalizado(campo1,
                campo2, campo3, campo4);
        botonEviar.addActionListener(oyentePersonalizado);
        
        add(tituloEtiqueta);
        add(placaEtiqueta);
        add(campo1);
        add(cilindrajeEtiqueta);
        add(campo2);
        add(ciudadEtiqueta);
        add(campo3);
        add(concesionarioEtiqueta);
        add(campo4);
        add(botonEviar);
        
    }
    
}
