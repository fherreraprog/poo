package tp0repaso;

import tp0repaso.controlador.EstanteControlador;
import tp0repaso.modelo.Estante;
import tp0repaso.vista.EstanteVista;

/**
 * La clase Main se encarga de iniciar la aplicación y mostrar el menú interactivo.
 *
 * @author Franco
 * @version 1.0
 * 11/06/2024
 */
public class Main {

    public static void main(String[] args) {
        // Crear el modelo
        Estante modelo = new Estante();

        // Crear la vista
        EstanteVista vista = new EstanteVista(); 

        // Crear el controlador y asignarle la vista
        EstanteControlador controlador = new EstanteControlador(modelo, vista);

        // Asignar el controlador a la vista
        vista.setControlador(controlador);

        // Iniciar la aplicación
        controlador.iniciar();
    }
}