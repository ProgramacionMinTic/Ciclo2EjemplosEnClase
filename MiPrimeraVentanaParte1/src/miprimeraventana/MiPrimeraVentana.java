/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miprimeraventana;

/**
 *
 * @author Danny
 */
public class MiPrimeraVentana {


    public static void main(String[] args) {
       Ventana ventana= new Ventana();
       
       ventana.setTitle("Mi primera ventanita");
       ventana.setSize(400, 600);
       ventana.setLocation(500,500);
       ventana.setDefaultCloseOperation(2);
      
       ventana.setVisible(true);
        
        
    }
    
}
