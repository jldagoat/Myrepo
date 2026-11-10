package ejercicio02_encapsulamiento;

import java.util.Locale;

public class CuentaBancaria {

    private static final Locale CO = Locale.forLanguageTag("es-CO");

    private final String numero;
    private final String titular;
    private double saldo;

    public CuentaBancaria(String numero, String titular, double saldoInicial) {
        if (numero == null || numero.isBlank() || titular == null || titular.isBlank()) {
            throw new IllegalArgumentException("El número y el titular son obligatorios.");
        }
        if (saldoInicial < 0) {
            throw new IllegalArgumentException("El saldo inicial no puede ser negativo.");
        }
        this.numero = numero.trim();
        this.titular = titular.trim();
        this.saldo = saldoInicial;
    }

    public void depositar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a depositar debe ser mayor que cero.");
        }
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= 0) {
            throw new IllegalArgumentException("El monto a retirar debe ser mayor que cero.");
        }
        if (monto > saldo) {
            throw new IllegalArgumentException(
                    "Fondos insuficientes: el saldo es " + pesos(saldo) + ".");
        }
        saldo -= monto;
    }

    public String getNumero() {
        return numero;
    }

    public String getTitular() {
        return titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public static String pesos(double valor) {
        return String.format(CO, "$%,.0f", valor);
    }
}
