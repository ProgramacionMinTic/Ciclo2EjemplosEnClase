/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author Danny
 */
public class Ventana extends JFrame {

    public Ventana() {
        inicializarComponentes();
    }

    private void inicializarComponentes() {

        setTitle("Calculadora");
        setLocation(500, 300);
        setSize(600, 1000);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelCalculadora panelCalculadora = new PanelCalculadora();
   
        add(panelCalculadora);
        
    }

}
