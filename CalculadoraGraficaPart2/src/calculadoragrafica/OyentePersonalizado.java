/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadoragrafica;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Danny
 */
public class OyentePersonalizado implements ActionListener {
    
    JTextField campoNumero1;
    JTextField campoNumero2;
    ButtonGroup grupoBotonesOperacion;
    JLabel etiquetaResultado;
    
    public OyentePersonalizado(JTextField campoNumero1, JTextField campoNumero2,
            ButtonGroup grupoBotonesOperacion, JLabel etiquetaResultado) {
        
        this.campoNumero1 = campoNumero1;
        this.campoNumero2 = campoNumero2;
        this.grupoBotonesOperacion = grupoBotonesOperacion;
        this.etiquetaResultado = etiquetaResultado;
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        
        double n1 = Double.parseDouble(campoNumero1.getText());
        double n2 = Double.parseDouble(campoNumero2.getText());
        double resultado = 0.0;
        
        ArrayList<AbstractButton> botones = Collections.list(grupoBotonesOperacion.getElements());
        for (AbstractButton boton : botones) {
            if (boton.isSelected()) {
                switch (boton.getText()) {
                    case "suma":
                        resultado = n1 + n2;
                        break;
                    case "resta":
                        resultado = n1 - n2;
                        break;
                    case "mult":
                        resultado = n1 * n2;
                        break;
                    case "div":
                        resultado = n1 / n2;
                        break;
                }
            }
        }
        
        etiquetaResultado.setText("" + resultado);
        
    }
    
}
