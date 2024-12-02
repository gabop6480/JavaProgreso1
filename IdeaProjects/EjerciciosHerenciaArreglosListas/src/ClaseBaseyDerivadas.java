class Vehiculo {
    void encender() {
        System.out.println("El vehículo se enciende.");
    }
}

class Coche extends Vehiculo {
    @Override
    void encender() {
        System.out.println("El coche se enciende.");
    }
}

class Camion extends Vehiculo {
    @Override
    void encender() {
        System.out.println("El camión se enciende.");
    }
}

public class Ejercicio8 {
    public static void main(String[] args) {
        Vehiculo miCoche = new Coche();
        Vehiculo miCamion = new Camion();
        miCoche.encender();
        miCamion.encender();
    }
}
