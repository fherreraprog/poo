package tp0repaso;

import tp0repaso.controlador.EstanteControlador;
import tp0repaso.modelo.Estante;
import tp0repaso.vista.EstanteVista;
/**
 * La clase Main se encarga de iniciar la aplicación y mostrar el menú interactivo .
 *
 * @author Franco
 * @version 1.0.1
 * 17/03/2026
 */
public class Main {

    public static void main(String[] args) {

        Estante modelo = new Estante();
        EstanteVista vista = new EstanteVista();
        EstanteControlador controlador = new EstanteControlador(modelo, vista);

        vista.setControlador(controlador);

        // La vista inicia el flujo de la aplicación
        vista.iniciar();
    }
}