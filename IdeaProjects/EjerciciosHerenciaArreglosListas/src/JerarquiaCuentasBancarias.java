class CuentaBancaria {
    double saldo;

    void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Depositados: $" + cantidad);
    }
}

class CuentaAhorros extends CuentaBancaria {
    void generarIntereses() {
        saldo += saldo * 0.02;
        System.out.println("Intereses generados. Nuevo saldo: $" + saldo);
    }
}

class CuentaCorriente extends CuentaBancaria {
    void emitirCheque(double cantidad) {
        if (saldo >= cantidad) {
            saldo -= cantidad;
            System.out.println("Cheque emitido por: $" + cantidad);
        } else {
            System.out.println("Fondos insuficientes.");
        }
    }
}

public class Ejercicio12 {
    public static void main(String[] args) {
        CuentaAhorros ahorros = new CuentaAhorros();
        ahorros.depositar(1000);
        ahorros.generarIntereses();

        CuentaCorriente corriente = new CuentaCorriente();
        corriente.depositar(500);
        corriente.emitirCheque(200);
    }
}
