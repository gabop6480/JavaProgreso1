class MetodoPago {
    void procesarPago() {
        System.out.println("Procesando pago genérico.");
    }
}

class TarjetaCredito extends MetodoPago {
    @Override
    void procesarPago() {
        System.out.println("Procesando pago con tarjeta de crédito.");
    }
}

class Paypal extends MetodoPago {
    @Override
    void procesarPago() {
        System.out.println("Procesando pago con PayPal.");
    }
}

public class Ejercicio28 {
    public static void main(String[] args) {
        MetodoPago tarjeta = new TarjetaCredito();
        MetodoPago paypal = new Paypal();

        tarjeta.procesarPago();
        paypal.procesarPago();
    }
}
