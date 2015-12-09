/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto4;

/**
 *
 * @author jordi
 */
public class Vecinos {

    Lugar lugar;
    Relacion_a_vecino weight;
    Relacion peso;

    public Vecinos(Lugar lugar, Relacion_a_vecino weight) {
        this.lugar = lugar;
        this.weight = weight;
        this.peso = new Relacion(weight.getLevel(), weight.getTo());
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }

    public Relacion_a_vecino getWeight() {
        return weight;
    }

    public Relacion getPeso() {
        return peso;
    }
}
