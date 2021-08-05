/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaDeCarro;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class AccionesCarros {

    public static void main(String[] args) {
        


        
        System.out.println(Carro.NOMBRE);
    

        TodoTerreno miTodoTerrero = new TodoTerreno("4x4", true, "gris",
                "Toyota", 3000, 0.0);
        
        miTodoTerrero.calcularVelocidad(120, 2);
        
        System.out.println(miTodoTerrero.velocidadActual);

    }

}
