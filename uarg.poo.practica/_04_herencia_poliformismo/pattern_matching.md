<p align="center">
  <img src="https://github.com/user-attachments/assets/86a0c51d-0003-4fb9-9b4e-78244ee78c7e" 
       alt="Banner POO" 
       style="max-width: 100%; height: auto;" />
</p>

## Pattern Matching en Java

## 1. ¿Qué es Pattern Matching?

El **Pattern Matching** es una característica introducida en versiones recientes de Java (desde Java 16) que simplifica la comprobación de tipos y la extracción de valores de objetos. Su objetivo es reducir la verbosidad del código y evitar errores comunes, como los _casts_ redundantes.

El Pattern Matching permite:
- **Comprobar el tipo de un objeto** (como con `instanceof`).
- **Extraer automáticamente sus valores** sin necesidad de hacer un _cast_ manual.

---

## 2. Pattern Matching con `instanceof` (Java 16+)

Antes de Java 16, al usar `instanceof`, debías hacer un _cast_ manual para acceder a los métodos del objeto.
Con Pattern Matching, esto se simplifica.

### Ejemplo sin Pattern Matching:
```java
if (obj instanceof String) {
    String s = (String) obj; 
    System.out.println(s.length());
}
```
---

### Ejemplo con Pattern Matching:

```java
if (obj instanceof String s) { 
    System.out.println(s.length());
}
```
---

### 3. ¿Cuándo usar Pattern Matching?

Comprobación de tipos: Cuando necesitas verificar el tipo de un objeto y actuar en consecuencia.
Legibilidad: Cuando quieres escribir código más limpio y fácil de entender.

### 4. Recursos Adicionales

- **[Documentación oficial](https://docs.oracle.com/en/java/)**
