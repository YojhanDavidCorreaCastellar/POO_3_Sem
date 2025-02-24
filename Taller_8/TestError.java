package Taller_8;

// Clase A
class A {
    private String attributeA;

    public A(String attributeA) {
        this.attributeA = attributeA;
    }

    public String getAttributeA() {
        return attributeA;
    }
}

// Clase B
class B {
    private String attributeB;

    public B(String attributeB) {
        this.attributeB = attributeB;
    }

    public String getAttributeB() {
        return attributeB;
    }
}

// Intentar crear una clase que hereda de múltiples clases
// Esto no es posible en Java y producirá un error de compilación
// class C extends A, B {
//     public C(String attributeA, String attributeB) {
//         super(attributeA);
//         // super(attributeB); // Esto también causará un error
//     }
// }

// Clase que hereda de una sola clase e intenta acceder a atributos privados
class D extends A {
    private String attributeD;

    public D(String attributeA, String attributeD) {
        super(attributeA);
        this.attributeD = attributeD;
    }

    public void showDetails() {
        // Intentar acceder a atributos privados de la clase base directamente
        // System.out.println("Attribute A: " + attributeA); // Error: attributeA tiene acceso privado en A
        System.out.println("Attribute A: " + getAttributeA()); // Correcto
        System.out.println("Attribute D: " + attributeD);
    }
}

public class TestError {
    public static void main(String[] args) {
        // Intentar instanciar la clase que hereda de múltiples clases
        // C c = new C("valueA", "valueB"); // Error de compilación

        D d = new D("valueA", "valueD");
        d.showDetails();
    }
}
