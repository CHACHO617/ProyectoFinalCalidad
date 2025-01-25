import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;

public class InventoryTest {

    private Inventory inventory;

    // Inicializamos el inventario antes de cada prueba
    @BeforeEach
    public void setUp() {
        inventory = new Inventory();
    }

    @Test
    public void testAddProduct() {
        inventory.addProduct("Laptop", 5, 1000.0);

        // Verificar que se haya agregado un producto
        List<Product> products = inventory.getProducts();
        assertEquals(1, products.size());
        assertEquals("Laptop", products.get(0).getName());
        assertEquals(5, products.get(0).getQuantity());
        assertEquals(1000.0, products.get(0).getPrice());
    }

    @Test
    public void testPrintInventory() {
        inventory.addProduct("Laptop", 5, 1000.0);
        inventory.addProduct("Phone", 10, 500.0);

        // Aquí, puedes redirigir la salida estándar para verificar si la impresión es
        // correcta.
        assertDoesNotThrow(() -> inventory.printInventory());
    }
}
