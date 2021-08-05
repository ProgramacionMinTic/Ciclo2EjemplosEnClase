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
public class Bicicleta implements Vehiculo {

    public String cambios;
    public String frenos;
    public int precio;

    public Bicicleta(String cambios, String frenos, int precio) {
        this.cambios = cambios;
        this.frenos = frenos;
        this.precio = precio;
    }

    public double hacerDeporte(String tipoBicicleta) {

        if (tipoBicicleta.equalsIgnoreCase("MTB")) {
            return 25.5;
        } else if (tipoBicicleta.equalsIgnoreCase("RUTA")) {
            return 18.3;
        } else if (tipoBicicleta.equalsIgnoreCase("Tradicional")) {
            return 35.6;
        } else {
            return 0.0;
        }

    }

    @Override
    public void moverse() {
        System.out.println("Se está moviendo en MTB por la montaña en 2 ruedas");
    }

    @Override
    public String frenar(boolean estaFrenado) {
        if (estaFrenado) {
            return "Frenar con ambas ruedas por favor";
        } else {
            return "me quedé sin frenos";
        }
    }

    public String compararPrecios(int precioCarro) {

        if (precioCarro > this.precio) {
            return "El carro es más costoso";

        } else if (precioCarro == this.precio) {
            return "cuestan lo mismo";
        } else {
            return "La bicicleta es más costosa, !UFF qué bicicleta!";
        }
    }
}
