public class Ejercicio30 {
    public static void main(String[] args) {
        String[][] horarios = {
                {"9:00 AM - 5:00 PM", "Pedro"},
                {"10:00 AM - 6:00 PM", "María"},
                {"8:00 AM - 4:00 PM", "Juan"}
        };
        for (String[] horario : horarios) {
            System.out.println("Empleado: " + horario[1] + " - Horario: " + horario[0]);
        }
    }
}
