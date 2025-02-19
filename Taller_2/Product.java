package Taller_2;

public class Product {
    private String name;
    private double price;

    public void Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public void showProduct() {
        System.out.println("Name: " + name);
        System.out.println("Price: $" + price);
    }
}
