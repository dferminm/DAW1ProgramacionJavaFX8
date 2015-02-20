package basicos;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Slider;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.StrokeLineCap;
import javafx.scene.text.Text;
import javafx.stage.Stage;


	public class Líneas extends Application {
	    @Override
	    public void start(Stage primaryStage) {
	        primaryStage.setTitle("Lineas y Estilos");        

	        // Creamos la escena (ventana)
	        Group root = new Group();
	        Scene scene = new Scene(root, 300, 200, Color.BISQUE);
	        
	        // Linea Roja
	        Line redLine = new Line(10, 10, 200, 10);
	        redLine.setStroke(Color.RED); 	// Color
	        redLine.setStrokeWidth(10);		// Anchura
	        redLine.setStrokeLineCap(StrokeLineCap.BUTT);	// Tipo de final (cortado)
	        
	        // por último añadimos la línea a la raiz (de la ventana)
	        root.getChildren().add(redLine);
	        
	        // Línea blanca
	        Line whiteLine = new Line(10, 30, 200, 30);
	        whiteLine.setStroke(Color.WHITE);
	        whiteLine.setStrokeWidth(10);
	        whiteLine.setStrokeLineCap(StrokeLineCap.ROUND);
	        
	        root.getChildren().add(whiteLine);
	        
	        // Línea Azul
	        Line blueLine = new Line(10, 50, 200, 50);
	        blueLine.setStroke(Color.DARKBLUE);
	        blueLine.setStrokeWidth(10);
	        
	        root.getChildren().add(blueLine);
	        
	        
	        // Ejemplo Binding
	        // Línea que cambia de grosor
	        Line magentaLine = new Line(20, 80, 200, 80);
	        magentaLine.setStroke(Color.DARKMAGENTA);
	        magentaLine.setStrokeWidth(10);
	        
	        // slider entre 1 y 20
	        Slider slider = new Slider(1, 20, 1);
	        slider.setLayoutX(10);
	        slider.setLayoutY(125);
	        
	        // unimos la propiedad strokeWidth con value del slider
	        magentaLine.strokeWidthProperty().bind(slider.valueProperty());
	        
	        root.getChildren().add(magentaLine);
	        root.getChildren().add(slider);
	        
	        
	        Text textoAncho = new Text("Anchura de la línea: ");
	        textoAncho.setX(10);
	        textoAncho.setY(110);
	        
	        // también añadimos un listener usando una función lambda 
	        slider.valueProperty()
	            .addListener((ov, curVal, newVal) ->
	            textoAncho.setText(String.format("Anchura de la línea: %d pixeles", (int)slider.getValue())));
	        root.getChildren().add(textoAncho);
	        
	        // por último mostramos la escena
	        primaryStage.setScene(scene);
	        primaryStage.show();
	    }
		
		public static void main(String[] args) {
			launch(args);
		}
	}
