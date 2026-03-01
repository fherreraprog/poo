<p align="center">
  <img src="https://github.com/user-attachments/assets/86a0c51d-0003-4fb9-9b4e-78244ee78c7e" 
       alt="Banner POO" 
       style="max-width: 100%; height: auto;" />
</p>

## 📖 1. ¿Qué es Scanner?

La clase `Scanner` pertenece al paquete `java.util` y permite leer datos desde:

- Consola (teclado)
- Archivos
- Cadenas de texto

En esta materia la utilizaremos principalmente para **leer datos ingresados por el usuario desde la consola/terminal**.

Es una herramienta estándar en Java y muy útil para manejar datos ingresados por el usuario.


## 📦 2. **Importación de la clase**
Antes de usar `Scanner`, es necesario importarla:
```java
import java.util.Scanner;
```

## 🛠️ 3. **Crear una instancia de Scanner**
Se crea una instancia utilizando el constructor y especificando la fuente de entrada. 

Para leer del teclado:
```java
Scanner scanner = new Scanner(System.in);
```
En la materia trabajaremos con una sola instancia asociada a System.in.

## 🔤 4. **Lectura de datos**
La clase Scanner ofrece métodos para leer distintos tipos de datos:
| Método          | Tipo que lee            | Uso típico              |
| --------------- | ----------------------- | ----------------------- |
| `nextLine()`    | String (línea completa) | Nombre completo, frases |
| `next()`        | String (una palabra)    | Palabras sueltas        |
| `nextInt()`     | int                     | Edad, menú, cantidad    |
| `nextDouble()`  | double                  | Precio, promedio        |
| `nextBoolean()` | boolean                 | true / false            |
| `hasNextInt()`  | Validación              | Verificar antes de leer |

## 🔠 5. Lectura de caracteres (char)

Scanner no tiene un método nextChar().

Para leer un carácter se usa:

```java
char letra = sc.next().charAt(0);
```

-   `next()` → lee una palabra (String)
-   `charAt(0)` → toma el primer carácter

Ejemplo:

``` java
System.out.print("Ingrese una letra: ");
char letra = sc.next().charAt(0);
System.out.println("Ingresaste: " + letra);
```

## 🛡️ Versión más segura
```java
String entrada = sc.next();

if (!entrada.isEmpty()) {
    char letra = entrada.charAt(0);
}
```
------------------------------------------------------------------------

## 🧪 6. Ejemplo básico completo

``` java
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();

        System.out.print("Ingrese su inicial: ");
        char inicial = sc.next().charAt(0);

        System.out.println("Hola " + nombre + 
                           ", tenés " + edad + 
                           " años y tu inicial es " + inicial);

        sc.close();
    }
}
```

## ⚠️ 7. **Limpiar el buffer**
Si se mezclan lecturas de diferentes tipos, es importante limpiar el buffer:

```java
scanner.nextLine(); // Limpia el salto de línea pendiente
```

Ejemplo:

``` java
int edad = sc.nextInt();
sc.nextLine(); // limpiar antes de leer texto
String nombre = sc.nextLine();
```

------------------------------------------------------------------------

## 🛡️ 8. Validación de entradas

### Validación preventiva

``` java
if (sc.hasNextInt()) {
    int numero = sc.nextInt();
} else {
    System.out.println("Entrada inválida.");
    sc.next(); // descarta valor incorrecto
}
```

### Manejo con excepciones (veremos más adelante)

``` java
import java.util.InputMismatchException;

try {
    int numero = sc.nextInt();
} catch (InputMismatchException e) {
    System.out.println("Debe ingresar un número entero.");
    sc.nextLine(); // limpiar buffer
}
```

------------------------------------------------------------------------

## ✅ 9. Buenas prácticas en la materia

-   Crear una sola instancia de `Scanner`
-   Cerrar el `Scanner` al finalizar (`sc.close()`)
-   Limpiar el buffer cuando se mezclen tipos
-   Validar entradas antes de usarlas
-   No capturar `Exception` genérica si podemos usar
    `InputMismatchException`

------------------------------------------------------------------------

## 10. **Cerrar el Scanner**
Es una buena práctica cerrar el Scanner al finalizar su uso para liberar recursos:
```java
scanner.close();
```
------------------------------------------------------------------------

## 11. **Ventajas y desventajas de Scanner**
Ventajas:

Sencillo y fácil de usar.
Compatible con diversas fuentes de entrada.
Bien documentado.

Desventajas:

Puede generar problemas al mezclar tipos de datos sin limpiar el buffer.
No es seguro en aplicaciones multihilo.





