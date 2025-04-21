# Práctica de Algoritmos de Ordenamiento

## 📌 Información General

- **Título:** Búsqueda Binaria con Ordenamiento Burbuja
- **Asignatura:** Estructura de Datos
- **Carrera:** Computación
- **Estudiante:** Pedro Panjón
- **Fecha:** 20/04/2025
- **Profesor:** Ing. Pablo Torres

---

## 🛠️ Descripción

Este proyecto en Java permite registrar un listado de personas (nombre y edad), ordenarlas por edad utilizando el **método de burbuja**, y realizar una **búsqueda binaria recursiva** para encontrar la primera persona que coincida con una edad específica. El proceso muestra paso a paso la ejecución de la búsqueda, detallando los índices utilizados (`bajo`, `alto`, `centro`) y la decisión tomada en cada iteración (`DERECHA`, `IZQUIERDA`, `ENCONTRADO`). Toda la lógica está encapsulada en la clase `Persona`, manteniendo el método `main` limpio y organizado.

---

## 🚀 Ejecución

Para ejecutar el proyecto:

1. Compila el código:
    ```bash
    javac App.java Persona.java
    ```
2. Ejecuta la aplicación:
    ```bash
    java App
    ```

---

## 🧑‍💻 Ejemplo de Entrada y Salida

```plaintext
Ingrese Persona:
 Nombre: Pablo
 Edad: 4
...

4 | 5 | 8 | 9 | 12 | 18 | 25 | 40 | 60  
Valor la persona de la edad: 18  
bajo=0 alto=8 centro=4 valorCentro=12 --> DERECHA  
bajo=5 alto=8 centro=6 valorCentro=25 --> IZQUIERDA  
bajo=5 alto=5 centro=5 valorCentro=18 --> ENCONTRADO  
La persona con la edad 18 es Juan