import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<String> cadenas = new ArrayList<>();
        cadenas.add("Hola");
        cadenas.add("Mundo");
        for (String cadena : cadenas) {
            System.out.println(cadena);
        }
    }
}
