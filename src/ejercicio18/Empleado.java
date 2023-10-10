package ejercicio18;

public class Empleado {

    public String nombres;
    public int codigoEmpleado;
    public int horasTrabajadas;
    public int valorHora;
    public double porcentajeRetencion;

    public Empleado(int codigoEmpleado, String nombres, int horasTrabajadas, int valorHora, double porcentajeRetencion) {
        this.codigoEmpleado = codigoEmpleado;
        this.nombres = nombres;
        this.horasTrabajadas = horasTrabajadas;
        this.valorHora = valorHora;
        this.porcentajeRetencion = porcentajeRetencion;
    }

    public double calcularSalarioBruto() {
        return horasTrabajadas * valorHora;
    }

    public double calcularRetencion() {
        double salarioBruto = calcularSalarioBruto();
        double porcentajeRetencionCambio = porcentajeRetencion / 100;
        return salarioBruto * porcentajeRetencionCambio;
    }

    public double calcularSalarioNeto() {
        double salarioBruto = calcularSalarioBruto();
        double retencion = calcularRetencion();
        return salarioBruto - retencion;
    }
}