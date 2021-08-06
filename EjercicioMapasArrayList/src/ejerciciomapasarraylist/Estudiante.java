/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciomapasarraylist;

/**
 *
 * @author Danny
 */
public class Estudiante {

    public String nombre;
    public String documento;
    public String programa;

    public Estudiante(String nombre, String documento, String programa) {
        this.nombre = nombre;
        this.documento = documento;
        this.programa = programa;
    }

    public void registrarCurso(String codigoCurso) {
        System.out.println("");
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", documento=" + documento 
                + ", programa=" + programa + '}';
    }


    
    

    
    
}
