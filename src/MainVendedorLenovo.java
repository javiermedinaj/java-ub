import java.util.Scanner;

class VendedorLenovo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vendedor vendedor = new Vendedor();
        String[] diasDeLaSemana = {"Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"};

        for (String dia : diasDeLaSemana) {
            System.out.print("Venta del día " + dia + ": ");
            double venta = scanner.nextDouble();
            vendedor.agregarVentaDiaria(venta);
        }

        double ventasBrutas = vendedor.obtenerVentasBrutas();
        double ingresoSemanal = vendedor.calcularIngresoSemanal();
        double salarioSemanal = vendedor.getSalarioSemanal();
        double comisionSemanal = ingresoSemanal - salarioSemanal;

        System.out.println("Total de ventas brutas en la semana: $" + ventasBrutas);
        System.out.println("Ingreso semanal del vendedor: $" + ingresoSemanal);
        System.out.println("Salario semanal del vendedor (sin comisión): $" + salarioSemanal);
        System.out.println("Comisión semanal del vendedor: $" + comisionSemanal);

        scanner.close();
    }
}
