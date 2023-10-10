/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio23;

public class EcuacionCuadratica {

    private double a;
    private double b;
    private double c;
  
 
    public EcuacionCuadratica(double a, double b, double c) {
      this.a = a;
      this.b = b;
      this.c = c;
    }
  
    //método que calcula el discriminante
    public double calcularDiscriminante() {
      return (b * b) - (4 * a * c);
    }
  
    //método que calcula las soluciones de la ecuación cuadrática
    public String calcularSoluciones() {
      double discriminante = calcularDiscriminante();
  
      if (discriminante < 0) {
 return "La ecuación no tiene solución real";
      } else if (discriminante == 0) {
        double x = (-b )/ (2 * a);
        return "La ecuación tiene una única solución real: x = " + x;
      } else {
        double x1 = (-b + Math.sqrt(discriminante)) / (2 * a);
        double x2 = (-b - Math.sqrt(discriminante)) / (2 * a);
        return "La ecuación tiene dos soluciones reales: " + "\nx1 = " + x1 + "\nx2 = " + x2;
      }
    }
  }