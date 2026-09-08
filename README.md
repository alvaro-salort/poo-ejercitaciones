# Programación Orientada a Objetos - Ejercitaciones 2.1 y 2.2


Este repositorio contiene la resolución integral de las guías prácticas para la materia **Programación Orientada a Objetos en Java**.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete, permitiendo compilar, ejecutar y testear las consignas de forma aislada sin dependencias externas ni configuraciones complejas.

---

## 📂 Estructura del Proyecto

```text
poo-ejercitaciones/
└── src/
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

No es necesario descargar librerías ni configurar gestores de dependencias adicionales; el proyecto utiliza Java estándar (Vanilla Java).

### Opción A: Desde cualquier IDE (Recomendado)
1. Abrir la carpeta raíz `poo-ejercitaciones` en el IDE.
2. Navegar hasta la clase deseada dentro de `src/ejercitacionX_X/ejercicioXX/`.
3. Hacer clic en el botón **Run / Ejecutar** en el método `main`.

### Opción B: Desde la Terminal
Posicionarse en la carpeta raíz del repositorio (`poo-ejercitaciones`):

```bash
# 1. Compilar el ejercicio que se desee probar (ejemplo: Mascota)
javac -d bin src/ejercitacion2_1/ejercicio02/Mascota.java

# 2. Ejecutar la clase compilada indicando su paquete completo
java -cp bin ejercitacion2_1.ejercicio02.Mascota
```


---

> *"«No todos los que vagan están perdidos... pero los que no compilan antes de entregar, probablemente sí.»"* 🗡️
