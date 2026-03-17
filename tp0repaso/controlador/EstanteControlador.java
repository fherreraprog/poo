package tp0repaso.controlador;

import tp0repaso.modelo.Estante;
import tp0repaso.modelo.Producto;
import tp0repaso.vista.EstanteVista;

/**
 * La clase EstanteControlador actúa como intermediario entre el modelo y la vista.
 *
 * @author Franco
 * @version 1.0
 * 11/06/2024
 */
public class EstanteControlador {

    private Estante modelo;
    private EstanteVista vista;

    /**
     * Constructor para crear un nuevo objeto EstanteControlador.
     *
     * @param modelo El modelo del estante.
     * @param vista  La vista del estante.
     */

    public EstanteControlador(Estante modelo, EstanteVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarProducto(Producto producto) {

        if (producto == null) {
            vista.mostrarMensaje("Error: producto inválido.");
            return;
        }

        boolean agregado = modelo.agregarProducto(producto);

        if (agregado) {
            vista.mostrarMensaje("Producto agregado correctamente.");
        } else {
            vista.mostrarMensaje("No se pudo agregar el producto.");
        }
    }

    public void buscarProducto(String nombre) {

        Producto producto = modelo.buscarProducto(nombre);
        vista.mostrarProducto(producto);

    }

    /**
     * Elimina un producto del estante por su nombre y muestra un mensaje.
     *
     * @param nombre El nombre del producto a eliminar.
     */
    public void eliminarProducto(String nombre) {

        boolean eliminado = modelo.eliminarProducto(nombre);

        if (eliminado) {
            vista.mostrarMensaje("Producto eliminado correctamente.");
        } else {
            vista.mostrarMensaje("Producto no encontrado.");
        }
    }

    public void mostrarProductos() {
        vista.mostrarProductos(modelo.obtenerProductos());
    }
}