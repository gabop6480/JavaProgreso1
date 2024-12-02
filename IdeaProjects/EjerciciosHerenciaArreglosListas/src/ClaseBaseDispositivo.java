class Dispositivo {
    void encender() {
        System.out.println("El dispositivo se enciende.");
    }
}

class Portatil extends Dispositivo {
    @Override
    void encender() {
        System.out.println("El portátil se enciende.");
    }
}

class Smartphone extends Dispositivo {
    @Override
    void encender() {
        System.out.println("El smartphone se enciende.");
    }
}

public class Ejercicio24 {
    public static void main(String[] args) {
        Dispositivo portatil = new Portatil();
        Dispositivo smartphone = new Smartphone();

        portatil.encender();
        smartphone.encender();
    }
}
