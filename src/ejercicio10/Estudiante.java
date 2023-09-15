package ejercicio10;


public class Estudiante {

    private int numeroInscripcion;
    private String nombres;
    private double patrimonio;
    private int estratoSocial;

    public Estudiante(int numeroInscripcion, String nombres, double patrimonio, int estratoSocial) {
        this.numeroInscripcion = numeroInscripcion;
        this.nombres = nombres;
        this.patrimonio = patrimonio;
        this.estratoSocial = estratoSocial;
    }

    public double calcularMatricula() {
        double valorMatricula = 50000;

        if (patrimonio > 2000000 && estratoSocial > 3) {
            valorMatricula += patrimonio * 0.03;
        }

        return valorMatricula;
    }

    public int getNumeroInscripcion() {
        return numeroInscripcion;
    }

    public String getNombres() {
        return nombres;
    }


}
