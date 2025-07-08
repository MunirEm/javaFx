module examenFX {
	requires javafx.controls;
	requires transitive javafx.fxml;
	requires transitive javafx.graphics;
    requires transitive java.logging;
    
	opens application to javafx.graphics, javafx.fxml;
	exports application;
}
