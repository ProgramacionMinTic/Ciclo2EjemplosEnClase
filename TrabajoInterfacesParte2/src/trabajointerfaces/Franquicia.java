/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajointerfaces;

import java.util.Scanner;

/**
 *
 * @author Danny
 */
public class Franquicia {

    static CocinaColombiana cocinaColombianaLista[] = new CocinaColombiana[2];

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);

        char opcion;
        String bebida;
        String tipoPlatano;
        
        RestauranteDelicias ccDelicias = new RestauranteDelicias("Lulo", "Maduro");
        
        do {
            System.out.println("Por favor ingrese una opcion: \n"
                    + "a para realizar pedido, b para mostrar el pedido y s para salir del programa");

            opcion = lector.nextLine().charAt(0);

            switch (opcion) {
                case 'a':
                    
                    System.out.print("Por favor digite su bebida ->");
                    bebida = lector.nextLine();
                    System.out.println("");
                    System.out.print("Por favor digite su tipo de platano favorito ->");
                    tipoPlatano = lector.nextLine();
                    System.out.println("");
                    
                    ccDelicias.bebida=bebida;
                    ccDelicias.tipoPlatano=tipoPlatano;
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
                    
                case 'b':
                    System.out.println(ccDelicias.toString());
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
                    
                case 's':
                    System.out.println("Hasta luego querido cliente");
                    System.out.println("\n\n\n\n\n\n\n\n\n");
                    break;
                
                default:
                    System.out.println("Opcion no válida");
                    System.out.println("\n\n\n\n\n\n\n\n\n");
            }
            
            System.out.println("****-------------------------------------****");

        } while (opcion != 's');

   
    }

}
