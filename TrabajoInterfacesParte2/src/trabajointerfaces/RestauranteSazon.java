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
public class RestauranteSazon extends CocinaColombiana {

    public String postre;

    public RestauranteSazon(String postre, String tipoPlatano) {
        super(tipoPlatano);
        this.postre = postre;

    }

    @Override
    public String toString() {
        return "RestauranteSazon{" + "postre=" + postre + 
                super.toString()+'}';
    }
    
    

}
