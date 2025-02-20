package Taller_6;

class EjemploStatic {
    private int numeroNoEstatico = 10;

    // Forma incorrecta que intenta acceder a un atributo que no es static
    // Esto genera un error de compilación porque los métodos static no tienen
    // acceso directo a atributos que no son static.
    /*
    public static void metodoIncorrecto() {
        numeroNoEstatico = 20; // ERROR: Un método estático no puede acceder a este atributo.
    }
    */

    // CORRECCIÓN DE METODO STATIC

    public static void metodoCorrecto(EjemploStatic instancia) {
        instancia.numeroNoEstatico = 20;
    }

    public void mostrarNumero() {
        System.out.println("Valor del atributo: " + numeroNoEstatico);
    }
}

public class TestStatic {
    public static void main(String[] args) {
        EjemploStatic obj = new EjemploStatic();

        System.out.println("Antes de usar metodoCorrecto:");
        obj.mostrarNumero();

        EjemploStatic.metodoCorrecto(obj);

        System.out.println("Después de usar metodoCorrecto:");
        obj.mostrarNumero();
    }
}
