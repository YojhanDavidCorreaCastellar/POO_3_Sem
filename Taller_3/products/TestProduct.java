package Taller_3.products;

class Product {
    String name;  // Package-access property
    double price;  // Package-access property
    int stock;     // Package-access property

    // Package-access constructor
    Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    // Package-access method to display information
    void showInfo() {
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Stock: " + stock);
    }
}

// Test class within the same package
public class TestProduct {
    public static void main(String[] args) {
        Product product = new Product("Laptop", 1500.0, 10);
        product.showInfo();
    }
}
