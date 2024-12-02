public class Ejercicio29 {
    public static void main(String[] args) {
        int[] produccion = {100, 200, 150, 180, 220};
        for (int i = 0; i < produccion.length; i++) {
            System.out.println("Día " + (i + 1) + ": " + produccion[i] + " unidades producidas");
        }
    }
}
