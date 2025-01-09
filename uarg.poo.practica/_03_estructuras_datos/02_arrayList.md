<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>

## **2. ¿Qué es ArrayList?**

La clase **`ArrayList`** es parte del paquete `java.util` y es una lista dinámica ampliamente utilizada en Java. Es similar al `Vector`, pero no está sincronizada, lo que la hace más eficiente en entornos de un solo hilo.

### **Características principales de ArrayList**
- **No sincronizado**: Más rápido que `Vector` en aplicaciones de un solo hilo.
- **Duplicados permitidos**: Permite almacenar elementos duplicados.
- **Tamaño dinámico**: Ajusta automáticamente su capacidad según sea necesario.

### **Métodos comunes de ArrayList**

| **Método**               | **Descripción**                                                                 |
|--------------------------|---------------------------------------------------------------------------------|
| `add(E e)`               | Añade un elemento al final de la lista.                                         |
| `get(int index)`         | Devuelve el elemento en la posición especificada.                               |
| `remove(int index)`      | Elimina el elemento en la posición especificada.                                |
| `set(int index, E e)`    | Reemplaza el elemento en la posición especificada.                              |
| `size()`                 | Devuelve el número de elementos en la lista.                                    |
| `isEmpty()`              | Verifica si la lista está vacía.                                                |
| `clear()`                | Elimina todos los elementos de la lista.                                        |

### **Ejemplo básico de ArrayList**
```java
import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        // Crear un ArrayList
        ArrayList<String> lista = new ArrayList<>();

        // Añadir elementos
        lista.add("Java");
        lista.add("Python");
        lista.add("C++");

        // Acceder a elementos
        System.out.println("Primer elemento: " + lista.get(0));

        // Modificar un elemento
        lista.set(1, "JavaScript");

        // Eliminar un elemento
        lista.remove(2);

        // Mostrar todos los elementos
        System.out.println("Lista: " + lista);

        // Tamaño de la lista
        System.out.println("Tamaño: " + lista.size());
    }
}
```
