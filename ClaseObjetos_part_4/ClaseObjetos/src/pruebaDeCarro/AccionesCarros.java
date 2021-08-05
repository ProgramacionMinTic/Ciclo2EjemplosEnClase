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

        TodoTerreno miTodoTerrero = new TodoTerreno("4x4", true, "gris",
                "Toyota", 3000, 0.0, 5000);

        Bicicleta miBici = new Bicicleta("9x3", "hidraulicos", 5000);

        miBici.moverse();
        miTodoTerrero.moverse();

        System.out.println(miBici.compararPrecios(miTodoTerrero.precio));

    }

}
