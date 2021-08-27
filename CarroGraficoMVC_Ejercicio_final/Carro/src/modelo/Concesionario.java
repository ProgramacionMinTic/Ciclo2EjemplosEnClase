/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Danny
 */
public class Concesionario {

    private int identificacion;
    private String ubicacion;

    public Concesionario(int identificacion, String ubicacion) {
        this.identificacion = identificacion;
        this.ubicacion = ubicacion;
    }

    @Override
    public String toString() {
        return "Concesionario {" + "identificacion=" + identificacion
                + ", ubicacion=" + ubicacion + '}';
    }

    public int getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }


    

}
