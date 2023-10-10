/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author usuario
 */
public class Cuadrado {

    int lado;

    public Cuadrado(double ladoCuadrado) {
        this.lado = (int) ladoCuadrado;
    }
    double calcularArea() {
        return lado * lado;
    }

    double calcularPerímetro() {
        return (4 * lado);
    }
}