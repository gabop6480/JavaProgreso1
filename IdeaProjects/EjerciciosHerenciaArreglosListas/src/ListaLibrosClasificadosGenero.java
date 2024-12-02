import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ejercicio27 {
    public static void main(String[] args) {
        Map<String, List<String>> libros = new HashMap<>();
        libros.put("Ficción", new ArrayList<>());
        libros.put("No ficción", new ArrayList<>());

        libros.get("Ficción").add("El Señor de los Anillos");
        libros.get("No ficción").add("Sapiens");

        for (Map.Entry<String, List<String>> entry : libros.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}
