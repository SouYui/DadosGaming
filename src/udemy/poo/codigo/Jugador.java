/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.codigo;

/**
 *
 * @author luisangelcuriel
 */
public class Jugador {
    private String nombre;
    private Credito credito;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.credito = new Credito();
    }

    public String getNombre() {
        return nombre;
    }

    public Credito getCredito() {
        return credito;
    }

    @Override
    public String toString() {
        return "Jugador: " + nombre + " Crédito: " + credito;
    }
}
