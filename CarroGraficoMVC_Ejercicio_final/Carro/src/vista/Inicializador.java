package vista;

import util.ConexionBD;
import java.sql.Connection;
import modelo.Camioneta;
import modelo.Concesionario;
import acceso.CamionetaDAO;
import java.util.ArrayList;

public class Inicializador {

    public static void main(String[] args) {

        Concesionario concesionario = new Concesionario(1001, "Manizales");
        Camioneta camioneta = new Camioneta(203, "XAX-112", 7150, "4X8",
                "Venezuela", "Cali", concesionario.getIdentificacion());

        Connection conn = ConexionBD.conectarBD();

        //CRUD
        //C
        //boolean resultado = CamionetaDAO.insertarCamioneta(conn, camioneta);
        //R
        //ArrayList<Camioneta> listaCamioneta = CamionetaDAO.obtenerCamioneta(conn);
        //U
        //boolean resultadoActualizacion = CamionetaDAO.actualizarCamioneta(conn,camioneta);
        //D
        //boolean resultadoEliminacion = CamionetaDAO.borrarCamioneta(conn, camioneta.getId());

        VentanaCarro ventanaCarro = new VentanaCarro();

    }

}
