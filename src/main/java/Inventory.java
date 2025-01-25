import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<Product>();

    // Método para agregar un nuevo producto a la lista.
    public void addProduct(String name, int quantity, double price) {
        products.add(new Product(name, quantity, price));
        System.out.println("Product added.");
    }

    // Método para imprimir el inventario completo
    public void printInventory() {
        for (Product product : products) {
            System.out.println("Product: " + product.getName() + ", Quantity: " + product.getQuantity() + ", Price: $"
                    + product.getPrice());
        }
    }

    public List<Product> getProducts() {
        return products;
    }

    // Método main para probar la funcionalidad
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 5, 1000.0);
        inventory.printInventory();
    }
}
