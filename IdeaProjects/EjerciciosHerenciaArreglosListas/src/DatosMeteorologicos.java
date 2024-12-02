public class Ejercicio26 {
    public static void main(String[] args) {
        double[][] datosMeteorologicos = {
                {20.5, 21.0, 19.8},
                {18.9, 22.3, 20.1},
                {19.7, 23.4, 21.0}
        };
        for (int i = 0; i < datosMeteorologicos.length; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            for (double dato : datosMeteorologicos[i]) {
                System.out.print(dato + " °C ");
            }
            System.out.println();
        }
    }
}
