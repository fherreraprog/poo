package tp0repaso.vista;

import tp0repaso.controlador.EstanteControlador;
import tp0repaso.modelo.Producto;
import java.util.List;
import java.util.Scanner;

/**
 * La clase EstanteVista se encarga de la presentación de los datos del estante y
 * de la interacción con el usuario a través de un menú interactivo.
 *
 * @author Franco
 * @version 1.0
 * 11/06/2024
 */
public class EstanteVista {

    private EstanteControlador controlador;
    private Scanner scanner;

    /**
     * Constructor para crear un nuevo objeto EstanteVista.
     *
     * @param controlador El controlador del estante.
     */
    public EstanteVista() {
        this.scanner = new Scanner(System.in);
    }
    
    public void setControlador(EstanteControlador controlador) {
        this.controlador = controlador;
    }

    /**
     * Muestra el menú principal y procesa las opciones del usuario.
     */
    public void mostrarMenu() {
        int opcion;
        do {
            System.out.println("\n--- Menú del Estante ---");
            System.out.println("1. Agregar producto");
            System.out.println("2. Buscar producto");
            System.out.println("3. Eliminar producto");
            System.out.println("4. Mostrar productos");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opción: ");

            // Validar la opción del menú
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número válido.");
                scanner.next(); // Limpiar el buffer del scanner
            }
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    agregarProducto();
                    break;
                case 2:
                    buscarProducto();
                    break;
                case 3:
                    eliminarProducto();
                    break;
                case 4:
                    mostrarProductos();
                    break;
                case 0:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        } while (opcion != 0);
    }

    /**
     * Permite al usuario agregar un nuevo producto al estante.
     */
    private void agregarProducto() {
        System.out.println("\n--- Agregar Producto ---");

        // Validar nombre
        String nombre;
        do {
            System.out.print("Nombre: ");
            nombre = scanner.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (nombre == null || nombre.isEmpty());

        // Validar precio
        double precio;
        do {
            System.out.print("Precio: ");
            while (!scanner.hasNextDouble()) {
                System.out.println("Error: Ingrese un número válido para el precio.");
                scanner.next(); // Limpiar el buffer del scanner
            }
            precio = scanner.nextDouble();
            if (precio < 0) {
                System.out.println("Error: El precio no puede ser negativo.");
            }
        } while (precio < 0);

        // Validar cantidad
        int cantidad;
        do {
            System.out.print("Cantidad: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Error: Ingrese un número entero válido para la cantidad.");
                scanner.next(); // Limpiar el buffer del scanner
            }
            cantidad = scanner.nextInt();
            if (cantidad < 0) {
                System.out.println("Error: La cantidad no puede ser negativa.");
            }
        } while (cantidad < 0);

        scanner.nextLine(); // Limpiar el buffer del scanner

        // Crear y agregar el producto
        Producto producto = new Producto(nombre, precio, cantidad);
        controlador.agregarProducto(producto);
    }

    /**
     * Permite al usuario buscar un producto por su nombre.
     */
    private void buscarProducto() {
        System.out.println("\n--- Buscar Producto ---");

        // Validar nombre
        String nombre;
        do {
            System.out.print("Nombre del producto: ");
            nombre = scanner.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (nombre == null || nombre.isEmpty());

        controlador.buscarProducto(nombre);
    }

    /**
     * Permite al usuario eliminar un producto por su nombre.
     */
    private void eliminarProducto() {
        System.out.println("\n--- Eliminar Producto ---");

        // Validar nombre
        String nombre;
        do {
            System.out.print("Nombre del producto: ");
            nombre = scanner.nextLine();
            if (nombre == null || nombre.isEmpty()) {
                System.out.println("Error: El nombre no puede estar vacío.");
            }
        } while (nombre == null || nombre.isEmpty());

        controlador.eliminarProducto(nombre);
    }

    /**
     * Muestra la lista de productos en el estante.
     */
    private void mostrarProductos() {
        controlador.mostrarProductos();
    }

    /**
     * Muestra los detalles de un producto.
     *
     * @param producto El producto a mostrar.
     */
    public void mostrarProducto(Producto producto) {
        if (producto != null) {
            System.out.println("Detalles del producto:");
            System.out.println("Nombre: " + producto.getNombre());
            System.out.println("Precio: " + producto.getPrecio());
            System.out.println("Cantidad: " + producto.getCantidad());
        } else {
            System.out.println("Producto no encontrado.");
        }
    }

    /**
     * Muestra la lista de productos en el estante.
     *
     * @param productos La lista de productos a mostrar.
     */
    public void mostrarProductos(List<Producto> productos) {
        if (productos.isEmpty()) {
            System.out.println("El estante está vacío.");
        } else {
            System.out.println("Lista de productos en el estante:");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }

    /**
     * Muestra un mensaje al usuario.
     *
     * @param mensaje El mensaje a mostrar.
     */
    public void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }
}