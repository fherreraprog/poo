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
