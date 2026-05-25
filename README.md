# Proxecto Final - CONTORNOS DE DESENVOLVEMENTO (Curso 25-26)
**Alumno:** Israel Pérez Lorenzo

### 1. Instalación de IDE
Instalación del IDE Antigravity en el sistema operativo.

### 2. Personalización de IDE
Instalación de extensiones opcionales.

### 3. Configura entorno VUE
Creación y lanzamiento del proyecto por defecto (un contador que empieza en cero y cuenta los clics).

### 4. Elabora un pequeno plan de probas
* **Diseño:** Límite inferior 0, Límite superior 10.
* **Clases de equivalencia:**
  * Clase válida (rango normal): Valores entre 1-9 deberían de funcionar correctamente restando o sumando 1.
  * Clase inválida inferior: Al intentar restar desde 0 el contador debería no hacer nada (bloquearse).
  * Clase inválida superior: Al intentar sumar desde 10 el contador debería bloquearse.
* **Casos de prueba:**
  * **CP-01 (límite inferior exacto):** Empezando en 0, hacer resta "-". Resultado esperado: el contador no debería bajar.
  * **CP-02 (encima del límite inferior):** Empezando en 0 y sumando "+". Resultado esperado: el contador debería de subir a "1".
  * **CP-03 (valor normal):** Contador en 5, primero sumando y luego restando. Resultado esperado: el contador debería subir a 6 y bajar a 5.
  * **CP-04 (bajo el límite superior):** Empezando en 10 y restando. Resultado esperado: el contador cambia a 9.
  * **CP-05 (límite superior exacto):** Contador en 10 y sumando. Resultado esperado: el contador se mantiene en 10.

### 5. Fai unha análise de código estático
Ejemplo de análisis de código utilizando la herramienta ESLint para JavaScript/Vue.

### 6. Fai unha refactorización
Refactorizado empleando el uso de funciones específicas para evitar redundancia de código y simplificando.

### 7. Elabora un diagrama UML
Diagrama de clases generado para el componente:

```mermaid
classDiagram
    class ContadorVue {
        +Number contador
        +aumentarContador()
        +diminuirContador()
    }
