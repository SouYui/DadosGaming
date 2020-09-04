/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package udemy.poo.inicio;

import udemy.poo.codigo.Juego;

/**
 *
 * @author luisangelcuriel
 */
public class Inicio {
    public static void main(String[] args) {
        Juego[] juego = new Juego[10];
        
        for (int i = 0; i < 10; i++) {
            juego[i] = new Juego();
        }
        int indice = 1;
        
        for (Juego juegos : juego) {
            juegos.iniciarJuego("Jugador: " + indice);
            indice ++;
        }
    }
}
