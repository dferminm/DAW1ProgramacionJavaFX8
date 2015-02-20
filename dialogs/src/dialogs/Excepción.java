package dialogs;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.StringWriter;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import javafx.stage.Stage;

public class Excepción extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//Creamos un Alert tipo ERROR
		Alert alert = new Alert(AlertType.ERROR);
		alert.setTitle("Excepción");
		alert.setHeaderText("Se ha producido una excepción");
		alert.setContentText("No se ha podido abrir el archivo prueba.txt");

		Exception ex = new FileNotFoundException("No se ha podido abrir prueba.txt");

		// Crear un PrintWriter para poder escribir la salida en un String.
		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);
		ex.printStackTrace(pw);
		String exceptionText = sw.toString();

		// una etiqueta y un textarea que irán dentro del desplegable
		Label label = new Label("Traza de llamadas:");
		TextArea textArea = new TextArea(exceptionText);
		textArea.setEditable(false);
		textArea.setWrapText(false);

		textArea.setMaxWidth(Double.MAX_VALUE);
		textArea.setMaxHeight(Double.MAX_VALUE);
		GridPane.setVgrow(textArea, Priority.ALWAYS);
		GridPane.setHgrow(textArea, Priority.ALWAYS);

		//Creamos un panel donde añadimos etiqueta y textarea
		GridPane expContent = new GridPane();
		expContent.setMaxWidth(Double.MAX_VALUE);
		expContent.add(label, 0, 0);
		expContent.add(textArea, 0, 1);

		// al diálog le añadimos el gridpane en su área expandible
		alert.getDialogPane().setExpandableContent(expContent);
		alert.setWidth(500);

		alert.showAndWait();

	}

	public static void main(String[] args) {
		launch(args);

	}

}
