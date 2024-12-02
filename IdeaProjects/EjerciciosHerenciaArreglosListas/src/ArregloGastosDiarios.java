public class Ejercicio17 {
    public static void main(String[] args) {
        double[] gastos = {15.5, 20.0, 30.3, 25.0, 18.7, 22.0, 19.5};
        for (int i = 0; i < gastos.length; i++) {
            System.out.println("Día " + (i + 1) + ": $" + gastos[i]);
        }
    }
}
