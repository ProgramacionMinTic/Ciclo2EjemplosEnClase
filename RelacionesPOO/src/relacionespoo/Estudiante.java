/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relacionespoo;

/**
 *
 * @author Danny
 */
public class Estudiante {

    public String documento;
    public String nombre;
    public String curso;

    public Estudiante(String documento, String nombre, String curso) {
        this.documento = documento;
        this.nombre = nombre;
        this.curso = curso;
    }

    @Override
    public String toString() {
        return "documento=" + documento + ", \n \tnombre=" + nombre
                + ", \n \tcurso=" + curso + '}';
    }

}
