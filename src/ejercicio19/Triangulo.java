/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio19;

public class Triangulo {
    public double ladoTriangulo;



    public Triangulo (double ladoTriangulo){
        this.ladoTriangulo = ladoTriangulo;
    }

    public  double perimetro () {
        return ladoTriangulo * 3;
        
    }

    public double altura(){
        return (ladoTriangulo *Math.sqrt(3))/2;
    }

    public double area (){
       return (Math.pow(ladoTriangulo,2))*(Math.sqrt(3)/4);

    }
}