package dialogs;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.ChoiceDialog;
import javafx.stage.Stage;

public class ListaDesplegable extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		//Creamos un ArrayList con las opciones
		ArrayList<String> choices = new ArrayList<>();
		choices.add("uno");
		choices.add("dos");
		choices.add("tres");
		choices.add("cuatro");

		// Creamos diálog y le pasamos opción preseleccionada y opciones
		ChoiceDialog<String> dialog = new ChoiceDialog<>("uno", choices);
		dialog.setTitle("Opciones");
		dialog.setHeaderText("Un cuadro de diálogo con opciones");
		dialog.setContentText("Elige un número:");

		// Modo tradicional de obtener resultado
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()){
		    System.out.println("Tu elección: " + result.get());
		}

		// Modo Java 8
		result.ifPresent(letter -> System.out.println("Tu elección: " + letter));
	}

	public static void main(String[] args) {
		launch(args);
	}

}
