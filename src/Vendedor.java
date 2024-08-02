import java.util.ArrayList;

public class Vendedor {
    private static final double SALARIO_SEMANAL = 2000.0;
    private static final double COMISION_PORCENTAJE = 0.06;
    private final ArrayList<Double> ventasDiarias;

    public Vendedor() {
        this.ventasDiarias = new ArrayList<>();
    }

    public double getSalarioSemanal() {
        return SALARIO_SEMANAL;
    }

    public void agregarVentaDiaria(double venta) {
        ventasDiarias.add(venta);
    }

    public double calcularIngresoSemanal() {
        double ventasBrutas = 0.0;
        for (double venta : ventasDiarias) {
            ventasBrutas += venta;
        }
        double comision = ventasBrutas * COMISION_PORCENTAJE;
        return SALARIO_SEMANAL + comision;
    }

    public double obtenerVentasBrutas() {
        double ventasBrutas = 0.0;
        for (double venta : ventasDiarias) {
            ventasBrutas += venta;
        }
        return ventasBrutas;
    }
}
