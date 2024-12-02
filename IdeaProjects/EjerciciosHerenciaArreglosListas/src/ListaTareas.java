import java.util.ArrayList;
import java.util.List;

class Tarea {
    String descripcion;
    boolean completada;

    Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false;
    }

    void marcarComoCompletada() {
        completada = true;
    }

    @Override
    public String toString() {
        return descripcion + " - " + (completada ? "Completada" : "Pendiente");
    }
}

public class Ejercicio19 {
    public static void main(String[] args) {
        List<Tarea> tareas = new ArrayList<>();
        tareas.add(new Tarea("Comprar comida"));
        tareas.add(new Tarea("Limpiar la casa"));

        tareas.get(0).marcarComoCompletada();

        for (Tarea tarea : tareas) {
            System.out.println(tarea);
        }
    }
}
