package dialogs;

import java.util.Optional;

import javafx.application.Application;
import javafx.scene.control.TextInputDialog;
import javafx.stage.Stage;

public class EntradaTexto extends Application {

	@Override
	public void start(Stage arg0) throws Exception {
		// creación del TextInput, se le puede pasar un valor en el constructor
		TextInputDialog dialog = new TextInputDialog();
		dialog.setTitle("Text Input");
		dialog.setHeaderText(null);
		dialog.setContentText("Introduce tu nombre:");

		// Recoger datos modo pre Java 8
		Optional<String> result = dialog.showAndWait();
		if (result.isPresent()){
		    System.out.println("Tu nombre: " + result.get());
		}

		// Modo Java 8 (con expresión lambda).
		result.ifPresent(name -> System.out.println("Tu nombre: " + name));

	}

	public static void main(String[] args) {
		launch(args);
	}

}
