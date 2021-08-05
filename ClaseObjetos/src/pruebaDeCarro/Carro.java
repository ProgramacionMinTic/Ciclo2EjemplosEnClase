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
public class Carro {

    //Atributos
    public String color;
    public String marca;
    public int cilindraje;
    public double velocidadActual;

    //Constructor
    public Carro(String color, String marca, int cilindraje, double velocidadActual) {
        this.color = color;
        this.marca = marca;
        this.cilindraje = cilindraje;
        this.velocidadActual = velocidadActual;
    }

    //Métodos
    public void transportarPersonas(String origen, String destino) {
        System.out.println("Transportando personas desde: " + origen + " hasta " + destino);
    }

    public String calcularVelocidad(double distanciakm, double tiempoHoras) {

        velocidadActual = distanciakm / tiempoHoras;
        String resultado = velocidadActual + "km/h";
        return resultado;
    }

    public String imprimirInfoCarro() {
        String datos = "";
        datos = "Estos son los datos del carro -> \n"
                + "Color: " + this.color + " \n"
                + "Marca: " + this.marca + " \n"
                + "Cilindraje: " + this.cilindraje + " \n"
                + "VelocidadActual: " + this.velocidadActual + " \n";

        return datos;
    }

}
