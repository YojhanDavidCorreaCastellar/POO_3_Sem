package Taller_4_Private;
// Clase con una propiedad privada

class Datos {
    private int valor;

    public Datos(int valor) {
        this.valor = valor;
    }

    // No se proporcionan getters ni setters
}

// Clase que intenta acceder directamente a la propiedad privada
class PruebaDatos {
    public static void main(String[] args) {
        Datos datos = new Datos(10);

        // Intento de acceder a la propiedad privada (esto causará un error de compilación)
        // System.out.println(datos.valor); // Descomenta para ver el error

        System.out.println("No se puede acceder directamente a 'valor' porque es privado.");
    }
}

// Discusión:
/*
Sin getters y setters, la propiedad 'valor' de la clase Datos es inaccesible desde fuera de la clase.
Esto refuerza la encapsulación, pero también limita su usabilidad, ya que las clases externas no pueden modificar o recuperar el valor.
Protege los datos de cambios no intencionados, pero podría hacer que la clase sea menos flexible si se requiere acceso legítimo.
Proporcionar acceso controlado a través de getters y setters permite una mejor gestión de la integridad de los datos.
*/
