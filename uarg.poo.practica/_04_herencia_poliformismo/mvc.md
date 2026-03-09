# Arquitectura MVC en Programación Orientada a Objetos

## 📌 Contexto de la materia

En la materia **Programación Orientada a Objetos**, trabajamos no solo con clases, objetos, herencia y polimorfismo, sino también con **buenas prácticas de diseño**.

Uno de los objetivos centrales del cual venimos hablando de la materia anterior es **separar responsabilidades**, evitando programas monolíticos donde:
- todo se resuelve en `main`
- las clases imprimen por consola / terminal
- la lógica de negocio se mezcla con la interacción con el usuario

Para eso, utilizamos el **patrón de arquitectura MVC (Model–View–Controller)**.

---

## 🧱 ¿Qué es MVC?

MVC es un patrón de diseño que divide una aplicación en tres capas bien definidas:

- **Modelo (Model)** → lógica de negocio y datos
- **Vista (View)** → interacción con el usuario
- **Controlador (Controller)** → coordinación entre vista y modelo

Cada capa tiene una **responsabilidad clara** y no debe invadir a las demás.

---

## 🟦 Modelo (Model)

El **modelo** representa el dominio del problema.

En nuestros proyectos:
- contiene las **clases principales**
- encapsula los **atributos y comportamientos**
- implementa la **lógica del negocio**
- **NO** conoce:
  - la consola
  - `Scanner`
  - menús
  - impresión por pantalla

### Ejemplos de responsabilidades del Modelo:
- Calcular precios
- Validar reglas del dominio
- Administrar colecciones internas
- Aplicar polimorfismo

📌 Regla clave:  
> El modelo debe poder funcionar aunque no exista ninguna vista.

---

## 🟨 Controlador (Controller)

El **controlador** actúa como intermediario entre la vista y el modelo.

Sus funciones principales son:
- recibir solicitudes desde la vista
- invocar métodos del modelo
- devolver resultados (datos, mensajes, listas)

El controlador:
- **NO imprime**
- **NO pide datos por teclado**
- **NO contiene lógica de presentación**

📌 Regla clave:  
> La vista no accede directamente al modelo, siempre lo hace a través del controlador.

---

## 🟩 Vista (View)

La **vista** se encarga de la interacción con el usuario.

En nuestros trabajos prácticos, la vista suele ser:
- por consola (`Scanner`, `System.out`)
- con menús
- validando entradas básicas

La vista:
- muestra información
- solicita datos
- delega acciones al controlador
- **NO implementa lógica de negocio**

📌 Regla clave:  
> Si mañana cambiamos la consola por una interfaz gráfica, el modelo no debería modificarse.

---

## 🚀 Clase Main

La clase `Main` cumple el rol de **punto de arranque** de la aplicación.

Sus responsabilidades son:
- crear el modelo
- crear el controlador
- crear la vista
- iniciar la ejecución del programa

Ejemplo conceptual:
```java
Puerto puerto = new Puerto();
ControladorPuerto controlador = new ControladorPuerto(puerto);
VistaPuerto vista = new VistaPuerto(controlador);
vista.iniciar();
