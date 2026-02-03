<p align="center">
  <img width="2000px" height="1650px" alt="image" src="https://github.com/user-attachments/assets/1e5523d3-8ece-4319-a820-7c11f21f68e4" style="max-width: 100%; height: auto; max-height: 1650px;"/>
</p>

# 📌 Guía de Commits

En esta materia **el uso correcto de commits es obligatorio** y forma parte de las buenas prácticas de desarrollo profesional.

Un commit **no es solo “guardar”**, sino una unidad de trabajo que comunica:
- qué se hizo
- por qué se hizo
- y en qué estado queda el código

Esta guía unifica el criterio de commits para **todos los alumnos**, independientemente del año o del lenguaje usado.

---

## 🧱 Formato obligatorio del mensaje de commit

Todos los commits deben respetar la siguiente estructura:

✔ Usar **modo imperativo**  
✔ Usar **frases claras y concisas**  
✔ Un commit = un cambio lógico

Ejemplo correcto:

feat: agregar clase Persona con constructor y getters


Ejemplos incorrectos:

subo cosas

update

arreglos varios

final


---

## 🧩 Tipos de commits permitidos

| Tipo | Uso |
|----|----|
| `feat:` | Nueva funcionalidad, clase, método o archivo |
| `fix:` | Corrección de un error |
| `refactor:` | Mejora del código sin cambiar su comportamiento |
| `docs:` | Comentarios, README u otra documentación |
| `style:` | Cambios de formato (indentación, nombres, orden) |
| `test:` | Pruebas, casos de ejemplo |
| `chore:` | Configuración, archivos auxiliares (.gitignore, etc.) |

### Ejemplos

feat: implementar método calcularPromedio()

fix: corregir error en validación de notas

refactor: separar lógica de negocio de la interfaz

docs: documentar clase Alumno



---

## 🎯 Commits especiales para pedir feedback del docente

Cuando un alumno **necesite que el docente revise algo en particular**, debe indicarlo explícitamente usando la etiqueta:

[revisar]


### 📌 Formato

tipo[revisar]: descripción clara del problema o duda

### 📘 Ejemplos válidos

feat[revisar]: no estoy seguro si este diseño respeta encapsulamiento

fix[revisar]: corregí el error pero no entiendo por qué ocurría

revisar: duda sobre uso de herencia en esta clase


📌 Estos commits **facilitan el feedback** dentro de GitHub Classroom y serán tenidos en cuenta especialmente durante la corrección.

---

## 🔍 Pedir revisión dentro del código

Además del commit, se puede marcar directamente el código usando comentarios especiales:

### Java
```java
// @revisar: no estoy seguro si este método debería ser abstracto
```

Esto permite al docente encontrar rápidamente la duda al revisar el repositorio.


🧠 Buenas prácticas esperadas

✔ Commits pequeños y frecuentes

✔ Mensajes claros y profesionales

✔ No mezclar cambios sin relación

✔ No subir todo el TP en un solo commit


❌ Evitar commits genéricos

❌ Evitar mensajes ambiguos

❌ Evitar “commit final” o “versión definitiva”



🎓 El uso correcto de commits forma parte del aprendizaje de la materia, al mismo nivel que:


el diseño orientado a objetos


la correcta implementación


la claridad del código


👉 Un buen historial de commits demuestra proceso, criterio y comprensión, no solo resultado final.

