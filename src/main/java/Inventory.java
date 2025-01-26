import java.util.ArrayList;
import java.util.List;

public class Inventory {
    private List<Product> products = new ArrayList<Product>();
    private final ProductValidator productValidator = new ProductValidator();

    // Método para agregar un nuevo producto a la lista.
    public void addProduct(String name, int quantity, double price) {
        if (verifyProductExist(name)) {
            throw new IllegalArgumentException("El producto ya existe");
        }
        productValidator.validateParameters(name, quantity, price);
        products.add(new Product(name, quantity, price));
        System.out.println("Product added.");
    }
    public boolean verifyProductExist(String name) {
        return products.stream().anyMatch(product -> product.getName().equals(name));
    }


    public List<Product> getProducts() {
        return products;
    }

    // Método main para ejecutar el sistema y probar la funcionalidad
    public static void main(String[] args) {
        Inventory inventory = new Inventory();
        inventory.addProduct("Laptop", 5, 1000.0);
        InventoryPrinter printer = new InventoryPrinter(inventory.getProducts());
        printer.printInventory();
    }

}
