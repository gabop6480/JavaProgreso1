public class Ejercicio14 {
    public static void main(String[] args) {
        double[][] ventasMensuales = {
                {1000.5, 1200.3, 1100.8},
                {950.2, 1020.5, 980.0}
        };
        for (int i = 0; i < ventasMensuales.length; i++) {
            System.out.print("Mes " + (i + 1) + ": ");
            for (double venta : ventasMensuales[i]) {
                System.out.print("$" + venta + " ");
            }
            System.out.println();
        }
    }
}
