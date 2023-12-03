/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author eduar
 */
public class Programa {

    public static void main(String[] args) {

        Naipe c1 = new Naipe();
        System.out.println(c1);

        Naipe[] array = new Naipe[2];
        array[0] = new Naipe();
        array[1] = new Naipe();
        Baraja b1 = new Baraja(array);
        System.out.println(b1);
    }
}
