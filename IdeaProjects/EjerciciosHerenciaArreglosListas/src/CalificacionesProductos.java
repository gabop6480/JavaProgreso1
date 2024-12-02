public class Ejercicio18 {
    public static void main(String[] args) {
        int[][] calificaciones = {
                {5, 4, 5},
                {4, 3, 4},
                {5, 5, 5}
        };
        for (int i = 0; i < calificaciones.length; i++) {
            System.out.print("Producto " + (i + 1) + ": ");
            for (int calificacion : calificaciones[i]) {
                System.out.print(calificacion + " ");
            }
            System.out.println();
        }
    }
}
