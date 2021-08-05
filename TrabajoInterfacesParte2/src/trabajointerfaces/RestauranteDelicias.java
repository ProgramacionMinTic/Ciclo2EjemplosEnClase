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
public class RestauranteDelicias extends CocinaColombiana {
    public String bebida;

    public RestauranteDelicias(String bebida, String tipoPlatano) {
        super(tipoPlatano);
        this.bebida = bebida;
    }


    @Override
    public String toString() {
        return "Restaurante Delicias{" + "bebida=" + bebida + 
                "\n"+"\t"+super.toString()+
                '}';
    }
    
    
    
    
    
    
}
