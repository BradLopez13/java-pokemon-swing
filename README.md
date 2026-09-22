# java-pokemon-swing

Proyecto de clase del ciclo de DAM (2023): un juego de combate por turnos inspirado en Pokémon, con interfaz gráfica en Java Swing.

## Qué hace

Pantalla de inicio con música e instrucciones, pantalla de carga, elección entre cuatro Pokémon (Charizard, Blastoise, Venusaur y Pikachu) y combate contra un rival que contraataca con un ataque al azar.

## Cómo está hecho

- `Pokemon` es una clase abstracta; cada Pokémon la extiende e implementa la interfaz de su tipo (`TipoFuego`, `TipoAgua`, `TipoPlanta` o `TipoElectrico`).
- Los 16 ataques están en el enum `Ataque`, cada uno con su daño y su tipo.
- Cada pantalla es un `JFrame` en su propio paquete (`MenuInicio`, `Pantalla_de_carga`, `Pantalla_de_Eleccion`, `Pantalla_combate`), maquetado con MigLayout y JGoodies Forms.

## Cómo ejecutarlo

Requiere un JDK 8 o superior. Desde la raíz del repositorio, en Windows:

```bash
javac -cp "miglayout15-swing.jar;jgoodies-forms-1.8.0.jar" -d out -sourcepath src src/Juego/Main.java
java -cp "out;src;miglayout15-swing.jar;jgoodies-forms-1.8.0.jar" Juego.Main
```

En macOS o Linux, cambia `;` por `:` en el classpath.

## Limitaciones conocidas

- La lógica del combate vive dentro de las clases de interfaz, así que no se puede probar sin abrir ventanas.
- El tipo de cada Pokémon se deduce del nombre de su interfaz mediante reflexión y comparación de cadenas, en lugar de guardarlo como un campo.
- El fichero de la música de fondo no está en el repositorio.
