# Programación Orientada a Objetos - Ejercitaciones 2.1 y 2.2

Este repositorio contiene la resolución integral de las guías prácticas para la materia **Programación Orientada a Objetos en Java**.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete, permitiendo compilar, ejecutar y testear las consignas de forma aislada. Además, se incluye un **Menú Interactivo de Consola (`Main.java`)** para ejecutar cualquier ejercicio de forma rápida y cómoda desde un solo lugar.  

---

## 📂 Estructura del Proyecto

```text
poo-ejercitaciones/
└── src/
    ├── Main.java                 
    ├── ejercitacion2_1/
    │   ├── ejercicio01/ (Persona)
    │   ├── ejercicio02/ (Mascota)
    │   ├── ejercicio03/ (Auto)
    │   ├── ejercicio04/ (Calculadora)
    │   ├── ejercicio05/ (Contador)
    │   ├── ejercicio06/ (Libro)
    │   ├── ejercicio07/ (CuentaBancaria)
    │   ├── ejercicio08/ (Estudiante - ArrayList)
    │   ├── ejercicio09/ (Asociación Producto y Carrito)
    │   └── ejercicio10/ (Personaje - Combate)
    └── ejercitacion2_2/
        ├── ejercicio01/ (ArticuloGeek)
        ├── ejercicio02/ (Videojuego)
        ├── ejercicio03/ (ConsolaRetro)
        ├── ejercicio04/ (CajaRegistradora)
        ├── ejercicio05/ (SocioGeek - Encapsulamiento)
        ├── ejercicio06/ (Comic - Invariantes)
        ├── ejercicio07/ (CalculadoraPromocion - Sobrecarga)
        ├── ejercicio08/ (MangaVolume - toString y helpers)
        ├── ejercicio09/ (GiftCard y Cliente - Paso de mensajes)
        └── ejercicio10/ (ColeccionLote - Agregación)
```

---

## Requisitos

* **Java Development Kit (JDK):** Versión 17 o superior (LTS recomendada).
* **IDE recomendado:** Visual Studio Code, IntelliJ IDEA, Eclipse o NetBeans.

---

## Compilación y Ejecución

### Opción 1: Menú Interactivo de Consola (¡Recomendado!)

Para evaluar o navegar por cualquier ejercicio de forma rápida sin tener que abrirlos individualmente:

**Desde la Terminal:**
```bash
# 1. Compilar todo el proyecto
javac -d bin (Get-ChildItem -Recurse -Filter *.java src).FullName   # PowerShell
# o en bash / zsh:
# javac -d bin $(find src -name "*.java")

# 2. Ejecutar el menú principal
java -cp bin Main
```

**Desde cualquier IDE:**
Simplemente abrir y ejecutar la clase `src/Main.java`.

---

### Opción 2: Ejecutar un Ejercicio Individual

Si se prefiere probar un ejercicio específico de forma aislada:

* **Desde el IDE:** Navegar a la clase deseada dentro de `src/ejercitacionX_X/ejercicioXX/` y ejecutar su método `main`.
* **Desde la Terminal:**
  ```bash
  # 1. Compilar la clase deseada (ejemplo: Mascota)
  javac -d bin src/ejercitacion2_1/ejercicio02/Mascota.java

  # 2. Ejecutar la clase compilada indicando su paquete completo
  java -cp bin ejercitacion2_1.ejercicio02.Mascota
  ```

---

> *"«No todos los que vagan están perdidos... pero los que no compilaron antes de entregar, probablemente sí.»"* 🗡️
