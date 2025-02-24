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

public class Pez extends Animal {
    private String tipoDeAgua;

    public Pez(String especie, String tipoDeAgua) {
        super(especie);
        this.tipoDeAgua = tipoDeAgua;
    }

    @Override
    public String mostrarEspecie() {
        return super.mostrarEspecie() + ", Tipo de Agua: " + tipoDeAgua;
    }

    public static void main(String[] args) {
        Animal animal = new Animal("Mamífero");
        Pez pez = new Pez("Pez Payaso", "Agua Salada");

        System.out.println(animal.mostrarEspecie());
        System.out.println(pez.mostrarEspecie());
    }
}

