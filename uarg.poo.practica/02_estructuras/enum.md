<p align="center">
  <img width="792" alt="image" src="https://github.com/user-attachments/assets/bf72f843-1d0b-4d3a-b7c8-824be47a0780"/>
</p>

# Enum en Java

Un `enum` (abreviatura de enumeración) en Java es un tipo especial de clase que representa un grupo de constantes predefinidas. Estas constantes son inmutables y están relacionadas entre sí, lo que hace que un `enum` sea útil para representar valores fijos como días de la semana, estados de un sistema, tipos de documentos, etc.

## Características principales de `enum`
- **Valores constantes**: Los valores definidos en un `enum` son constantes, lo que significa que no pueden cambiar.
- **Fuertemente tipado**: Solo puedes usar los valores definidos en el `enum` y no otros.
- **Comparable**: Los valores de un `enum` tienen un orden implícito según el cual son declarados.
- **Métodos adicionales**: Puedes agregar métodos, campos y constructores personalizados al `enum`.

---

## 1. Declaración básica
Un `enum` se declara con la palabra clave `enum`.

```java
public enum Dia {
    LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO
}
```
### Uso básico del enum:

```java
public class TestEnum {
    public static void main(String[] args) {
        Dia diaActual = Dia.MIERCOLES;

        // Comparar con un valor del enum
        if (diaActual == Dia.MIERCOLES) {
            System.out.println("Es miércoles");
        }

        // Recorrer todos los valores del enum
        for (Dia dia : Dia.values()) {
            System.out.println(dia);
        }
    }
}
```
### Salida:
```java
Es miércoles
LUNES
MARTES
MIERCOLES
JUEVES
VIERNES
SABADO
DOMINGO
```
## 2. Métodos Útiles en enum:

Los enum vienen con métodos predefinidos:

values()
Devuelve un arreglo con todos los valores del enum.
```java
for (Dia dia : Dia.values()) {
    System.out.println(dia);
}
```

ordinal()
Devuelve el índice (basado en cero) de cada constante en el enum.
```java
System.out.println(Dia.LUNES.ordinal()); // 0
System.out.println(Dia.MIERCOLES.ordinal()); // 2

```
name()
Devuelve el nombre del valor como un String.

```java
System.out.println(Dia.LUNES.name()); // "LUNES"

```
valueOf(String)
Convierte una cadena en un valor del enum.
```java
Dia dia = Dia.valueOf("VIERNES");
System.out.println(dia); // VIERNES

```
## 3. Agregar campos y métodos al enum 
Un enum puede tener variables, constructores y métodos personalizados.
Esto lo hace más potente para representar información adicional asociada a cada constante.

Ejemplo: Días de la semana con descripción
```java
public enum Dia {
    LUNES("Inicio de semana"),
    MARTES("Segundo día"),
    MIERCOLES("Mitad de semana"),
    JUEVES("Cerca del viernes"),
    VIERNES("Fin de semana laboral"),
    SABADO("Día de descanso"),
    DOMINGO("Día familiar");

    private final String descripcion;

    // Constructor del enum
    Dia(String descripcion) {
        this.descripcion = descripcion;
    }

    // Método para obtener la descripción
    public String getDescripcion() {
        return descripcion;
    }
}

```
Uso:

```java
public class TestEnum {
    public static void main(String[] args) {
        Dia dia = Dia.LUNES;
        System.out.println(dia + ": " + dia.getDescripcion());

        for (Dia d : Dia.values()) {
            System.out.println(d + ": " + d.getDescripcion());
        }
    }
}
```
Salida:
```java
LUNES: Inicio de semana
MARTES: Segundo día
MIERCOLES: Mitad de semana
JUEVES: Cerca del viernes
VIERNES: Fin de semana laboral
SABADO: Día de descanso
DOMINGO: Día familiar
```

