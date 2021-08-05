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
public class CocinaMexicana implements Cocina {

    public String tipoChile;

    public CocinaMexicana(String tipoChile) {
        this.tipoChile = tipoChile;
    }

    @Override
    public String prepararArroz() {
        return "Preparando arroz picante " + tipoChile;
    }

    @Override
    public String prepararPasta(String tipoPasta) {
        return "Preparando pasta desde Mexico con " + tipoChile;
    }

}
