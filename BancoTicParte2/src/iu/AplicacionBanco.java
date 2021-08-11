/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package iu;

import java.util.Scanner;
import logica.Banco;
import logica.Cuenta;
import logica.CuentaAhorros;
import logica.CuentaCorriente;

/**
 *
 * @author Danny
 */
public class AplicacionBanco {

    private static void mostrarMenu(Scanner lector, Banco banco1,
            int numeroCuenta, int opcion) {
        do {

            System.out.println("1. Agregar cuenta, 2. Buscar cuenta, "
                    + "3. Ver todas las cuentas, 5. Salir");
            System.out.print("Digite una opción: ");
            opcion = Integer.parseInt(lector.nextLine());

            switch (opcion) {
                case 1:
                    System.out.println("Nombre? ");
                    String nombre = lector.nextLine();

                    System.out.println("Número de cuenta? ");
                    numeroCuenta = Integer.parseInt(lector.nextLine());

                    System.out.println("Es ahorros? ");
                    boolean ahorros = Boolean.parseBoolean(lector.nextLine());

                    Cuenta cuentaNueva;
                    if (ahorros) {
                        cuentaNueva = new CuentaAhorros(numeroCuenta, nombre, false);
                    } else {
                        System.out.println("Número de chequera? ");
                        int numeroChequera = Integer.parseInt(lector.nextLine());
                        cuentaNueva = new CuentaCorriente(numeroChequera, numeroCuenta, nombre);
                    }

                    banco1.agregarCuenta(cuentaNueva);
                    break;

                case 2:
                    System.out.println("Numero cuenta? ");
                    numeroCuenta = Integer.parseInt(lector.nextLine());
                    Cuenta cuentaEncontrada = banco1.buscarCuenta(numeroCuenta);
                    if (cuentaEncontrada != null) {
                        System.out.println(cuentaEncontrada);
                    } else {
                        System.out.println("Cuenta no existe: " + numeroCuenta);
                    }
                    break;
                case 3:
                    System.out.println(banco1.obtenerCuentas());
                    break;
                case 5:
                    System.out.println("Hasta luego...");
                    break;
                default:
                    System.out.println("Opción no válida");
            }

        } while (opcion != 5);
    }

    public static void main(String[] args) {

        Scanner lector = new Scanner(System.in);
        Banco banco1 = new Banco("BancoDS", "Cali");
        int numeroCuenta=0;
        int opcion=0;

        mostrarMenu(lector, banco1, numeroCuenta, opcion);

    }

}
