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
public class EdificioResidencial {

    public Apartamento[] apartamentos;

    public EdificioResidencial(Apartamento[] apartamentos) {
        this.apartamentos = apartamentos;
    }

    public String brindarParqueadero(String numeroApatarmento) {
        return numeroApatarmento + "CS";
    }

    @Override
    public String toString() {
        return "EdificioResidencial{" + "apartamentos=" + Apartamento.imprimirApartamentos(apartamentos) + '}';
    }

    
}
