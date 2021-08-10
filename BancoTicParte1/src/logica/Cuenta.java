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
public abstract class Cuenta {

    protected int numeroCuenta;
    protected String nombrePropietario;
    protected double saldo;

    public Cuenta(int numeroCuenta, String nombrePropietario) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = nombrePropietario;
        this.saldo = 0.0;
    }

    public Cuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
        this.nombrePropietario = "Anonimo";
        this.saldo = 0.0;
    }

    public void consignar(double valorAConsignar) {
        //TODO
    }
    
    public boolean retirar(double valorARetirar){
        return true;
        //TODO
    }
    
    public boolean tieneSaldoDisponible(double valor){
        
        return true;
        //TODO
        
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nombrePropietario=" 
                + nombrePropietario + ", saldo=" + saldo + '}';
    }
    
    
}
