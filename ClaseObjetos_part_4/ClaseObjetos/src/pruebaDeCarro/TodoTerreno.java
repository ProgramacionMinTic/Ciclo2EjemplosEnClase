/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaDeCarro;

/**
 *
 * @author Danny
 */
public class TodoTerreno extends Carro {

    //Atributos
    public String tipoTraccion;
    public boolean esDobleTraccion;
    public TodoTerreno todoTerre;

    public TodoTerreno(String tipoTraccion, boolean esDobleTraccion, String color,
            String marca, int cilindraje, double velocidadActual, int precio) {
        super(color, marca, cilindraje, velocidadActual, precio);
        this.tipoTraccion = tipoTraccion;
        this.esDobleTraccion = esDobleTraccion;
    }

    //Métodos
    public void subirPendiente(double inclinacion) {
        this.esDobleTraccion = true;
        System.out.println("Está subiendo la pendiente: " + inclinacion);
    }

    public void subirPendiente(double inclinacion, String mensaje) {
        System.out.println("");
    }

    public void subirPendiente(int inclinacion) {
        System.out.println("logica pendiente");
    }

    @Override
    public String toString() {
        return "TodoTerreno{" + "tipoTraccion=" + tipoTraccion + ", "
                + "esDobleTraccion=" + esDobleTraccion + " \n"
                + super.toString() + '}';

    }

    @Override
    public int transportarPersonas(String origen, String destino, String tipoVehiculo) {

        //TODO logica
        return 0;
    }

    @Override
    public int tanquear() {
        return 0;
    }

}
