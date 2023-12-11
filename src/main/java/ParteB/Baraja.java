/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Baraja {

    // Atributos
    private final Naipe[] arrayNaipe;

    // Construcctor
    public Baraja() {
        this.arrayNaipe = new Naipe[40];
        for (int i = 0; i < arrayNaipe.length; i++) {
            for (int j = 0; j < 10; j++) {
                arrayNaipe[j] = new Naipe(j + 1, Palo.OROS);
            }
        }
    }

    // Getters y Setters
    public Naipe[] getArrayNaipe() {
        return arrayNaipe;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayNaipe.length; i++) {
            sb.append((i + 1) + "º Naipe de la baraja " + "= ").append(arrayNaipe[i] + "\n");
        }
        return sb.toString();
    }
}
