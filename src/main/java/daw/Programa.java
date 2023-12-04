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

        System.out.println("Apartado 1º");
        Naipe c1 = new Naipe();
        System.out.println(c1);
        Naipe c2 = new Naipe(15, Palo.ESPADAS);
        System.out.println(c2);
        System.out.println("Apartado 2º");
        Baraja b1 = new Baraja();
        System.out.println(b1);

    }
}
