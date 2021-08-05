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
public class AccionesCarros {

    public static void main(String[] args) {

        Carro miCarro = new Carro("Negro", "Toyota", 2600, 0.0);

        miCarro.color = "rojo";

        Carro carroVecino = new Carro("Gris", "Mazda", 1600, 0.0);

//        miCarro.transportarPersonas("Bogotá", "Cartagena");
//        System.out.println(miCarro.calcularVelocidad(150, 1.8));
        System.out.println(miCarro.imprimirInfoCarro());
        System.out.println("");
        System.out.println(carroVecino.imprimirInfoCarro());

    }

}
