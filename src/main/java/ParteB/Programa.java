/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteB;

import parteA.Naipe;

/**
 *
 * @author eduar
 */
public class Programa {

    public static void main(String[] args) {
        Baraja b1 = new Baraja();
        System.out.println(b1);
        System.out.println("Mover cartas");
        b1.barajar(10);
        System.out.println(b1);
        Naipe[] mostrar = b1.sacar(5);
        System.out.println("Cartas sacadas de la baraja ");
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println(mostrar[i]);
        }
        System.out.println("Cambio el tamaño de la baraja ");
        System.out.println(b1);
    }
}
