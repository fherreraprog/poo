package tp0repaso.modelo;

/**
 * La clase Producto representa un producto en un sistema de inventario.
 * Contiene información sobre el nombre, precio y cantidad del producto.
 *
 * @author Franco
 * @version 1.0
 * 11/06/2024
 */
public class Producto {

    /** El nombre del producto. */
    private String nombre;

    /** El precio del producto. */
    private double precio;

    /** La cantidad disponible del producto en el inventario. */
    private int cantidad;

    /**
     * Constructor para crear un nuevo objeto Producto.
     *
     * @param nombre   El nombre del producto.
     * @param precio   El precio del producto.
     * @param cantidad La cantidad inicial del producto en el inventario.
     */
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    // Getters y setters...
    /**
     * Obtiene el nombre del producto.
     *
     * @return El nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Establece el nombre del producto.
     *
     * @param nombre El nuevo nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Obtiene el precio del producto.
     *
     * @return El precio del producto.
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * Establece el precio del producto.
     *
     * @param precio El nuevo precio del producto.
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * Obtiene la cantidad disponible del producto en el inventario.
     *
     * @return La cantidad disponible del producto.
     */
    public int getCantidad() {
        return cantidad;
    }

    /**
     * Establece la cantidad disponible del producto en el inventario.
     *
     * @param cantidad La nueva cantidad disponible del producto.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * Devuelve una representación en cadena del objeto Producto.
     *
     * @return Una cadena que representa el objeto Producto.
     */
    @Override
    public String toString() {
        return "Producto{" + "nombre='" + nombre + '\'' + ", precio=" + precio + ", cantidad=" + cantidad + '}';
    }
}
