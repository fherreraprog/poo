<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>

# Resumen del uso de la clase Scanner en Java

La clase `Scanner` pertenece al paquete `java.util` y se utiliza para leer datos de entrada desde diversas fuentes, como la consola (teclado), archivos y cadenas. Es una herramienta estándar en Java y muy útil para manejar datos ingresados por el usuario.

## 1. **Importación de la clase**
Antes de usar `Scanner`, es necesario importarla:
```java
import java.util.Scanner;
```

## 2. **Crear una instancia de Scanner**
Se crea una instancia utilizando el constructor y especificando la fuente de entrada. Para leer del teclado:
```java
Scanner scanner = new Scanner(System.in);
```
## 3. **Lectura de datos**
La clase Scanner ofrece métodos para leer distintos tipos de datos:

nextLine(): Lee una línea completa.
next(): Lee una palabra (sin incluir espacios).
nextInt(): Lee un número entero.
nextDouble(): Lee un número decimal.
nextBoolean(): Lee un valor booleano.

Ejemplo:
```java

System.out.print("Ingrese su nombre: ");
String nombre = scanner.nextLine();

System.out.print("Ingrese su edad: ");
int edad = scanner.nextInt();
```
## 4. **Limpiar el buffer**
Si se mezclan lecturas de diferentes tipos, es importante limpiar el buffer:

```java
scanner.nextLine(); // Limpia el salto de línea pendiente
```

## 5. **Cerrar el Scanner**
Es una buena práctica cerrar el Scanner al finalizar su uso para liberar recursos:
```
java
scanner.close();
```
6. Manejo de excepciones
Es recomendable manejar errores para evitar que el programa falle si el usuario ingresa datos incorrectos:

java
Copiar código
try {
    System.out.print("Ingrese un número entero: ");
    int numero = scanner.nextInt();
    System.out.println("El número ingresado es: " + numero);
} catch (Exception e) {
    System.out.println("Error: entrada no válida.");
} finally {
    scanner.close();
}
7. Ejemplo completo
Este ejemplo combina varios tipos de datos:

java
Copiar código
import java.util.Scanner;

public class EjemploScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("¿Cómo te llamas? ");
        String nombre = scanner.nextLine();

        System.out.print("¿Cuántos años tienes? ");
        int edad = scanner.nextInt();
        scanner.nextLine(); // Limpia el buffer

        System.out.print("¿Cuánto pesas? ");
        double peso = scanner.nextDouble();
        scanner.nextLine(); // Limpia el buffer

        System.out.print("¿Estás estudiando? (true/false): ");
        boolean estudiando = scanner.nextBoolean();

        System.out.println("Tu nombre es " + nombre);
        System.out.println("Tienes " + edad + " años.");
        System.out.println("Pesas " + peso + " kg.");
        System.out.println("Estás estudiando: " + estudiando);

        scanner.close();
    }
}
8. Ventajas y desventajas de Scanner
Ventajas:

Sencillo y fácil de usar.
Compatible con diversas fuentes de entrada.
Bien documentado.
Desventajas:

Puede generar problemas al mezclar tipos de datos sin limpiar el buffer.
No es seguro en aplicaciones multihilo.

