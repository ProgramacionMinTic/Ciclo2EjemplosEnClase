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
public abstract class Carro {

    //Atributos
    public String color;
    public String marca;
    public int cilindraje;
    public double velocidadActual;
    public static String NOMBRE="DANIEL";

    //Constructor
    public Carro(String color, String marca, int cilindraje, double velocidadActual) {
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.velocidadActual = velocidadActual;
    }

    //Métodos
    public abstract int transportarPersonas(String origen, String destino, String tipoVehiculo);

    public String calcularVelocidad(double distanciakm, double tiempoHoras) {

        velocidadActual = distanciakm / tiempoHoras;
        String resultado = velocidadActual + "km/h";
        return resultado;
    }

    public void compararCilindraje(Carro otroCarro) {
        if (this.cilindraje > otroCarro.cilindraje) {
            System.out.println("Mi carro tiene mayor cilindraje");
        } else if (this.cilindraje == otroCarro.cilindraje) {
            System.out.println("Los cilindrajes son iguales");
        } else {
            System.out.println("El otro carro tiene mayor cilindraje");

        }
    }

    @Override
    public String toString() {
        return "Carro{" + "color=" + color + ", marca=" + marca + ", "
                + "cilindraje=" + cilindraje + ", velocidadActual=" + velocidadActual + '}';
    }

}
