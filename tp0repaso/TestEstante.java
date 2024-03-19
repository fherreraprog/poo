package tp0repaso;
public class TestEstante
{
  public static void main(String []args ){
    Estante gestor = new Estante(5);

  gestor.agregarProducto(new Producto("Leche", 1.5, 10));
  gestor.agregarProducto(new Producto("Pan", 0.5, 20));
  gestor.agregarProducto(new Producto("Manzanas", 2.0, 15));

  gestor.mostrarProductos();

  Producto producto = gestor.buscarProducto("Pan");
  if (producto != null) {
      System.out.println("Producto encontrado: " + producto);
  } else {
      System.out.println("Producto no encontrado");
  }

  gestor.eliminarProducto("Manzanas");

  gestor.mostrarProductos();
  }
}