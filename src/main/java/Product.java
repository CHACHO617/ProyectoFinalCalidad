public class Product {
    private String name;
    private int quantity;
    private double price;

    // Constructor para inicializar un producto
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    // Métodos getter para acceder a los atributos del producto
    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }
}
