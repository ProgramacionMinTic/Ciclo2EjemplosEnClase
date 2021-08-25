/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repositorio;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import modelo.Camioneta;

/**
 *
 * @author Danny
 */
public class RepositorioCamioneta {

    public static boolean insertarCamioneta(Connection conn, Camioneta camioneta) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO camioneta(cam_id, cam_placa, cam_cilindraje,"
                + "cam_referencia, cam_pais, cam_ciu_pla, cam_con_id) VALUES"
                + "(?, ?, ?, ?, ?, ?, ?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, camioneta.getId());
            statement.setString(2, camioneta.getPlaca());
            statement.setInt(3, camioneta.getCilindraje());
            statement.setString(4, camioneta.getReferencia());
            statement.setString(5, camioneta.getPais());
            statement.setString(6, camioneta.getCiudadPlaca());
            statement.setInt(7, camioneta.getConcesionarioIdentificacion());

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR SQL");
            ex.printStackTrace();
        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }

}
