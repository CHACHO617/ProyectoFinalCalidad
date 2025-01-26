import java.util.ArrayList;
import java.util.List;

public class InventoryPrinter {
    private List<Product> products = new ArrayList<Product>();

    public InventoryPrinter(List<Product> products) {
        this.products = products;
    }

    // Método para imprimir el inventario completo (Nombre, cantidad y precio)
    public void printInventory() {
        //Refactorizacion para el uso de expresiones lambda para imprimir los productos
        products.stream()
                .map(product -> "Product: " + product.getName() + ", Quantity: " + product.getQuantity() + ", Price: $" + product.getPrice())
                .forEach(System.out::println);
    }
}
