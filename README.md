# Constructor Max Points App

## Descripción

Esta aplicación es una aplicación de escritorio desarrollada en JavaFX que muestra los nombres de los constructores y sus puntos totales en un `TableView`. Los datos se obtienen de una base de datos PostgreSQL utilizando la clase `QueryRepositories`.

## Funcionalidades

- Conexión a una base de datos PostgreSQL.
- Ejecución de una consulta SQL para obtener los 10 constructores con más puntos.
- Visualización de los resultados en un `TableView` con dos columnas: nombre del constructor y total de puntos.

## Requisitos

- JDK 11 o superior.
- JavaFX 11 o superior.
- PostgreSQL JDBC Driver.
- Base de datos PostgreSQL en funcionamiento con la estructura y datos necesarios.

## Instalación

1. **Clonar el repositorio:**

    ```bash
    git clone https://github.com/tuusuario/ConstructorMaxPointsApp.git
    cd ConstructorMaxPointsApp
    ```

2. **Configurar la base de datos:**

    Asegúrate de que la base de datos PostgreSQL esté en funcionamiento y tenga la estructura adecuada. Actualiza las credenciales de la base de datos en la clase `QueryRepositories` si es necesario.

    ```java
    // Clase QueryRepositories
    String jdbcURL = "jdbc:postgresql://localhost:5432/Formula1N";
    String username = "postgres";
    String password = "admi123";
    ```

## Uso

1. **Ejecutar la aplicación:**

    Puedes ejecutar la aplicación desde tu IDE preferido (IntelliJ, Eclipse, etc.) asegurándote de que la clase `Main` sea la clase principal.

    ```java
    public static void main(String[] args) {
        launch(args);
    }
    ```

2. **Visualizar los resultados:**

    Al ejecutar la aplicación, se abrirá una ventana de JavaFX que mostrará un `TableView` con los nombres de los constructores y sus puntos totales, obtenidos de la base de datos.

## Imagen de la ejecución de la app

![Screenshot](https://github.com/MaRl0N4/ConstructoresMaxPoints/blob/931f231baa0e9afc40d9094f952c30b51792b504/Captura%20de%20pantalla%20(494).png)

## Estructura del Proyecto

- `application.Main`: Clase principal de la aplicación JavaFX.
- `Models.ConstructorMaxPoint`: Clase modelo para representar los datos de los constructores.
- `Repositories.QueryRepositories`: Clase para manejar las consultas a la base de datos.

## Contribución

Si deseas contribuir a este proyecto, por favor, sigue los pasos a continuación:

1. **Fork** este repositorio.
2. **Crea** una rama para tu característica (`git checkout -b feature/AmazingFeature`).
3. **Commit** tus cambios (`git commit -m 'Add some AmazingFeature'`).
4. **Push** a la rama (`git push origin feature/AmazingFeature`).
5. Abre un **Pull Request**.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Consulta el archivo `LICENSE` para más detalles.
