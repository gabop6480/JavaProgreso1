import java.util.HashMap;
import java.util.Map;

public class Ejercicio23 {
    public static void main(String[] args) {
        Map<String, String> proyectos = new HashMap<>();
        proyectos.put("Proyecto A", "Juan, María");
        proyectos.put("Proyecto B", "Pedro, Ana");

        for (Map.Entry<String, String> entry : proyectos.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
