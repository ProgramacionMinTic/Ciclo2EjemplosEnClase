/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepoo;

import clasepoo.Modelos.Carro;
import clasepoo.Modelos.TodoTerreno;

/**
 *
 * @author Danny
 */
public class ProbarCarros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        TodoTerreno carroTodoTerreno = new TodoTerreno("gris", "Toyota", 0, "4x4", false);

        carroTodoTerreno.activarDobleTraccion(true);
        
        System.out.println(carroTodoTerreno.toString());

    }

}
