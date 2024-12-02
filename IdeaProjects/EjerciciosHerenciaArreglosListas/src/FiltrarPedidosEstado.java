import java.util.ArrayList;
import java.util.List;

class Pedido {
    String descripcion;
    String estado;

    Pedido(String descripcion, String estado) {
        this.descripcion = descripcion;
        this.estado = estado;
    }

    @Override
    public String toString() {
        return descripcion + " (" + estado + ")";
    }
}

public class Ejercicio15 {
    public static void main(String[] args) {
        List<Pedido> pedidos = new ArrayList<>();
        pedidos.add(new Pedido("Pedido 1", "Pendiente"));
        pedidos.add(new Pedido("Pedido 2", "Completado"));
        pedidos.add(new Pedido("Pedido 3", "Pendiente"));

        for (Pedido pedido : pedidos) {
            if (pedido.estado.equals("Pendiente")) {
                System.out.println(pedido);
            }
        }
    }
}
