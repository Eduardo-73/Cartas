/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

/**
 *
 * @author eduar
 */
public class Baraja {

    // Atributos
    private Naipe[] arrayNaipe;

    // Construcctor
    public Baraja(Naipe[] arrayNaipe) {
        this.arrayNaipe = arrayNaipe;
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
            sb.append("arrayNaipe " + (i + 1) + "º = " ).append(arrayNaipe[i] + "\n");
        }
        return sb.toString();
    }
}
