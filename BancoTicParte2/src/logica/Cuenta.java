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
        this.saldo += valorAConsignar;
    }

    public boolean retirar(double valorARetirar) {
        if (tieneSaldoDisponible(valorARetirar)) {
            this.saldo-=valorARetirar;
            return true;
        }else{
            return false;
        }
    }

    public boolean tieneSaldoDisponible(double valor) {
        return this.saldo >= valor;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", nombrePropietario="
                + nombrePropietario + ", saldo=" + saldo + '}';
    }

}
