import java.util.ArrayList;
import java.util.List;

public class Ejercicio11 {
    public static void main(String[] args) {
        List<String> clientes = new ArrayList<>();
        clientes.add("Juan");
        clientes.add("María");
        clientes.add("Pedro");

        String buscar = "María";
        if (clientes.contains(buscar)) {
            System.out.println(buscar + " encontrado.");
        } else {
            System.out.println(buscar + " no está en la lista.");
        }
    }
}
