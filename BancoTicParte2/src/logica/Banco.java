/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Danny
 */
public class Banco {

    private String nombre;
    private String ciudad;
    private ArrayList<Cuenta> listaCuentas;

    public Banco(String nombre, String ciudad) {
        this.nombre = nombre;
        this.listaCuentas = new ArrayList<>();
        this.listaCuentas.add(new CuentaCorriente(123, 1007, "Administrador"));
        this.ciudad = this.esCiudadpermitida(ciudad) ? ciudad : "Medellín";
    }

    public void agregarCuenta(Cuenta cuenta) {
        this.listaCuentas.add(cuenta);
    }

    public Cuenta buscarCuenta(int numeroCuenta) {
        for (int i = 0; i < this.listaCuentas.size(); i++) {
            if (this.listaCuentas.get(i).numeroCuenta == numeroCuenta) {
                return listaCuentas.get(i);
            }
        }
        return null;
    }

    public String obtenerCuentas() {
        String cuentasString = "";
        for (int i = 0; i < this.listaCuentas.size(); i++) {
            cuentasString += this.listaCuentas.get(i).toString();
        }
        return cuentasString;
    }

    public static ArrayList<String> obtenerCiudades() {
        return new ArrayList<String>(Arrays.asList("Bogotá", "Medellín", "Cali",
                "Barranquilla"));
    }

    private boolean esCiudadpermitida(String ciudad) {
        return obtenerCiudades().contains(ciudad);
    }

    @Override
    public String toString() {
        return "Banco{" + "nombre=" + nombre + ", ciudad="
                + ciudad + ", listaCuentas=" + listaCuentas + '}';
    }

}
