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
        System.out.println("-------");
        b1.barajar(30);
        System.out.println(b1);
        System.out.println("-------");
        Naipe[] mostrar = b1.sacar(5);
        System.out.println(b1);
        for (int i = 0; i < mostrar.length; i++) {
            System.out.println(mostrar[i]);
        }
    }
}
