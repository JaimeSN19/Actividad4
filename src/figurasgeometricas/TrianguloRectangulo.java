package figurasgeometricas;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class TrianguloRectangulo {
    int base;
    int altura;
    int lado;

     public TrianguloRectangulo(double baseTriangulo, double alturaTriangulo, double ladoTriangulo) {
        this.base = (int) baseTriangulo;
        this.altura = (int) alturaTriangulo;
        this.lado = (int) ladoTriangulo;
    }

    double calcularArea() {
        return (base * altura / 2);
    }

    double calcularPerímetro() {
        return (base + altura + calcularHipotenusa());
    }

    double calcularHipotenusa() {
        return Math.pow(base * base + altura * altura, 0.5);
    }

    
    String determinarTipoTriángulo() {
        if ((base == altura) && (base == lado) && (altura == lado))
           return  "equilátero";
        else if ((base != altura) && (base != lado) &&
                (altura != lado))
            return "escaleno";
        else
            return "isósceles";
    }
}