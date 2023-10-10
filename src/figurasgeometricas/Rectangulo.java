/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

public class Rectangulo {

    int base;
    int altura;

     Rectangulo(double baseRectangulo, double alturaRectangulo) {
        this.base = (int) baseRectangulo;
        this.altura = (int) alturaRectangulo;
    }

    double calcularArea() {
        return base * altura;
    }

    double calcularPerímetro() {
        return (2 * base) + (2 * altura);
    }
}