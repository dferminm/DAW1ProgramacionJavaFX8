package dialogs;

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;



public class Mensajes extends Application{
	
	public static void main(String[] args) {
	    launch(args);
	}

	@Override
	public void start(Stage arg0) {
		
		// Mensaje con cabecera
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("Diálogo informativo");
		alert.setHeaderText("Cabecera, tipo de mensaje");
		alert.setContentText("¡¡Esto es el mensaje!!");
		alert.showAndWait();
		
		// Mensaje sin cabecera
		Alert alert2 = new Alert(AlertType.INFORMATION);
		alert2.setTitle("Diálogo informativo");
		alert2.setHeaderText(null);
		alert2.setContentText("¡¡Esto es el mensaje!!");
		alert2.showAndWait();
		
		//Alerta (usando show el mensaje no es modal/bloqueante)
		Alert alert3 = new Alert(AlertType.WARNING);
		alert3.setTitle("Aviso");
		alert3.setHeaderText("Esto es un aviso");
		alert3.setContentText("¡¡Esto es el mensaje!!");
		alert3.show();
		
		//Error
		Alert alert4 = new Alert(AlertType.ERROR);
		alert4.setTitle("Error");
		alert4.setHeaderText("Ha ocurrido un error");
		alert4.setContentText("Mensaje de Error");
		alert4.show();
		
		
	}
	
}
