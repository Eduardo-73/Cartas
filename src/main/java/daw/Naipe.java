/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author eduar
 */
public class Naipe {

    public static Scanner teclado = new Scanner(System.in);
    // Atributos
    private int numCarta;
    private Palo palo;

    // Contructores
    public Naipe() {
        this.numCarta = new Random().nextInt(1, 11);
        int numAleatorio = new Random().nextInt(1, 4 + 1);
        switch (numAleatorio) {
            case 1 -> {
                this.palo = Palo.OROS;
            }
            case 2 -> {
                this.palo = Palo.ESPADAS;
            }
            case 3 -> {
                this.palo = Palo.COPAS;
            }
            case 4 -> {
                this.palo = Palo.BASTOS;
            }
        }
    }

    public Naipe(int numCarta, Palo palo) {
        if (numCarta < 1 || numCarta > 10) {
            this.numCarta = volverElegirNumCarta();
        } else {
            this.numCarta = numCarta;
        }
        this.palo = palo;
    }

    //Métodos
    public int volverElegirNumCarta() {
        int numero = 0;
        do {
            System.out.println("Elige el número de cartas (1 al 10),"
                    + " ya que lo has escedido antes:");
            try {
                numero = teclado.nextInt();
            } catch (InputMismatchException ime) {
                System.out.println("Escribe un número del 1 al 10");
                teclado.nextLine();
            }
        } while (numero < 1 || numero > 10);
        return numero;
    }

    // Getters y Setters
    public int getNumCarta() {
        return numCarta;
    }

    public void setNumCarta(int numCarta) {
        this.numCarta = numCarta;
    }

    public Palo getPalo() {
        return palo;
    }

    public void setPalo(Palo palo) {
        this.palo = palo;
    }

    // ToString
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Naipe{");
        sb.append("numCarta=").append(numCarta);
        sb.append(", palo=").append(palo);
        sb.append('}');
        return sb.toString();
    }
}
