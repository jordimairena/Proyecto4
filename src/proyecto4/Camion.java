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
public class Camion {
    public String nombre;
    public ArrayList lista = new ArrayList();

    public Camion(String nombre,ArrayList lista) {
        this.nombre = nombre;
        this.lista=lista;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList getLista() {
        return lista;
    }

    public void setLista(ArrayList lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Camion{" + "nombre=" + nombre + ", lista=" + lista + '}';
    }
    
    
    
}
