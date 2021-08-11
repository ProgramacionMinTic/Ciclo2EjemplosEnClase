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
public class CuentaAhorros extends Cuenta implements Rentable{
    
    public boolean exenta4x1000;

    public CuentaAhorros(int numeroCuenta, String nombrePropietario, boolean exenta4x1000) {
        super(numeroCuenta, nombrePropietario);
        this.exenta4x1000 = exenta4x1000;
    }
    
    @Override
    public double calcularRendimiento(){
     return this.saldo * Rentable.TASA_ANUAL_REDIMIENTO;
    }

    @Override
    public String toString() {
        return "CuentaAhorros{" + "exenta4x1000=" + exenta4x1000 +
                ", "+super.toString()+ '}';
    }
    
    
    
    
}
