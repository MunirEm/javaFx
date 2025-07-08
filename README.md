# 🧠 Test de Compatibilidad Personal (JavaFX)

Este proyecto es una aplicación de escritorio creada con JavaFX que permite comparar la compatibilidad emocional y de personalidad entre dos personas. Se utiliza una interfaz gráfica intuitiva y personalizable para evaluar y visualizar el grado de compatibilidad a través de sliders, spinners y etiquetas dinámicas.

## 🚀 Características

- Comparación de **4 dimensiones emocionales** y **4 dimensiones de personalidad** entre dos personas.
- Cálculo automático de:
  - Porcentaje de **compatibilidad emocional**
  - Porcentaje de **compatibilidad en personalidad**
  - Porcentaje de **compatibilidad total**
- Selección de rol de usuario: `Profesorado` o `Alumnado`, lo cual modifica los textos mediante `ResourceBundle`.
- Interfaz diseñada en **FXML** para una estructura clara y mantenible.
- Registro de eventos y cálculos mediante `java.util.logging` en un archivo `test.log`.

## 🛠 Tecnologías usadas

- Java 17+
- JavaFX 17+
- FXML
- SceneBuilder (opcional para diseño visual)
- `java.util.logging` para logs
- Maven o Java SE (sin dependencias externas)

## 📦 Estructura del proyecto

src/

└── application/

├── Controller.java

├── Main.java

├── interfaz.fxml

└── resources/

├── alumnos.properties

├── profesores.properties



## 🧪 Cómo ejecutar el proyecto

### Opción 1: Desde un IDE (Eclipse / IntelliJ)

1. Clona el repositorio o descarga el ZIP.
2. Abre el proyecto en tu IDE favorito.
3. Asegúrate de tener configurado JavaFX en las librerías del proyecto.
4. Ejecuta la clase `Main.java`.

### Opción 2: Desde terminal

```bash
javac --module-path /ruta/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -d out src/application/*.java
java --module-path /ruta/javafx-sdk/lib --add-modules javafx.controls,javafx.fxml -cp out application.Main
Reemplaza /ruta/javafx-sdk/lib por la ruta real de tu SDK de JavaFX.

bash

📋 Recursos de idioma (ResourceBundle)
El contenido textual de la aplicación se puede cambiar dinámicamente al seleccionar Profesorado o Alumnado. Esto recarga la interfaz con los textos definidos en:

resources/alumnos.properties

resources/profesores.properties

🧹 Funcionalidades de botones
Calcular Personalidad: calcula la diferencia entre valores de personalidad y muestra el porcentaje.

Calcular Emocional: calcula la diferencia entre valores emocionales y muestra el porcentaje.

Calcular Total: promedia ambos cálculos.

Limpiar: reinicia todos los valores a 1 y sliders al 50%.

Usuario: cambia entre modo Alumnado y Profesorado.

📂 Logs
Todos los eventos importantes como cálculos y errores se registran en:



logs/test.log


👨‍💻 Autor
Munir El Moussaoui
📧 mounircorreos@gmail.com
