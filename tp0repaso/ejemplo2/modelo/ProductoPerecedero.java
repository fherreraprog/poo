package tp0repaso.ejemplo2.modelo;

public class ProductoPerecedero extends Producto {

    private String fechaCaducidad;

    public ProductoPerecedero(String nombre, double precio, int cantidad, String fechaCaducidad) {
        super(nombre, precio, cantidad);
        this.fechaCaducidad = fechaCaducidad;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", fechaCaducidad='" + fechaCaducidad + "'";
    }
}
