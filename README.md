# Proyecto: Tarea Online 3 🏛️

Este repositorio contiene la solución a la **Tarea Online 3**, que incluye la creación de programas relacionados con la gestión de información sobre monumentos. Los ejercicios están diseñados para practicar el manejo de objetos, captura de datos desde consola, manejo de excepciones y métodos estáticos.

---

## Ejercicios Incluidos ✨

### 1. Captura de Datos de un Monumento 🏰
- El programa permite al usuario ingresar datos de un monumento:
  - **Nombre**
  - **Ubicación**
  - **Año de Construcción**
- Se utiliza `Scanner` para capturar la entrada del usuario.
- Se manejan excepciones como `InputMismatchException` para garantizar que los datos ingresados sean del tipo correcto.

### 2. Mostrar Ubicación del Monumento 📍
- Muestra en consola la ubicación del monumento ingresado por el usuario.

### 3. Comparación de Objetos Monumento ⚖️
- Se crea otro objeto de la clase `Monumento` para compararlo con el primero.
- Se utiliza el método `equals` para determinar si los dos objetos son iguales.
- El programa imprime un mensaje indicando si son iguales y explica la razón basada en sus atributos.

### 4. Verificación de Horarios de Visita 🕒
- Implementa un método estático `mostrarHorarioVisita()` para verificar si un monumento está abierto.
- Adicionalmente, el programa calcula cuántas horas y minutos quedan hasta el cierre del monumento.
