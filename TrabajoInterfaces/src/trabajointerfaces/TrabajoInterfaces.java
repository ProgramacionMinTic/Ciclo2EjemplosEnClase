/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajointerfaces;

/**
 *
 * @author Danny
 */
public class TrabajoInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CocinaColombiana cocinaColombiana = new CocinaColombiana("Verde");
        CocinaItaliana cocinaItaliana = new CocinaItaliana("Salsa de tomate italiana");
        CocinaMexicana cocinaMexicana = new CocinaMexicana("Rojo al carbón");

        cocinaColombiana.tipoPlatano = "maduro";

        System.out.println(cocinaColombiana.prepararArroz());
        System.out.println(cocinaColombiana.prepararPasta("Pasta doria"));
        System.out.println();
        System.out.println(cocinaMexicana.prepararArroz());
        System.out.println(cocinaMexicana.prepararPasta("Pasta muñeco"));
        System.out.println();

        System.out.println(cocinaItaliana.prepararArroz());
        System.out.println(cocinaItaliana.prepararPasta("Pasta original"));

    }

}
