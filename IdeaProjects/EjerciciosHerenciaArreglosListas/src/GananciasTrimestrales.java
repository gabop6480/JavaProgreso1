public class Ejercicio22 {
    public static void main(String[] args) {
        double[][] ganancias = {
                {5000.0, 5200.0, 4800.0},
                {6000.0, 6100.0, 5900.0}
        };
        for (int i = 0; i < ganancias.length; i++) {
            System.out.print("Año " + (i + 1) + ": ");
            for (double ganancia : ganancias[i]) {
                System.out.print("$" + ganancia + " ");
            }
            System.out.println();
        }
    }
}
