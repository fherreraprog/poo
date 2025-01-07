<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>

# Estructura básica de `switch` en Java y sus actualizaciones

La estructura `switch` en Java es una herramienta fundamental para realizar selecciones múltiples de manera sencilla y legible. Con el tiempo, Java ha mejorado esta estructura, introduciendo nuevas funcionalidades que la hacen más poderosa y flexible.

---

## **1. Estructura básica de `switch`**

El `switch` evalúa una expresión y ejecuta el bloque de código correspondiente al caso que coincida.

### Ejemplo:
```java
public class EjemploSwitch {
    public static void main(String[] args) {
        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Día no válido");
        }
    }
}
```

case: Define cada posible valor que la expresión puede tomar.

break: Evita que se ejecuten los casos siguientes (salida del switch).

default: Caso por defecto si ninguno de los valores coincide.

## **2. Mejoras en el switch con Java 7**

A partir de Java 7, se introdujeron cadenas (String) como expresión en switch.

Ejemplo:
```java
public class EjemploSwitchString {
    public static void main(String[] args) {
        String dia = "martes";

        switch (dia.toLowerCase()) {
            case "lunes":
                System.out.println("Inicio de semana");
                break;
            case "martes":
                System.out.println("Segundo día");
                break;
            default:
                System.out.println("Día no reconocido");
        }
    }
}
```

## **3 Novedades modernas (a partir de Java 12 y 17)**
### a) Expresiones switch
El switch ahora puede devolver un valor, convirtiéndose en una expresión (no solo en una estructura de control). Esto elimina la necesidad de usar múltiples break y hace el código más limpio.

```java
String resultado = switch (dia) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    default -> "Día no válido";
};
System.out.println(resultado);
```
Características de las expresiones switch:

Operador ->: Define las acciones directamente, sin necesidad de break.

Valor por defecto: Es obligatorio si no se cubren todos los casos posibles.

Devuelve un valor: Puedes asignar el resultado directamente a una variable.

### b) Compatibilidad con múltiples valores
Un solo case puede manejar varios valores utilizando comas.

```java
String tipoDeDia = switch (dia) {
    case 1, 2, 3, 4, 5 -> "Día laborable";
    case 6, 7 -> "Fin de semana";
    default -> "Día no válido";
};

System.out.println(tipoDeDia);
```
En este caso:

Los días del 1 al 5 se agrupan como "Día laborable".

Los días 6 y 7 se agrupan como "Fin de semana".

### c) Uso de bloques con yield
Cuando necesitas realizar operaciones más complejas en un caso, puedes usar un bloque de código y devolver un valor con yield.

```java

String mensaje = switch (dia) {
    case 1, 2, 3, 4, 5 -> "Día laborable";
    case 6, 7 -> {
        System.out.println("Es fin de semana");
        yield "Tiempo para descansar";
    }
    default -> "Día no válido";
};

System.out.println(mensaje);
```
Explicación:

Dentro de un bloque ({}), se puede realizar más de una operación.

yield: Devuelve un valor para el switch cuando se usa un bloque.

## **4. Comparativa entre `switch` clásico y moderno**

| Característica              | Clásico                     | Moderno (Java 12+)         |
|-----------------------------|-----------------------------|-----------------------------|
| Sintaxis                   | `case:` con `break`         | `case ->` con expresiones  |
| Devolución de valores      | No                          | Con `yield`                |
| Tipos soportados           | Números, caracteres         | Cadenas, números, etc.     |
| Múltiples etiquetas por caso | No                          | Sí                        |



