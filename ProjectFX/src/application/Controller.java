package application;




import java.io.IOException;
import java.util.ResourceBundle;



import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class Controller {

    @FXML
    private Button bEmocional;

    @FXML
    private Button bLimpiar;

    @FXML
    private Button bPersonalidad;

    @FXML
    private Button bTotal;

    @FXML
    private ComboBox<String> cbUsuario;

    @FXML
    private Label lEmocional;

    @FXML
    private Label lPersona1;

    @FXML
    private Label lPersona2;

    @FXML
    private Label lPersonalidad;

    @FXML
    private Label lTitulo;

    @FXML
    private Label lTotal;

    @FXML
    private Slider sliderEmocional;

    @FXML
    private Slider sliderPersonalidad;

    @FXML
    private Slider sliderTotal;

    @FXML
    private Spinner<Integer> spEmocional1_1;

    @FXML
    private Spinner<Integer> spEmocional1_2;

    @FXML
    private Spinner<Integer> spEmocional1_3;

    @FXML
    private Spinner<Integer> spEmocional1_4;

    @FXML
    private Spinner<Integer> spEmocional2_1;

    @FXML
    private Spinner<Integer> spEmocional2_2;

    @FXML
    private Spinner<Integer> spEmocional2_3;

    @FXML
    private Spinner<Integer> spEmocional2_4;

    @FXML
    private Spinner<Integer> spPersonalidad1_1;

    @FXML
    private Spinner<Integer> spPersonalidad1_2;

    @FXML
    private Spinner<Integer> spPersonalidad1_3;

    @FXML
    private Spinner<Integer> spPersonalidad1_4;

    @FXML
    private Spinner<Integer> spPersonalidad2_1;

    @FXML
    private Spinner<Integer> spPersonalidad2_2;

    @FXML
    private Spinner<Integer> spPersonalidad2_3;

    @FXML
    private Spinner<Integer> spPersonalidad2_4;
    
    private double emocPorcent ;
    private double persoPorcent;
    
    private double totalPorcent;

    @FXML
    private void initialize() {
    	SpinnerValueFactory<Integer> valueFactory1 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory2 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory3 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);    	
    	SpinnerValueFactory<Integer> valueFactory4 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory5 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory6 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory7 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory8 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory9 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory10 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory11 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory12 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory13 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory14 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory15 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	SpinnerValueFactory<Integer> valueFactory16 = new SpinnerValueFactory.IntegerSpinnerValueFactory(1, 5, 1, 1);
    	
    	
    	
    	spPersonalidad1_1.setValueFactory(valueFactory1);
    	spPersonalidad1_2.setValueFactory(valueFactory2);
    	spPersonalidad1_3.setValueFactory(valueFactory3);
    	spPersonalidad1_4.setValueFactory(valueFactory4);
    	spPersonalidad2_1.setValueFactory(valueFactory5);
    	spPersonalidad2_2.setValueFactory(valueFactory6);
    	spPersonalidad2_3.setValueFactory(valueFactory7);
    	spPersonalidad2_4.setValueFactory(valueFactory8);
		spEmocional1_1.setValueFactory(valueFactory9);
		spEmocional1_2.setValueFactory(valueFactory10);
		spEmocional1_3.setValueFactory(valueFactory11);
		spEmocional1_4.setValueFactory(valueFactory12);
		spEmocional2_1.setValueFactory(valueFactory13);
		spEmocional2_2.setValueFactory(valueFactory14);
		spEmocional2_3.setValueFactory(valueFactory15);
		spEmocional2_4.setValueFactory(valueFactory16);
		
		cbUsuario.getItems().addAll("Profesorado", "Alumnado");
		cbUsuario.setValue("Profesorado");
		
		sliderEmocional.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				lEmocional.setText(""+newValue.intValue()+ " %");
			}
		});
		
		sliderPersonalidad.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				lPersonalidad.setText(""+newValue.intValue()+ " %");
			}
		});
		
		sliderTotal.valueProperty().addListener(new ChangeListener<Number>() {
			@Override
			public void changed(ObservableValue<? extends Number> observable, Number oldValue, Number newValue) {
				lTotal.setText(""+newValue.intValue()+ " %");
			}
		});
    	
		
    }
    
    @FXML
    private void calcularPersonalidad () {
    	
    	int perso1 = spPersonalidad1_1.getValue() - spPersonalidad2_1.getValue();
    	perso1 = Math.abs(perso1);
    	int perso2 = spPersonalidad1_2.getValue() - spPersonalidad2_2.getValue();
    	perso2 = Math.abs(perso2);
    	int perso3 = spPersonalidad1_3.getValue() - spPersonalidad2_3.getValue();
    	perso3 = Math.abs(perso3);
    	int perso4 = spPersonalidad1_4.getValue() - spPersonalidad2_4.getValue();
    	perso4 = Math.abs(perso4);
    	
    	Double compatPerso = 20.0 - perso1 - perso2 - perso3 - perso4 ;
    	persoPorcent = (compatPerso/20.0)*100.0;
    	sliderPersonalidad.setValue(persoPorcent);
    	
    	Main.LOGGER.info("CALCULO PERSONALIDAD "+ persoPorcent + " %");
    	
    }
    
    @FXML
    private void calcularEmocional () {
    	int emoc1 = (spEmocional1_1.getValue()-spEmocional2_1.getValue());
//    	emoc1 = Math.abs(emoc1);
    	int emoc2 = ((spEmocional1_2.getValue()-spEmocional2_2.getValue()));
//    	emoc2 = Math.abs(emoc2);
    	int emoc3 = (spEmocional1_3.getValue()-spEmocional2_3.getValue());
//    	emoc3 = Math.abs(emoc3);
    	int emoc4 = (spEmocional1_4.getValue()-spEmocional2_4.getValue());
//    	emoc4 = Math.abs(emoc4);
    	
    	
    	Double compatEmoc = 20.0 - Math.abs(emoc1) - Math.abs(emoc2)- Math.abs(emoc3)- Math.abs(emoc4);
    	
    	emocPorcent = (compatEmoc/20.0)*100.0;
    	sliderEmocional.setValue(emocPorcent);
    	
    	Main.LOGGER.info("CALCULO EMOCIONAL "+ emocPorcent + " %");
    }
    
    
    @FXML
    private void calcularTotal () {
    	if (persoPorcent==0||emocPorcent==0) {
    		Main.LOGGER.info("CALCULAR PARTE EMOCIONAL Y PERSONAL ANTES");
    	}else {
    	totalPorcent = (persoPorcent + emocPorcent)/2;
    	sliderTotal.setValue(totalPorcent);    	
    	Main.LOGGER.info("CALCULO TOTAL "+ totalPorcent + " %");
    	}
    	
    }
    @FXML
    private void limpiar () {

    	spPersonalidad1_1.getValueFactory().setValue(1);
    	spPersonalidad1_2.getValueFactory().setValue(1);
    	spPersonalidad1_3.getValueFactory().setValue(1);
    	spPersonalidad1_4.getValueFactory().setValue(1);
    	spPersonalidad2_1.getValueFactory().setValue(1);
    	spPersonalidad2_2.getValueFactory().setValue(1);
    	spPersonalidad2_4.getValueFactory().setValue(1);
		spEmocional1_1.getValueFactory().setValue(1);
		spEmocional1_2.getValueFactory().setValue(1);
		spEmocional1_3.getValueFactory().setValue(1);
		spEmocional1_4.getValueFactory().setValue(1);
		spEmocional2_1.getValueFactory().setValue(1);
		spEmocional2_2.getValueFactory().setValue(1);
		spEmocional2_3.getValueFactory().setValue(1);
		spEmocional2_4.getValueFactory().setValue(1);
		sliderEmocional.setValue(50.0);
		sliderPersonalidad.setValue(50.0);
		sliderTotal.setValue(50.0);
		persoPorcent=0;
		emocPorcent=0;
    }
		
    @FXML
	private void usuarios() throws IOException {
		String opcion = cbUsuario.getSelectionModel().getSelectedItem();
		ResourceBundle bundle = null;
		if ("Alumnado".equals(opcion)) {
			bundle = ResourceBundle.getBundle("resources.alumnos");
		} else if ("Profesorado".equals(opcion)) {
			bundle = ResourceBundle.getBundle("resources.profesores");
		
		}else {
			return;
		}

		// Recargar la escena con el nuevo ResourceBundle
		try {
			FXMLLoader loader = new FXMLLoader(getClass().getResource("/application/interfaz.fxml"), bundle);
			AnchorPane root = loader.load();

			// Reemplazar el contenido con el nuevo root
			Stage stage = (Stage) cbUsuario.getScene().getWindow();
			stage.getScene().setRoot(root);

			// Restaurar la selecci�n del idioma
			Controller controller = loader.getController();
			controller.cbUsuario.setValue(opcion);

		} catch (IOException e) {
			e.printStackTrace();

		}
	}
		
}
