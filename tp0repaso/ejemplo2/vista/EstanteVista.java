package tp0repaso.ejemplo2.vista;

import tp0repaso.ejemplo2.controlador.EstanteControlador;
import tp0repaso.ejemplo2.modelo.*;

import java.util.List;
import java.util.Scanner;

public class EstanteVista {

    private EstanteControlador controlador;
    private Scanner scanner;

    public EstanteVista() {
        scanner = new Scanner(System.in);
    }

    public void setControlador(EstanteControlador controlador) {
        this.controlador = controlador;
    }

    public void iniciar() {
        mostrarMenu();
    }

    public void mostrarMenu() {
        int opcion;

        do {
            System.out.println("\n--- MENÚ ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("0. Salir");

            opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    controlador.mostrarProductos();
                    break;
            }

        } while (opcion != 0);
    }

    private void agregarProducto() {

        System.out.println("1. Perecedero");
        System.out.println("2. No perecedero");

        int tipo = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Nombre: ");
        String nombre = scanner.nextLine();

        System.out.print("Precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Cantidad: ");
        int cantidad = scanner.nextInt();
        scanner.nextLine();

        Producto producto;

        if (tipo == 1) {
            System.out.print("Fecha de caducidad: ");
            String fecha = scanner.nextLine();

            producto = new ProductoPerecedero(nombre, precio, cantidad, fecha);
        } else {
            producto = new ProductoNoPerecedero(nombre, precio, cantidad);
        }

        controlador.agregarProducto(producto);
    }

    public void mostrarProductos(List<Producto> productos) {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public void mostrarMensaje(String msg) {
        System.out.println(msg);
    }
}
