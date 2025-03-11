package tp0repaso.modelo;

import java.util.ArrayList;
import java.util.List;

/**
 * La clase Estante representa un estante que contiene una colección de productos.
 * Permite agregar, buscar, eliminar y mostrar productos en el estante.
 *
 * @author Franco
 * @version 1.0
 * 11/06/2024
 */
public class Estante {

    /** La lista de productos en el estante. */
    private List<Producto> productos;

    /**
     * Constructor para crear un nuevo objeto Estante.
     */
    public Estante() {
        this.productos = new ArrayList<>();
    }

    /**
     * Agrega un producto al estante.
     *
     * @param producto El producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        if (producto != null) {
            this.productos.add(producto);
        } else {
            System.out.println("El producto no puede ser nulo.");
        }
    }

    /**
     * Busca un producto en el estante por su nombre.
     *
     * @param nombre El nombre del producto a buscar.
     * @return El producto encontrado, o null si no se encuentra.
     */
    public Producto buscarProducto(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            for (Producto producto : this.productos) {
                if (producto.getNombre().equalsIgnoreCase(nombre)) {
                    return producto;
                }
            }
        }
        return null;
    }

    /**
     * Elimina un producto del estante por su nombre.
     *
     * @param nombre El nombre del producto a eliminar.
     */
    public void eliminarProducto(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            Producto producto = buscarProducto(nombre);
            if (producto != null) {
                this.productos.remove(producto);
            } else {
                System.out.println("Producto no encontrado.");
            }
        } else {
            System.out.println("El nombre del producto no puede ser nulo o vacío.");
        }
    }

    /**
     * Obtiene la lista de productos en el estante.
     *
     * @return La lista de productos en el estante.
     */
    public List<Producto> getProductos() {
        return productos;
    }
}
