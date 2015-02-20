package dialogs;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;
import javafx.stage.Stage;


public class AceptarCancelar extends Application{

	@Override
	public void start(Stage arg0) throws Exception {
		//Cuadro de diálogo con dos botones
		Alert alert = new Alert(AlertType.CONFIRMATION);
		alert.setTitle("Confirmación");
		alert.setHeaderText("Título, lo que va a ocurrir");
		alert.setContentText("¿Quieres continuar?");

		//Optener resultado
		Optional<ButtonType> result = alert.showAndWait();
		if (result.get() == ButtonType.OK){
		    // código para OK
		} else {
		    // código para Cancelar
		}
		
	}

	
	public static void main(String[] args) {
		launch(args);
	}
}
