package ejercicio02_encapsulamiento;

public class Main {

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria("001-234", "Ana Torres", 500_000);
        System.out.println("Cuenta " + cuenta.getNumero() + " de " + cuenta.getTitular());
        System.out.println("Saldo inicial: " + CuentaBancaria.pesos(cuenta.getSaldo()));

        cuenta.depositar(250_000);
        System.out.println("Después de depositar $250.000: "
                + CuentaBancaria.pesos(cuenta.getSaldo()));

        cuenta.retirar(100_000);
        System.out.println("Después de retirar $100.000: "
                + CuentaBancaria.pesos(cuenta.getSaldo()));

        System.out.println();
        System.out.println("--- Operaciones inválidas ---");

        try {
            cuenta.retirar(2_000_000);
        } catch (IllegalArgumentException e) {
            System.out.println("Retirar $2.000.000 -> " + e.getMessage());
        }

        try {
            cuenta.depositar(-50);
        } catch (IllegalArgumentException e) {
            System.out.println("Depositar -$50 -> " + e.getMessage());
        }

        try {
            new CuentaBancaria("002-345", "Luis Gómez", -1);
        } catch (IllegalArgumentException e) {
            System.out.println("Crear cuenta con saldo negativo -> " + e.getMessage());
        }

        System.out.println();
        System.out.println("Saldo final: " + CuentaBancaria.pesos(cuenta.getSaldo()));
    }
}
