<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>

## **3. Diferencias clave entre Vector y ArrayList**

| **Característica**        | **Vector**                                | **ArrayList**                         |
|---------------------------|-------------------------------------------|---------------------------------------|
| **Sincronización**        | Sí (Thread-safe).                         | No sincronizado.                     |
| **Rendimiento**           | Más lento debido a la sincronización.     | Más rápido en aplicaciones de un solo hilo. |
| **Capacidad de crecimiento** | Incrementa al doble.                     | Incrementa en un 50%.                |
| **Uso**                   | Menos común en aplicaciones modernas.     | Más utilizado actualmente.           |


## **4. Introducción al Operador Diamante (`<>`)**

El operador **diamante** (`<>`) simplifica la sintaxis de los tipos genéricos en Java, eliminando la necesidad de repetir el tipo al crear una colección.

### **Ejemplo sin operador diamante:**
```java
ArrayList<String> lista = new ArrayList<String>();
```

### **Ejemplo con operador diamante:**
```java
ArrayList<String> lista = new ArrayList<>();
```

El compilador deduce automáticamente el tipo genérico a partir del lado izquierdo de la asignación. Esto mejora la legibilidad del código y reduce errores.
