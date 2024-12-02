public class Ejercicio25 {
    public static void main(String[] args) {
        int[] distancias = {150, 200, 300, 100, 250};
        for (int i = 0; i < distancias.length; i++) {
            System.out.println("Distancia entre ciudad " + (i + 1) + " y ciudad " + (i + 2) + ": " + distancias[i] + " km");
        }
    }
}
