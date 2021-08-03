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
public class Apartamento {

    public String numeroApatamento;
    public String color;
    public int cantidadHabitaciones;

    public Apartamento(String numeroApatamento, String color, int cantidadHabitaciones) {
        this.numeroApatamento = numeroApatamento;
        this.color = color;
        this.cantidadHabitaciones = cantidadHabitaciones;
    }

    @Override
    public String toString() {
        return "Apartamento{" + "numeroApatamento=" + numeroApatamento
                + ", color=" + color + ", cantidadHabitaciones=" + cantidadHabitaciones + '}';
    }

    public static String imprimirApartamentos(Apartamento[] aptoLista) {
        String listaString = "";
        for (int i = 0; i < aptoLista.length; i++) {
            listaString = listaString + aptoLista[0].toString();
        }
        return listaString;
    }

}
