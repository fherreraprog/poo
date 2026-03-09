# 📐 Estándares de Codificación – Práctica de POO (Java)

Este documento define los **estándares mínimos de codificación** que deben respetarse en los trabajos prácticos de la materia **Programación Orientada a Objetos**.

Su objetivo es:
- mejorar la legibilidad del código
- facilitar la corrección y el feedback
- alinear la práctica con los criterios vistos en la teoría
- introducir buenas prácticas profesionales en Java

👉 Estos estándares son **obligatorios en la práctica**.

---

## 📦 Organización de paquetes

- Los paquetes deben escribirse **en minúsculas**.
- Deben reflejar el trabajo práctico y su rol.

Ejemplo:
```java
package tpN.ejercicioX_nombre.modelo;

```
🧱 Convenciones de nombres
Clases

Usar PascalCase

Nombre sustantivo, claro y representativo

✔ Correcto:

```java
Producto
Alumno
CuentaBancaria
```

❌ Incorrecto:
```java
producto
prod
Clase1
```

Atributos y métodos

Usar camelCase

Nombres descriptivos

✔ Correcto:
```java
private double precio;
public double getPrecio()
```

❌ Incorrecto:
```java
double p;
getprecio()
```

Constantes

Usar static final

Nombre en MAYÚSCULAS
```java
public static final int MAX_CANTIDAD = 100;
```

📝 Documentación con Javadoc
📌 Documentación de la clase

Toda clase debe tener un comentario Javadoc que indique:

qué representa

autor

versión

fecha
```java
Ejemplo:

/**
 * La clase Producto representa un producto en un sistema de inventario.
 * Contiene información sobre el nombre, precio y cantidad del producto.
 *
 * @author Franco
 * @version 1.0
 * @since 11/06/2024
 */
public class Producto {

```


📌 Documentación de atributos

Cada atributo debe tener un comentario breve:
```java
/** El nombre del producto. */
private String nombre;
```

📌 Documentación de métodos

Todo método público debe documentarse con:

descripción

@param (si corresponde)

@return (si corresponde)

Ejemplo:

```java
/**
 * Obtiene el precio del producto.
 *
 * @return El precio del producto.
 */
public double getPrecio() {
    return precio;
}
```

📌 Documentación de constructores

```java

/**
 * Constructor para crear un nuevo objeto Producto.
 *
 * @param nombre   El nombre del producto.
 * @param precio   El precio del producto.
 * @param cantidad La cantidad inicial del producto.
 */
public Producto(String nombre, double precio, int cantidad) {
    this.nombre = nombre;
    this.precio = precio;
    this.cantidad = cantidad;
}

```

🔁 Métodos sobrescritos

Los métodos sobrescritos deben usar @Override y estar documentados.
```java

/**
 * Devuelve una representación en cadena del objeto Producto.
 *
 * @return Una cadena que representa el objeto Producto.
 */
@Override
public String toString() {
    return "Producto{" +
            "nombre='" + nombre + '\'' +
            ", precio=" + precio +
            ", cantidad=" + cantidad +
            '}';
}
```

🎯 Buenas prácticas generales

✔ Una clase = una responsabilidad
✔ Atributos siempre privados
✔ Acceso mediante getters y setters
✔ Código legible antes que código “ingenioso”
✔ Sangrado consistente (4 espacios)

❌ Evitar métodos largos
❌ Evitar nombres genéricos (aux, var, x)
❌ Evitar lógica compleja sin explicar

🧠 Relación con la evaluación

Estos estándares:

se tienen en cuenta en la corrección

impactan en la claridad del feedback

reflejan el proceso de aprendizaje, no solo el resultado final

👉 El código no solo debe funcionar, también debe poder leerse y entenderse.
