<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>


# **Introducción a Vector en Java**


## **1. ¿Qué es Vector?**

La clase **`Vector`** pertenece al paquete `java.util` y es una lista dinámica que puede crecer o disminuir según sea necesario. Fue una de las primeras implementaciones de listas en Java, pero ha sido reemplazada en muchos casos por estructuras más modernas como el **`ArrayList`**.

### **Características principales de Vector**
- **Sincronización**: Los métodos de `Vector` están sincronizados, lo que significa que es seguro para múltiples hilos, pero esto puede ralentizar el rendimiento.
- **Duplicados permitidos**: Permite almacenar elementos duplicados.
- **Tamaño dinámico**: Ajusta automáticamente su capacidad según sea necesario.

### **Métodos comunes de Vector**

| **Método**               | **Descripción**                                                                 |
|--------------------------|---------------------------------------------------------------------------------|
| `add(E e)`               | Añade un elemento al final del vector.                                          |
| `get(int index)`         | Devuelve el elemento en la posición especificada.                               |
| `remove(int index)`      | Elimina el elemento en la posición especificada.                                |
| `size()`                 | Devuelve el número de elementos en el vector.                                   |
| `isEmpty()`              | Verifica si el vector está vacío.                                               |
| `capacity()`             | Devuelve la capacidad actual del vector.                                        |

### **Ejemplo básico de Vector**
```java
import java.util.Vector;

public class EjemploVector {
    public static void main(String[] args) {
        // Crear un Vector
        Vector<String> vector = new Vector<>();

        // Añadir elementos
        vector.add("Rojo");
        vector.add("Azul");
        vector.add("Verde");

        // Acceder a elementos
        System.out.println("Primer elemento: " + vector.get(0));

        // Eliminar un elemento
        vector.remove(1); // Elimina "Azul"

        // Mostrar todos los elementos
        System.out.println("Elementos del vector: " + vector);

        // Tamaño y capacidad
        System.out.println("Tamaño: " + vector.size());
        System.out.println("Capacidad: " + vector.capacity());
    }
}
```

