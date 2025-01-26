public class ProductValidator {
    public void validateParameters(String name, int quantity, double price) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("El producto tiene que tener un nombre ");
        }
        if (quantity <= 0) {
            throw new IllegalArgumentException("La cantidad debe ser mayor a 0");
        }
        if (price <= 0) {
            throw new IllegalArgumentException("EL precio debe ser mayor a 0");
        }
    }
}
