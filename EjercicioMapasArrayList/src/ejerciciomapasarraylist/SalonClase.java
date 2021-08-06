/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomapasarraylist;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author Danny
 */
public class SalonClase {

    static ArrayList<Estudiante> estudianteLista;

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Daniel", "123", "Sistemas");
        Estudiante estudiante2 = new Estudiante("Andres", "1234", "Industrial");

        Estudiante estudiante3 = new Estudiante("Jose", "100", "Sistemas");
        Estudiante estudiante4 = new Estudiante("Camila", "1425", "Quimica");
        Estudiante estudiante5 = new Estudiante("Maria", "1420", "Sistemas");

        estudianteLista = new ArrayList<>();
        ArrayList<Estudiante> estudianteLista2 = new ArrayList<>();

        HashMap<Integer, ArrayList<Estudiante>> salonClasesMapa = new HashMap<>();
        estudianteLista.add(estudiante1);
        estudianteLista.add(estudiante2);

        salonClasesMapa.put(101, estudianteLista);
        
        System.out.println("101 original: "+salonClasesMapa);
        
        estudianteLista.clear();
        System.out.println("101 limpio: "+salonClasesMapa);

        estudianteLista2.add(estudiante3);
        estudianteLista2.add(estudiante4);
        estudianteLista2.add(estudiante5);

        salonClasesMapa.put(102, estudianteLista2);

        System.out.println("Todo el mapa:"+salonClasesMapa);

    }

    public static void consultarEstudiante(Estudiante estudiante) {

    }

    public static void agregarEstudiante(Estudiante estudiante) {

    }
}
