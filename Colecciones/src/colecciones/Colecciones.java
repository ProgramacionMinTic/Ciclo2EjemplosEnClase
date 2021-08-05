/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Danny
 */
public class Colecciones {

    private static void manejarListas() {
        ArrayList<String> miArrayList = new ArrayList<>();
        miArrayList.add("Daniel");
        miArrayList.add("Daniel");

        for (int i = 0; i < 10; i++) {
            miArrayList.add(0, Integer.toString(i));
        }

        miArrayList.add("ultimo");

        int indice3 = miArrayList.indexOf("3");
        miArrayList.remove(indice3);

        for (String elemento : miArrayList) {
            if (elemento.equalsIgnoreCase("DANIEL")) {
                System.out.println("Iguales");
            }
        }

    }

    private static void manejarMapas() {

        HashMap<Integer, String> estudiantesMapa = new HashMap<>();

        estudiantesMapa.put(123, "Daniel Salazar");
        estudiantesMapa.put(124, "Andres C");
        estudiantesMapa.put(125, "Mateo A");

        System.out.println(estudiantesMapa.size());
        System.out.println(estudiantesMapa);

        System.out.println(estudiantesMapa.containsKey(1230));

        System.out.println(estudiantesMapa.get(1256));

        for (Map.Entry<Integer, String> elemento : estudiantesMapa.entrySet()) {
            System.out.print(elemento.getKey() + " " + elemento.getValue() + "\t");
        }

    }

    public static void main(String[] args) {
        manejarListas();
        manejarMapas();

    }

}
