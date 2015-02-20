package dialogs;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonBar.ButtonData;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;

public class SiNo extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// Alerta con botones
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Cuadro de diálogo con botones personalizados");
		alert.setHeaderText("Un cuadro de diálogo con botones personalizados");
		alert.setContentText("¿Quieres guardar?.");

		// creamos lo botones personalizados que queremos
		ButtonType buttonTypeSi = new ButtonType("Si");
		ButtonType buttonTypeNo = new ButtonType("No");
		ButtonType buttonTypeCancelar = new ButtonType("Cancelar", ButtonData.CANCEL_CLOSE);

		// añadirmos botones al cudro de diálogo
		alert.getButtonTypes().setAll(buttonTypeSi, buttonTypeNo, buttonTypeCancelar);

		// mostramos y esperamos pulsación
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == buttonTypeSi){
		    // pulsó SI
		} else if (result.get() == buttonTypeNo) {
		    // pulsó NO
		} else if (result.get() == buttonTypeCancelar) {
		    // pulsó Cancelar
		}
		
	}

	public static void main(String[] args) {
		launch(args);
	}
}
