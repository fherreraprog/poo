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

    /**
     * Agrega un producto al estante.
     *
     * @param producto El producto a agregar.
     */
    public void agregarProducto(Producto producto) {
        if (producto != null && producto.getNombre() != null && !producto.getNombre().isEmpty()) {
            modelo.agregarProducto(producto);
            vista.mostrarMensaje("Producto agregado correctamente.");
        } else {
            vista.mostrarMensaje("Error: Datos del producto no válidos.");
        }
    }

    /**
     * Busca un producto en el estante por su nombre y muestra los detalles.
     *
     * @param nombre El nombre del producto a buscar.
     */
    public void buscarProducto(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            Producto producto = modelo.buscarProducto(nombre);
            vista.mostrarProducto(producto);
        } else {
            vista.mostrarMensaje("Error: El nombre del producto no puede ser nulo o vacío.");
        }
    }

    /**
     * Elimina un producto del estante por su nombre y muestra un mensaje.
     *
     * @param nombre El nombre del producto a eliminar.
     */
    public void eliminarProducto(String nombre) {
        if (nombre != null && !nombre.isEmpty()) {
            modelo.eliminarProducto(nombre);
        } else {
            vista.mostrarMensaje("Error: El nombre del producto no puede ser nulo o vacío.");
        }
    }

    /**
     * Muestra la lista de productos en el estante.
     */
    public void mostrarProductos() {
        vista.mostrarProductos(modelo.getProductos());
    }

    /**
     * Inicia la interacción con el usuario mostrando el menú.
     */
    public void iniciar() {
        vista.mostrarMenu();
    }
}