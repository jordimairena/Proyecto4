/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.ArrayList;


/**
 *
 * @author Memo
 */
public class Lugar {
    public String nombre;    
    ArrayList <Vecinos> vecinos;
    
    public Lugar() {
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
        vecinos= new ArrayList <Vecinos>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
