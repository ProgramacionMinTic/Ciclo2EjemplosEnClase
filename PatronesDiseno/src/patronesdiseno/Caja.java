/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronesdiseno;

/**
 *
 * @author Danny
 */
public class Caja<T> {

    protected T obj;

    public Caja(T obj) {
        this.obj = obj;
    }

    public T obtener() {
        return this.obj;
    }
    
    

    public String decorar() {
        String s = this.obj.toString();
        String linea = "*";
        for (int i = 0; i < s.length(); i++) {
            linea += "*";
        }
        linea += "*";
        return linea + "\n*" + s + "*\n" + linea;

    }

}
