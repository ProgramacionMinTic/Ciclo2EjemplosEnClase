/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapruebasunitarias;

/**
 *
 * @author Danny
 */
public class Calculadora {

    public double suma(double num1, double num2) {
        return num1 + num2;
    }

    public double resta(double num1, double num2) {
        return num1 - num2;
    }

    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    
   public double dividir(double num1, double num2) {
       if(num2 != 0){
           return num1 / num2;
       }else{
           return Double.NaN;
       }

    }
    

}
