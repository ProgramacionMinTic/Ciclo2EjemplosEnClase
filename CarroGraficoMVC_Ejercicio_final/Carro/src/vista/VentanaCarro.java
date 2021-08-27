/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import javax.swing.JFrame;

/**
 *
 * @author Danny
 */
public class VentanaCarro extends JFrame {
    
    public VentanaCarro() {
        inicializarComponentes();
    }
    
    private void inicializarComponentes() {
        
        setTitle("Carro");
        setLocation(500, 300);
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        PanelCarro panelCarro = new PanelCarro();
        add(panelCarro);
        setVisible(true);
        
    }
    
}
