/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author Danny
 */
public class PatronesDiseno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Caja<String> caja = new Caja<>("Daniel");

        LinkedList<String> lista = new LinkedList<String>();
        // mecanismos para agregar elementos
        lista.add("A");
        lista.add("B");
        lista.addLast("C");
        lista.addFirst("D");
        lista.add(2, "E");
        System.out.println("Lista 1:" + lista);

        String s = caja.decorar();
        System.out.println(s);
        System.out.println("\n\n");

        System.out.println(caja.obtener().charAt(2));

        Caja<Double> cajaD = new Caja<>(14.25);

        String s2 = cajaD.decorar();
        System.out.println(s2);
        System.out.println("\n\n");

    }

}
