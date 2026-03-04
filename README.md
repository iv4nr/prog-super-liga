[Sistema_Gestion_Superliga_Futbol.md](https://github.com/user-attachments/files/25735896/Sistema_Gestion_Superliga_Futbol.md)
# ⚽ Sistema de Gestión -- Superliga de Fútbol

## 🎯 Objetivo

Aplicar de forma autónoma el patrón trabajado en clase utilizando:

-   Clases y objetos\
-   Composición\
-   Arrays unidimensionales de tamaño fijo\
-   Métodos bien estructurados\
-   Javadoc correcto\
-   Código limpio y ordenado

> Este ejercicio tiene exactamente la misma estructura técnica que el
> examen.

------------------------------------------------------------------------

## 📖 Escenario

Una Superliga de fútbol gestiona un máximo de **18 equipos inscritos**
en la competición.

Cada equipo está identificado mediante un **codigo único** y dispone de
la siguiente información:

-   codigo (int)\
-   nombre (String)\
-   pais (String)\
-   puntos (int)

El sistema debe permitir registrar equipos, buscarlos, mostrarlos y
contar cuántos están actualmente inscritos en la liga.

Recuerda crear los commits adecuados según vas desarrollando la
solución.

------------------------------------------------------------------------

## 🧩 Requisitos técnicos

### 1️⃣ Clase `Equipo`

Debe incluir:

-   Atributos privados.\
-   Constructor completo.\
-   Métodos getters.\
-   Método `toString()`.\
-   Javadoc en:
    -   Clase\
    -   Constructor\
    -   Métodos públicos

------------------------------------------------------------------------

### 2️⃣ Clase `Superliga`

#### Atributos

``` java
private Equipo[] equipos;
private final int NUM_MAX_EQUIPOS;
```

#### Constructor

-   Asegúrate de que el número máximo de equipos recibido sea positivo.

------------------------------------------------------------------------

## 🔧 Métodos obligatorios

``` java
public Equipo buscarEquipo(int codigo)
private int buscarPrimerHuecoLibre()
public boolean registrarEquipo(Equipo equipo)
public String mostrarEquipos()
public int contarEquipos()
```

------------------------------------------------------------------------

## 🔍 Comportamiento esperado

### `buscarEquipo(int codigo)`

-   Devuelve el equipo con ese código.\
-   Devuelve `null` si no existe.

### `buscarPrimerHuecoLibre()`

-   Devuelve la primera posición `null`.\
-   Devuelve `-1` si el array está completo.

### `registrarEquipo(Equipo equipo)`

-   Solo añade si no existe otro con el mismo código.\
-   Solo añade si hay hueco disponible.\
-   Devuelve `true` si se añade.\
-   Devuelve `false` si no puede añadirse.

### `mostrarEquipos()`

-   Devuelve el listado de equipos con su información.

### `contarEquipos()`

-   Devuelve el número real de equipos almacenados.

------------------------------------------------------------------------

## 🖥 Clase `Main`

Debe:

-   Crear una `Superliga` con capacidad para 18 equipos.\
-   Registrar al menos 3 equipos.\
-   Mostrar los equipos registrados.\
-   Mostrar el total almacenado.\
-   Probar una búsqueda existente y otra inexistente.

------------------------------------------------------------------------

## 📊 Criterios de evaluación

  Criterio                              Peso
  ------------------------------------- ------
  Diseño correcto de clases             20%
  Encapsulación adecuada                10%
  Uso correcto del array fijo           20%
  Método registrarEquipo correcto       15%
  Recorrido y visualización correctos   10%
  Conteo correcto                       10%
  Javadoc adecuado                      10%
  Orden y claridad del código           5%

------------------------------------------------------------------------

## ⚠️ Errores frecuentes a evitar

-   No inicializar el array en el constructor.\
-   Usar `ArrayList`.\
-   No comprobar `null` antes de acceder a un objeto.\
-   Sobrescribir posiciones ocupadas.\
-   No devolver `false` cuando el array está lleno.\
-   No documentar correctamente.\
-   Hacer atributos públicos.

------------------------------------------------------------------------

## 📌 Entrega

-   Proyecto completo.\
-   Código funcional.\
-   Compila sin errores.\
-   Nombres claros y coherentes.

------------------------------------------------------------------------

## 💬 Importante

Si eres capaz de resolver correctamente este ejercicio, estás preparado
para el examen.
