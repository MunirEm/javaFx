package application;
	
import java.io.IOException;
import java.util.ResourceBundle;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;



public class Main extends Application {
	
	public static final Logger LOGGER = Logger.getLogger(Main.class.getName());
	@Override
	public void start(Stage primaryStage) {
		try {
			configurarLogger();
			ResourceBundle bundle = ResourceBundle.getBundle("resources.alumnos"); 
			  FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/interfaz.fxml"), 
			bundle); 



			Parent root = loader.load();
			Scene scene = new Scene(root);
		
			primaryStage.setTitle("Test de compatibilidad perosonal");
			primaryStage.setScene(scene);
			primaryStage.show();
			primaryStage.setResizable(false);
			LOGGER.info("Aplicaci�n iniciada correctamente.");
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	
	private void configurarLogger() {
		Logger rootLogger = Logger.getLogger("");
		rootLogger.setUseParentHandlers(false); // Desactivar los handlers por defecto

		try {
			FileHandler fileHandler = new FileHandler("logs/test.log", true); // 'true' para append
			fileHandler.setFormatter(new SimpleFormatter());
			rootLogger.addHandler(fileHandler);

			// Desactivar el ConsoleHandler si existe
			for (java.util.logging.Handler handler : rootLogger.getHandlers()) {
				if (handler instanceof java.util.logging.ConsoleHandler) {
					rootLogger.removeHandler(handler);
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
