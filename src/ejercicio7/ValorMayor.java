/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio7;


public class ValorMayor {

    private int valorA;
    private int valorB;

    public ValorMayor(int valorA, int valorB) {
        this.valorA = valorA;
        this.valorB = valorB;
    }

    public String compararNumeros() {
        if (valorA > valorB) {
            return("A es mayor que B");
        } else if (valorA < valorB) {
            return("A es menor que B");
        } else {
            return("A es igual a B");
        }
    }

}
