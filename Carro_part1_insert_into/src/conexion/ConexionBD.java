package conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public abstract class ConexionBD {

    public static Connection conectarBD() {
        String dbURL = "jdbc:mysql://localhost:3306/carro";
        String username = "root";
        String password = "admin";

        //Intentar conectar
        try {
            Connection conn = DriverManager.getConnection(dbURL, username, password);

            if (conn != null) {
                System.out.println("Conectado");
            }

            return conn;

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return null;
    }

}
