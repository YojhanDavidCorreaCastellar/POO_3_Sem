package Taller_5;

class Banco {
    // Discusión:
    // Hacer que 'saldo' sea 'protected' no es seguro porque deja el campo abierto para que
    // otras clases del mismo paquete o clases accedan y modifiquen el saldo.
    // Esto puede causar errores o permitir que alguien altere los datos sin ningún control.
    //
    // Una mejor solución sería cambiar 'saldo' a 'private' y usar métodos como getSaldo() o
    // depositar() para trabajar con él, asi nos aseguramos de que cualquier cambio pase por
    // validaciones y no haya acceso directo que comprometa la seguridad de los datos.

    private double saldo; 

    public Banco(double saldoInicial) {
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            System.out.println("El saldo inicial no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Se han depositado $" + cantidad);
        } else {
            System.out.println("La cantidad a depositar debe ser positiva.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Se han retirado $" + cantidad);
        } else {
            System.out.println("Cantidad inválida para retirar.");
        }
    }

    public void mostrarSaldo() {
        System.out.println("Saldo actual: $" + saldo);
    }
}

