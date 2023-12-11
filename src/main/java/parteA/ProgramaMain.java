/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parteA;

/**
 *
 * @author eduar
 */
public class ProgramaMain {

    public static void main(String[] args) {
        // Bucle infinito que sale cuando carta es Rey de Oros
        while (true) {
            Naipe cartas = new Naipe();
            System.out.println(cartas);
            if (cartas.getNumCarta() == 10 && cartas.getPalo() == Palo.OROS) {
                System.out.println("Ya se ha encontrado el Rey de Oros");
                break;
            }
        }
    }
}
