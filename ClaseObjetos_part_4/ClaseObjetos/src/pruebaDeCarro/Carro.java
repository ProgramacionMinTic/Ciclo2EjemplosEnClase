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
public abstract class Carro implements Vehiculo {

    //Atributos
    public String color;
    public String marca;
    public int cilindraje;
    public double velocidadActual;
    public static String NOMBRE = "DANIEL";
    public int precio;

    //Constructor
    public Carro(String color, String marca, int cilindraje, double velocidadActual, int precio) {
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.velocidadActual = velocidadActual;
        this.precio = precio;
    }

    //Métodos
    public abstract int transportarPersonas(String origen, String destino, String tipoVehiculo);

    public abstract int tanquear();

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

    @Override
    public void moverse() {
        System.out.println("moviendose en 4 ruedas a una velocidad de 80km/h");
    }

    @Override
    public String frenar(boolean estaFrenado) {
        if (estaFrenado) {
            return "Frenado";
        } else {
            return "Voy muy rápido";
        }
    }

}
