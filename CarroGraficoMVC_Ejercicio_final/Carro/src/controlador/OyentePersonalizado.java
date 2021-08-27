/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import acceso.CamionetaDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import javax.swing.JTextField;
import modelo.Camioneta;
import util.ConexionBD;

/**
 *
 * @author Danny
 */
public class OyentePersonalizado implements ActionListener {

    JTextField campo1;
    JTextField campo2;
    JTextField campo3;
    JTextField campo4;

    public OyentePersonalizado(JTextField campo1, JTextField campo2, JTextField campo3,
            JTextField campo4) {
        this.campo1 = campo1;
        this.campo2 = campo2;
        this.campo3 = campo3;
        this.campo4 = campo4;

    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        String placa = campo1.getText();
        int cilindraje = Integer.parseInt(campo2.getText());
        String ciudad = campo3.getText();
        int idConcesionario = Integer.parseInt(campo4.getText());

        Camioneta camioneta = new Camioneta(placa, cilindraje, ciudad, idConcesionario);
        Connection conn = ConexionBD.conectarBD();
        boolean resultadoInsertar = CamionetaDAO.insertarCamionetaObligatoria(conn, camioneta);

    }

}
