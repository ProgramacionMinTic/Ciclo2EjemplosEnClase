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
public class CocinaItaliana implements Cocina {

    public String tipoSalsa;

    public CocinaItaliana(String tipoSalsa) {
        this.tipoSalsa = tipoSalsa;
    }

    @Override
    public String prepararArroz() {
        return "En Italia no nos gusta tanto el arroz con sal, preparando arroz sin sal";
    }

    @Override
    public String prepararPasta(String tipoPasta) {
        return "Preparando pasta desde Italia con salsa: " + tipoSalsa;
    }

}
