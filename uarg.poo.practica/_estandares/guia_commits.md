<p align="center">
    <img alt="Guía de commits" src="https://github.com/user-attachments/assets/1e5523d3-8ece-4319-a820-7c11f21f68e4" style="max-width:100%; height:auto;" />
</p>

<h1 align="center">📌 Guía de Commits</h1>

---

## 📋 Introducción

En esta materia, **el uso correcto de commits es obligatorio** y forma parte de las buenas prácticas de desarrollo profesional.

Un commit **no es "guardar cambios"**.  
Un commit es una **unidad de trabajo** que comunica claramente:

- ✅ qué se hizo  
- ✅ por qué se hizo  
- ✅ en qué estado queda el código  

Esta guía define un **criterio único de commits** para todos los alumnos de la cátedra.

---

## 🧱 Formato obligatorio del mensaje de commit

Todos los commits **deben respetar esta estructura**:

- ✔ Modo **imperativo**  
- ✔ Mensajes **claros y concisos**  
- ✔ **Un commit = un cambio lógico**

### ✅ Ejemplo correcto

```text
feat: agregar clase Persona con constructor y getters
```

### ❌ Ejemplos incorrectos

```text
subo cosas
update
arreglos varios
final
```

---

## 🧩 Tipos de commits permitidos

| Tipo | Uso |
|-----|-----|
| `feat:` | Nueva funcionalidad, clase, método o archivo |
| `fix:` | Corrección de errores |
| `refactor:` | Mejora del código sin cambiar su comportamiento |
| `docs:` | Documentación (README, comentarios, etc.) |
| `style:` | Formato: indentación, nombres, orden |
| `test:` | Pruebas y casos de ejemplo |
| `chore:` | Configuración o archivos auxiliares |

### 📘 Ejemplos

```text
feat: implementar método calcularPromedio()
fix: corregir validación de notas
refactor: separar lógica de negocio de la interfaz
docs: documentar clase Alumno
```

---

## 🎯 Commits especiales para pedir feedback del docente

Cuando se necesite **revisión o feedback del docente**, debe indicarse explícitamente usando la etiqueta:

```text
[revisar]
```

### 📌 Formato

```text
tipo[revisar]: descripción clara de la duda o problema
```

### ✅ Ejemplos válidos

```text
feat[revisar]: no estoy seguro si este diseño respeta encapsulamiento
fix[revisar]: corregí el error pero no entiendo por qué ocurría
revisar: duda sobre uso de herencia en esta clase
```

📌 Estos commits **facilitan el feedback en GitHub Classroom** y serán considerados especialmente durante la corrección.

---

## 🔍 Pedir revisión directamente en el código

Además del commit, se pueden marcar dudas **dentro del código** usando comentarios especiales.

### ☕ Java

```java
// @revisar: no estoy seguro si este método debería ser abstracto
```

Esto permite localizar rápidamente el punto exacto a revisar.

---

## 🧠 Buenas prácticas esperadas

### ✅ Hacer

- Commits pequeños y frecuentes  
- Mensajes claros y profesionales  
- Cambios relacionados en un mismo commit  

### ❌ Evitar

- Commits genéricos  
- Mensajes ambiguos  
- Subir todo el trabajo en un solo commit  
- Usar “commit final” o “versión definitiva”

---

## 🎓 Consideraciones Finales

El uso correcto de commits **forma parte del aprendizaje**, al mismo nivel que:

- el diseño orientado a objetos  
- la correcta implementación  
- la claridad del código  

👉 **Un buen historial de commits demuestra proceso, criterio y comprensión**, no solo el resultado final.

---

## 📚 Recursos Adicionales

- [Conventional Commits](https://www.conventionalcommits.org/es/)


---
