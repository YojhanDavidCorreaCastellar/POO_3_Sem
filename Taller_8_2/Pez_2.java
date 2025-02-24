package Taller_8_2;

class Animal {
    private String especie;

    public Animal(String especie) {
        this.especie = especie;
    }

    public String mostrarEspecie() {
        return "Especie: " + especie;
    }
}

public class Pez_2 extends Animal {
    private String tipoDeAgua;

    public Pez_2(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public String mostrarEspecie() {
        // Uso correcto del método mostrarEspecie() para acceder a la especie
        return super.mostrarEspecie() + ", Tipo de Agua: " + tipoDeAgua;
    }

    public static void main(String[] args) {
        Pez_2 pez = new Pez_2("Pez Payaso", "Agua Salada");
        System.out.println(pez.mostrarEspecie());
    }
}
