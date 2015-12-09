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
    public ArrayList<Ingredientes> lista=new ArrayList();

    public Producto_O_Orden(String nombre, double precio, int tiempo, ArrayList<Ingredientes> lista) {
        this.nombre = nombre;
        this.precio = precio;
        this.tiempo = tiempo;
        this.lista = lista;
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

    public ArrayList<Ingredientes> getLista() {
        return lista;
    }

    public void setLista(ArrayList<Ingredientes> lista) {
        this.lista = lista;
    }

    

    @Override
    public String toString() {
        return "Producto_O_Orden{" + "nombre=" + nombre + ", precio=" + precio + ", tiempo=" + tiempo + ", ingredientes=" + lista + '}';
    }

    

   
    
    
    
}
