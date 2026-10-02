# Programación Orientada a Objetos - Ejercitaciones 2.1 y 2.2

Este repositorio contiene la resolución integral de las guías prácticas para la materia **Programación Orientada a Objetos en Java**.

Cada ejercicio está modularizado de forma independiente dentro de su propio paquete, aplicando principios de encapsulamiento, abstracción y asociación. Además, se incluye un **Menú Interactivo de Consola (`Main.java`)** para compilar y ejecutar cualquier consigna cómodamente.

---

## 📂 Índice de Ejercicios Resueltos

###  Ejercitación 2.E.1: Fundamentos de POO, Encapsulamiento y Asociación

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| :--- | :--- | :--- |
| **01. Persona** | [`Persona.java`](src/ejercitacion2_1/ejercicio01/Persona.java) | Modelado básico de clase con atributos `nombre` y `edad`, instanciación en Heap y acceso directo. |
| **02. Mascota** | [`Mascota.java`](src/ejercitacion2_1/ejercicio02/Mascota.java) | Parametrización mediante constructor explícito con la referencia `this` e impresión formateada. |
| **03. Auto** | [`Auto.java`](src/ejercitacion2_1/ejercicio03/Auto.java) | Control de transición de estados de un objeto (`encender()`, `apagar()`, `mostrarEstado()`). |
| **04. Calculadora** | [`Calculadora.java`](src/ejercitacion2_1/ejercicio04/Calculadora.java) | Métodos operacionales con retorno `double` y validación defensiva ante división por cero. |
| **05. Contador** | [`Contador.java`](src/ejercitacion2_1/ejercicio05/Contador.java) | Control de límites internos, constructores sobrecargados y prevención de valores negativos. |
| **06. Libro** | [`Libro.java`](src/ejercitacion2_1/ejercicio06/Libro.java) | Atributos numéricos interrelacionados, avance de lectura y cálculo de porcentaje con casting a `double`. |
| **07. CuentaBancaria** | [`CuentaBancaria.java`](src/ejercitacion2_1/ejercicio07/CuentaBancaria.java) | Encapsulamiento riguroso (`private`), getters/setters y operaciones de depósito/retiro con validación. |
| **08. Estudiante** | [`Estudiante.java`](src/ejercitacion2_1/ejercicio08/Estudiante.java) | Uso de `ArrayList<Double>` para almacenar notas, cálculo de promedio y condición de aprobación. |
| **09. Carrito de Compras** | [`CarritoDeCompras.java`](src/ejercitacion2_1/ejercicio09/CarritoDeCompras.java) | Asociación entre clases administrando una lista de objetos `Producto` y cálculo acumulado. |
| **10. Personaje** | [`Personaje.java`](src/ejercitacion2_1/ejercicio10/Personaje.java) | Interacción entre objetos mediante paso de referencias por parámetro y simulación de combate por turnos. |

---

###  Ejercitación 2.E.2: Ocultamiento, Sobrecarga y Agregación

| Ejercicio | Archivo Principal | Descripción & Lógica Aplicada |
| :--- | :--- | :--- |
| **01. ArticuloGeek** | [`ArticuloGeek.java`](src/ejercitacion2_2/ejercicio01/ArticuloGeek.java) | Modelado básico de artículo geek con atributos protegidos mediante encapsulamiento (`private`). |
| **02. Videojuego** | [`Videojuego.java`](src/ejercitacion2_2/ejercicio02/Videojuego.java) | Inicialización parametrizada con constructor y representación estructurada con `String.format()`. |
| **03. ConsolaRetro** | [`ConsolaRetro.java`](src/ejercitacion2_2/ejercicio03/ConsolaRetro.java) | Gestión de estado operativo de consola y simulación de ciclo de vida encendido/apagado. |
| **04. CajaRegistradora** | [`CajaRegistradora.java`](src/ejercitacion2_2/ejercicio04/CajaRegistradora.java) | Acumulación de ventas, conteo de transacciones y cálculo del promedio protegiendo división por cero. |
| **05. SocioGeek** | [`SocioGeek.java`](src/ejercitacion2_2/ejercicio05/SocioGeek.java) | Ocultamiento de datos (*information hiding*) y validación defensiva en setter de puntos de fidelidad. |
| **06. Comic** | [`Comic.java`](src/ejercitacion2_2/ejercicio06/Comic.java) | Garantía de invariantes restringiendo setters indiscriminados y operando mediante métodos de negocio. |
| **07. CalculadoraPromocion** | [`CalculadoraPromocion.java`](src/ejercitacion2_2/ejercicio07/CalculadoraPromocion.java) | Sobrecarga de métodos (*Overloading*) para calcular precio con descuento base, porcentaje especial o cupón fijo. |
| **08. MangaVolume** | [`MangaVolume.java`](src/ejercitacion2_2/ejercicio08/MangaVolume.java) | Sobrescritura de `toString()` y uso de métodos de apoyo privados (*helper methods*) como `esTomoExtenso()`. |
| **09. GiftCard y Cliente** | [`Cliente.java`](src/ejercitacion2_2/ejercicio09/Cliente.java) | Interacción por paso de mensajes enviando `descontarSaldo()` desde `Cliente` a su `GiftCard`. |
| **10. ColeccionLote** | [`ColeccionLote.java`](src/ejercitacion2_2/ejercicio10/ColeccionLote.java) | Agregación de objetos `ArticuloGeek` en un lote para cálculo de valor total sumado y desglose en consola. |

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
Simplemente abrir y ejecutar la clase [`src/Main.java`](src/Main.java).

---

### Opción 2: Ejecutar un Ejercicio Individual

Si se prefiere probar un ejercicio específico de forma aislada:

* **Desde el IDE:** Navegar a la clase deseada en la tabla del índice y ejecutar su método `main`.
* **Desde la Terminal:**
  ```bash
  # 1. Compilar la clase deseada (ejemplo: Mascota)
  javac -d bin src/ejercitacion2_1/ejercicio02/Mascota.java

  # 2. Ejecutar la clase compilada indicando su paquete completo
  java -cp bin ejercitacion2_1.ejercicio02.Mascota
  ```

---

## Requisitos
* **Java Development Kit (JDK):** Versión 17 o superior.
* **IDE recomendado:** Visual Studio Code, IntelliJ IDEA, Eclipse o NetBeans.

---

> *"«No todos los que vagan están perdidos... pero los que no compilaron antes de entregar, probablemente sí.»"* 🗡️
