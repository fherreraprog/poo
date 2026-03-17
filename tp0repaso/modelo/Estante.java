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

    private List<Producto> productos;

    public Estante() {
        this.productos = new ArrayList<>();
    }

    public boolean agregarProducto(Producto producto) {

        if (producto == null) {
            return false;
        }

        return productos.add(producto);
    }

    /**
     * Busca un producto en el estante por su nombre.
     *
     * @param nombre El nombre del producto a buscar.
     * @return El producto encontrado, o null si no se encuentra.
     */

    public Producto buscarProducto(String nombre) {

        if (nombre == null || nombre.isEmpty()) {
            return null;
        }

        for (Producto producto : productos) {
            if (producto.getNombre().equalsIgnoreCase(nombre)) {
                return producto;
            }
        }

        return null;
    }

    public boolean eliminarProducto(String nombre) {

        Producto producto = buscarProducto(nombre);

        if (producto != null) {
            productos.remove(producto);
            return true;
        }

        return false;
    }

    /**
     * Obtiene la lista de productos en el estante.
     *
     * @return La lista de productos en el estante.
     */

    public List<Producto> obtenerProductos() {
        return new ArrayList<>(productos);
    }
}