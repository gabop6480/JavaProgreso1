public class Ejercicio10 {
    public static void main(String[] args) {
        double[][] calificaciones = {
                {90.5, 85.0, 88.0},
                {78.0, 82.5, 91.0},
                {88.0, 74.0, 80.5}
        };
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Estudiante " + (i + 1) + ": ");
            for (double nota : calificaciones[i]) {
                System.out.print(nota + " ");
            }
            System.out.println();
        }
    }
}
