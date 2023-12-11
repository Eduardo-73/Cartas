/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ParteB;

import parteA.Naipe;
import java.util.Random;
import java.util.Scanner;
import parteA.Palo;

/**
 *
 * @author eduar
 */
public class Baraja {

    // Atributos
    private final Naipe[] arrayNaipe;
    final int TAMANIO = 40;
    int index;

    // Construcctor
    public Baraja() {
        /*
        Creo un Naipe y un array[] de Naipe y lo creo a 40 
         */
        Naipe carta;
        Naipe[] array = new Naipe[TAMANIO];
        for (Palo palo : Palo.values()) {
            for (int i = 1; i < 11; i++) {
                // Creo una carta aleatoria
                carta = new Naipe(i, palo);
                boolean repetida = false;
                for (int j = 0; j < index; j++) {
                    // Creo un if para comprobar si la carta esta creado
                    if (array[j] != null && array[j].equals(carta)) {
                        repetida = true;
                        break;
                    }
                }
                // Si no esta repetida la mete en el array
                if (!repetida) {
                    array[index++] = carta;
                }
            }
        }
        this.arrayNaipe = array;
    }

    //Métodos
    public void barajar(int movimiento) {
        int numRd1, numRd2;
        // Creo un bucle con los movimientos  solicitados
        for (int i = 0; i < movimiento; i++) {
            // Creo dos randoms asignandole el tamanio del array
            numRd1 = new Random().nextInt(TAMANIO);
            numRd2 = new Random().nextInt(TAMANIO);
            // Por si se repiten
            do {
                numRd1 = new Random().nextInt(TAMANIO);
            } while (numRd1 == numRd2);
            // Lo muestro para saber cuales son los números
            System.out.println("Nº1 " + numRd1 + " Nº2 " + numRd2);
            // En un Naipe aux le meto la posicion del numRd1 del array de cartas que ya tenía
            Naipe aux = arrayNaipe[numRd1];
            // Ahora cambio la posicion de numRd1 a numRd2
            arrayNaipe[numRd1] = arrayNaipe[numRd2];
            // Finalmente le paso a la posicion numRd2 el naipe aux que cree antes que se encontraba en la posición numRd1
            arrayNaipe[numRd2] = aux;
        }

    }

    public Naipe[] sacar(int numCartas) {
        // Crea un array para almacenar las cartas extraídas
        Naipe[] carta = new Naipe[numCartas];
        // Verifica si el número de cartas solicitado es válido (entre 1 y 40)
        if (numCartas < 1 || numCartas > 40) {
            System.out.println("Número de cartas no válido");
            return new Naipe[0]; // Devuelve un array vacío si el número de cartas no es válido
        }
        // Bucle para extraer el número especificado de cartas
        for (int i = 0; i < numCartas; i++) {
            // Genera un índice aleatorio para seleccionar una posición en la baraja
            int numRd = new Random().nextInt(TAMANIO);
            // Garantiza que la posición seleccionada tenga una carta antes de intentar extraerla
            while (arrayNaipe[numRd] == null) {
                numRd = new Random().nextInt(TAMANIO);
            }
            // Almacena la carta extraída en el array 'carta'
            carta[i] = arrayNaipe[numRd];
            // Marca la posición en la baraja como nula, indicando que la carta ha sido extraída
            arrayNaipe[numRd] = null;
        }
        // Devuelve el array que contiene las cartas extraídas
        return carta;
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
