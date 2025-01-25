import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testProductConstructorAndGetters() {
        // Crear un objeto Product
        Product product = new Product("Laptop", 5, 1000.0);

        // Verificar que los datos sean correctos
        assertEquals("Laptop", product.getName());
        assertEquals(5, product.getQuantity());
        assertEquals(1000.0, product.getPrice());
    }

    @Test
    public void testProductPrice() {
        Product product = new Product("Phone", 10, 500.0);
        assertEquals(500.0, product.getPrice(), "El precio debería ser 500.0");
    }

    @Test
    public void testProductQuantity() {
        Product product = new Product("Tablet", 3, 250.0);
        assertEquals(3, product.getQuantity(), "La cantidad debería ser 3");
    }
}
