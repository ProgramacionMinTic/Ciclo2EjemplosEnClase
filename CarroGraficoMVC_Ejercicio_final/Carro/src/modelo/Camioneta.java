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
public class Camioneta {

    private int id;
    private String placa;
    private int cilindraje;
    private String referencia;
    private String pais;
    private String ciudadPlaca;
    private int concesionarioIdentificacion;

    public Camioneta(int id, String placa, int cilindraje, String referencia,
            String pais, String ciudadPlaca, int concesionarioIdentificacion) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.referencia = referencia;
        this.pais = pais;
        this.ciudadPlaca = ciudadPlaca;
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

    public Camioneta(int id, String placa, int cilindraje, int concesionarioIdentificacion) {
        this.id = id;
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

    public Camioneta(String placa, int cilindraje, String ciudad, int concesionarioIdentificacion) {
        this.placa = placa;
        this.cilindraje = cilindraje;
        this.ciudadPlaca = ciudad;
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

    @Override
    public String toString() {
        return "Camioneta {" + "id=" + id + ", placa=" + placa + ",\n cilindraje="
                + cilindraje + ", referencia=" + referencia + ",\n pais=" + pais
                + ", ciudadPlaca=" + ciudadPlaca + ",\n concesionarioIdentifiacion="
                + concesionarioIdentificacion + '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudadPlaca() {
        return ciudadPlaca;
    }

    public void setCiudadPlaca(String ciudadPlaca) {
        this.ciudadPlaca = ciudadPlaca;
    }

    public int getConcesionarioIdentificacion() {
        return concesionarioIdentificacion;
    }

    public void setConcesionarioIdentificacion(int concesionarioIdentificacion) {
        this.concesionarioIdentificacion = concesionarioIdentificacion;
    }

}
