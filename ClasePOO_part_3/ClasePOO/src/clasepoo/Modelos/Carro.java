/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepoo.Modelos;

/**
 *
 * @author Danny
 */
public class Carro {

    public String color;
    public String marca;
    public int cilindraje;
    public double velocidadActual;

    public Carro(String colorEspecifico, String marcaEspecifica, int cilindrajeEspecifico) {
        this.color = colorEspecifico;
        this.marca = marcaEspecifica;
        this.cilindraje = cilindrajeEspecifico;
    }

    public void transportarPersonas(String origen, String destino) {
        System.out.println("Transportando personas desde: " + origen + " hasta" + destino);
    }

    public String calcularVolocidad(double distanciaKm, double tiempoHoras) {
        this.velocidadActual = distanciaKm / tiempoHoras;
        String velocidadActualString=velocidadActual+"km/h";
        return velocidadActualString;
    }

    public boolean esIgualLaMarca(Carro otroCarro) {
        if (this.marca.equalsIgnoreCase(otroCarro.marca)) {
            return true;
        } else {
            return false;
        }
    }

    public Carro compararVolocidadCarro(Carro otroCarro) {
        if (this.velocidadActual > otroCarro.velocidadActual) {
            return this;
        } else {
            return otroCarro;
        }
    }

/*    public String imprimirDatosCarro() {

        String datosCompletos = "";

        datosCompletos = "Estos son los datos del carro -> \n"
                + "Color: " + this.color + " \n"
                + "Marca: " + this.marca + " \n"
                + "Velocidad actual: " + this.cilindraje;

        return datosCompletos;

    }*/

    @Override
    public String toString() {
        return "Carro{" + "color=" + color + ", marca=" + marca + ", cilindraje=" + 
                cilindraje + ", velocidadActual=" + velocidadActual + '}';
    }
}
