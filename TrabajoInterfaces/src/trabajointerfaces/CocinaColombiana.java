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
public class CocinaColombiana implements Cocina {

    public String tipoPlatano;

    public CocinaColombiana(String tipoPlatano) {
        this.tipoPlatano = tipoPlatano;
    }

    @Override
    public String prepararArroz() {
        return "Preparando arroz desde Colombia \n"
                + "\t2 arros x 1 agua";
    }

    @Override
    public String prepararPasta(String tipoPasta) {
        return "preparando pasta desde Colombia con platano frito " + tipoPlatano + " "+ tipoPasta;
    }

}
