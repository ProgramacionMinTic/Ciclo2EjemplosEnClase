/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasepoo.Modelos;

/**
 *
 * @author Danny
 */
public class TodoTerreno extends Carro {

    public String tipoDeTraccion;
    public boolean isDobleTraccion;

    public TodoTerreno(String colorEspecifico, String marcaEspecifica, int cilindrajeEspecifico,
            String tipoDeTraccion, boolean isDobleTraccion) {
        super(colorEspecifico, marcaEspecifica, cilindrajeEspecifico);
        this.tipoDeTraccion = tipoDeTraccion;
        this.isDobleTraccion = isDobleTraccion;
    }

    public void activarDobleTraccion(boolean activar) {
        this.isDobleTraccion = activar;
        System.out.println("La doble tracción fue activada satisfactoriamente");
    }

    @Override
    public String toString() {
        return super.toString() +" TodoTerreno{" + "tipoDeTraccion=" + 
                tipoDeTraccion + ", isDobleTraccion=" + isDobleTraccion + '}';
    }


}
