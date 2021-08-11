/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

/**
 *
 * @author Danny
 */
public class CuentaCorriente extends Cuenta{
     public int numeroChequera;
     public int cupoMaximo;

    public CuentaCorriente(int numeroChequera, int numeroCuenta, String nombrePropietario) {
        super(numeroCuenta, nombrePropietario);
        this.numeroChequera = numeroChequera;
        this.cupoMaximo = 100000;
    }

    @Override
    public boolean tieneSaldoDisponible(double valor) {
        return Math.abs(saldo-valor) <= this.cupoMaximo;
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "numeroChequera=" + numeroChequera 
                + ", cupoMaximo=" + cupoMaximo + 
                ", "+super.toString()+'}';
    }
    
    
    


    
    
}
