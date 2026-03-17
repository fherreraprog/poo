package tp0repaso.ejemplo2;

import tp0repaso.ejemplo2.controlador.EstanteControlador;
import tp0repaso.ejemplo2.modelo.Estante;
import tp0repaso.ejemplo2.vista.EstanteVista;

public class Main {

    public static void main(String[] args) {

        Estante modelo = new Estante();
        EstanteVista vista = new EstanteVista();
        EstanteControlador controlador = new EstanteControlador(modelo, vista);

        vista.setControlador(controlador);

        vista.iniciar();
    }
}