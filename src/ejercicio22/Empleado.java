/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio22;

public class Empleado {
     String nombre;
     double salarioBasico;
     double horasTrabajadas;
     double salarioMensual;
    
 
    public Empleado(String nombre, double salarioBasico, double horasTrabajadas) {
        this.nombre = nombre;
        this.salarioBasico = salarioBasico;
        this.horasTrabajadas = horasTrabajadas;
        this.calcularSalarioMensual();
    }
    
    // Métodos
    public void calcularSalarioMensual() {
        this.salarioMensual = this.salarioBasico * this.horasTrabajadas;
    }
    
    public String obtenerResultado() {
        if (this.salarioMensual > 450000) {
            return "El salario mensual de " + this.nombre + " es $" + this.salarioMensual;
        } else {
            return this.nombre;
        }
    }
}