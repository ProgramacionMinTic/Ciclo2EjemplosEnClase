/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package acceso;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import modelo.Camioneta;

/**
 *
 * @author Danny
 */
public class CamionetaDAO {

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
            System.out.println("ERROR SQL CREACION");
            ex.printStackTrace();
        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static ArrayList<Camioneta> obtenerCamioneta(Connection conn) {
        ArrayList<Camioneta> listaCamioneta = new ArrayList<>();
        String sql = "SELECT cam_id, cam_placa, cam_cilindraje, cam_con_id "
                + "FROM camioneta";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            ResultSet resultado = statement.executeQuery();

            while (resultado.next()) {
                int id = resultado.getInt(1);
                String placa = resultado.getString(2);
                int cilindraje = resultado.getInt(3);
                int idConcesionario = resultado.getInt(4);
                Camioneta camioneta = new Camioneta(id, placa, cilindraje, idConcesionario);
                listaCamioneta.add(camioneta);
            }

        } catch (SQLException ex) {
            System.out.println("ERROR SQL CONSULTA");
            ex.printStackTrace();
        }
        return listaCamioneta;
    }

    public static boolean actualizarCamioneta(Connection conn, Camioneta camioneta) {
        
        int filasAfectadas = 0;
        String sql = "UPDATE camioneta SET cam_cilindraje=?, cam_referencia=?, "
                + "cam_pais=? WHERE cam_id=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setInt(1, camioneta.getCilindraje());
            statement.setString(2, camioneta.getReferencia());
            statement.setString(3, camioneta.getPais());
            statement.setInt(4, camioneta.getId());

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR SQL ACTUALIZACION");
            ex.printStackTrace();
        }

        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
       
    }
    
    public static boolean borrarCamioneta(Connection connection, int id){
        int filasAfectadas = 0;
        String sql = "DELETE FROM camioneta WHERE cam_id=?";
        
        try {
            PreparedStatement statement = connection.prepareStatement(sql);
            statement.setInt(1, id);
            filasAfectadas = statement.executeUpdate();
            
       } catch (SQLException ex) {
            System.out.println("ERROR SQL ELIMINACION");
            ex.printStackTrace();
        }

        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
        
    }
    
    //VARIANTE INSERTAR:
    
    public static boolean insertarCamionetaObligatoria(Connection conn, Camioneta camioneta) {
        int filasAfectadas = 0;
        String sql = "INSERT INTO camioneta(cam_placa, cam_cilindraje,"
                + "cam_ciu_pla, cam_con_id) VALUES"
                + "(?, ?, ?, ?)";

        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, camioneta.getPlaca());
            statement.setInt(2, camioneta.getCilindraje());
            statement.setString(3, camioneta.getCiudadPlaca());
            statement.setInt(4, camioneta.getConcesionarioIdentificacion());

            filasAfectadas = statement.executeUpdate();

        } catch (SQLException ex) {
            System.out.println("ERROR SQL CREACION");
            ex.printStackTrace();
        }
        if (filasAfectadas > 0) {
            return true;
        } else {
            return false;
        }
    }
    
}
