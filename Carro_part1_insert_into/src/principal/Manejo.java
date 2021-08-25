package principal;

import conexion.ConexionBD;
import java.sql.Connection;
import modelo.Camioneta;
import modelo.Concesionario;
import repositorio.RepositorioCamioneta;

public class Manejo {

    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario(1111, "Manizales");
        Camioneta camioneta = new Camioneta(200, "ABC-111", 2500, "4X4 Turbo",
                "Colombia", "Manizales", concesionario.getIdentificacion());

        Connection conn = ConexionBD.conectarBD();
        
        boolean resultado = RepositorioCamioneta.insertarCamioneta(conn, camioneta);

    }

}
