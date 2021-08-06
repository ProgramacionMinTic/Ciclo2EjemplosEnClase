/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadorapruebasunitarias;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Danny
 */
public class CalculadoraTest {
   
    Calculadora calculadora;
    
    @Before
    public void setUp() {
        calculadora= new Calculadora();
        
    }
    
   @Test
   public void deberiaSumarDosNumeros(){
       System.out.println("Probar Suma");
       
       double num1 = 5.0;
       double num2 = 6.0;
       
       double actual = calculadora.suma(num1, num2);
       double esperado = 11.0;
       
       assertEquals(esperado, actual, 0.0);
       
   }


   
    
}
