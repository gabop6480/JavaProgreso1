import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Producto {
    String nombre;
    double precio;

    Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " - $" + precio;
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        List<Producto> productos = new ArrayList<>();
        productos.add(new Producto("Manzana", 1.5));
        productos.add(new Producto("Pan", 2.0));
        productos.add(new Producto("Leche", 1.2));

        Collections.sort(productos, Comparator.comparingDouble(p -> p.precio));

        for (Producto p : productos) {
            System.out.println(p);
        }
    }
}
