class Poliza {
    String tipo;

    Poliza(String tipo) {
        this.tipo = tipo;
    }

    void mostrarDetalles() {
        System.out.println("Póliza de tipo: " + tipo);
    }
}

class PolizaVida extends Poliza {
    PolizaVida() {
        super("Vida");
    }
}

class PolizaAuto extends Poliza {
    PolizaAuto() {
        super("Auto");
    }
}

public class Ejercicio20 {
    public static void main(String[] args) {
        Poliza vida = new PolizaVida();
        Poliza auto = new PolizaAuto();

        vida.mostrarDetalles();
        auto.mostrarDetalles();
    }
}
