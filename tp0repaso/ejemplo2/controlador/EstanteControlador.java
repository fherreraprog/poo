package tp0repaso.ejemplo2.controlador;


import tp0repaso.ejemplo2.modelo.*;
import tp0repaso.ejemplo2.vista.EstanteVista;

public class EstanteControlador {

    private Estante modelo;
    private EstanteVista vista;

    public EstanteControlador(Estante modelo, EstanteVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void agregarProducto(Producto producto) {

        boolean agregado = modelo.agregarProducto(producto);

        if (agregado) {
            vista.mostrarMensaje("Producto agregado correctamente.");
        } else {
            vista.mostrarMensaje("Error al agregar producto.");
        }
    }

    public void mostrarProductos() {
        vista.mostrarProductos(modelo.obtenerProductos());
    }

    public void iniciar() {
        vista.iniciar();
    }
}
