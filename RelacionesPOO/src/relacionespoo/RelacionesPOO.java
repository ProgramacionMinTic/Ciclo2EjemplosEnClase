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
public class RelacionesPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SalonClase salonClase = new SalonClase();

        Apartamento a1 = new Apartamento("123A", "Blanco", 2);
        Apartamento a2 = new Apartamento("111A", "Negro", 4);
        Apartamento a3 = new Apartamento("123B", "Azul", 1);

        //Apartamento[] apartamentoLista = {a1, a2, a3};
        Apartamento[] apartamentoLista = new Apartamento[3];
        apartamentoLista[0] = a1;
        apartamentoLista[1] = a2;
        apartamentoLista[2] = a3;

        EdificioResidencial edificioResidencial = new EdificioResidencial(apartamentoLista);

        System.out.println(edificioResidencial);

    }

}
