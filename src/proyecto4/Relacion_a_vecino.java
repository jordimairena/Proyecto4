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
public class Relacion_a_vecino {

    int nivel;
    Lugar to;

    public Relacion_a_vecino(int nivel, Lugar to) {
        this.nivel = nivel;
        this.to = to;
    }

    public int getLevel() {
        return nivel;
    }

    public Lugar getTo() {
        return to;
    }

    @Override
    public String toString() {
        return "" + nivel;
    }
}
