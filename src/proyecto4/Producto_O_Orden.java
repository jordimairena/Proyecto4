/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

import java.util.ArrayList;

/**
 *
 * @author jordi
 */
public class Producto_O_Orden {
    public String nombre;
    public double precio;
    public int tiempo;
    public Object ingredientes[];

    public Producto_O_Orden(String nombre, double precio, int tiempo,Object ingredientes[]) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public Object[] getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(Object[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    @Override
    public String toString() {
        return "Producto_O_Orden{" + "nombre=" + nombre + ", precio=" + precio + ", tiempo=" + tiempo + ", ingredientes=" + ingredientes + '}';
    }

    

   
    
    
    
}
