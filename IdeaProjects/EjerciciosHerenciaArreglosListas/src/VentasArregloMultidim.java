public class Ejercicio6 {
    public static void main(String[] args) {
        double[][] ventas = {
                {500.0, 700.0, 900.0},
                {800.0, 600.0, 750.0}
        };
        for (double[] fila : ventas) {
            for (double venta : fila) {
                System.out.print(venta + " ");
            }
            System.out.println();
        }
    }
}
