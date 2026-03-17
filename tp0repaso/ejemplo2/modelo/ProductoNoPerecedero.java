package tp0repaso.ejemplo2.modelo;

public class ProductoNoPerecedero extends Producto {

    public ProductoNoPerecedero(String nombre, double precio, int cantidad) {
        super(nombre, precio, cantidad);
    }

    @Override
    public String toString() {
        return super.toString() + " (No perecedero)";
    }
}
