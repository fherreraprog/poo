package tp0repaso;
public class Estante {

    private Producto[] productos;
    private int numProductos;

    public Estante(int tamaño) {
        productos = new Producto[tamaño];
        numProductos = 0;
    }

    public void agregarProducto(Producto producto) {
            productos[numProductos++] = producto;
        }
    
    public void mostrarProductos() {
        for (int i = 0; i < numProductos; i++) {
            System.out.println(productos[i]);
        }
    }
    public Producto buscarProducto(String nombre) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return productos[i];
            }
        }
        return null;/*podemos retornar false or true, pero nos sirve el producto*/
    }
    public void eliminarProducto(String nombre) {
        int pos = buscarPosicionProducto(nombre);
        if (pos != -1) {
            for (int i = pos; i < numProductos - 1; i++) {
                productos[i] = productos[i + 1];
            }
            numProductos--;
        } else {
            System.out.println("Producto no encontrado");
        }
    }
    private int buscarPosicionProducto(String nombre) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getNombre().equals(nombre)) {
                return i;
            }
        }
        return -1;
    }
}
