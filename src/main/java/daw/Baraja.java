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
    private Naipe[] arrayNaipe;

    // Construcctor
    public Baraja() {
        this.arrayNaipe = new Naipe[tamañoArray()];
        for (int i = 0; i < arrayNaipe.length; i++) {
            arrayNaipe[i] = new Naipe();
        }
    }

    // Métodos
    public int tamañoArray() {
        Scanner teclado = new Scanner(System.in);
        int num;
        System.out.print("Introduce el tamaño de la baraja: ");
        num = teclado.nextInt();
        return num;
    }

    // Getters y Setters
    public Naipe[] getArrayNaipe() {
        return arrayNaipe;
    }

    public void setArrayNaipe(Naipe[] arrayNaipe) {
        this.arrayNaipe = arrayNaipe;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arrayNaipe.length; i++) {
            sb.append("arrayNaipe " + (i + 1) + "º = ").append(arrayNaipe[i] + "\n");
        }
        return sb.toString();
    }
}
