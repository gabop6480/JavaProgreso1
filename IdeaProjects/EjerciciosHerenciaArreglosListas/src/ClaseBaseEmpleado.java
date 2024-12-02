class Empleado {
    String nombre;

    Empleado(String nombre) {
        this.nombre = nombre;
    }

    void trabajar() {
        System.out.println(nombre + " está trabajando.");
    }
}

class Gerente extends Empleado {
    Gerente(String nombre) {
        super(nombre);
    }

    @Override
    void trabajar() {
        System.out.println(nombre + " está gestionando.");
    }
}

class Ingeniero extends Empleado {
    Ingeniero(String nombre) {
        super(nombre);
    }

    @Override
    void trabajar() {
        System.out.println(nombre + " está desarrollando.");
    }
}

public class Ejercicio16 {
    public static void main(String[] args) {
        Empleado gerente = new Gerente("Carlos");
        Empleado ingeniero = new Ingeniero("Ana");

        gerente.trabajar();
        ingeniero.trabajar();
    }
}
