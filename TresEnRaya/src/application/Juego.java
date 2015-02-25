package application;
	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.StrokeLineCap;


public class Juego extends Application {
	
	public static void main(String[] args) {
		launch(args);
	}
	
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Juego - 3 en raya");
		
		// Creamos la escena (ventana)
		Group root = new Group();
        Scene scene = new Scene(root, 400, 400, Color.WHITE);
        
        // Dibujamos el tablero
        Rectangle tablero = new Rectangle(50,50,300,300);
        tablero.setStrokeWidth(10);
        tablero.setStroke(Color.BLACK);
        tablero.setFill(Color.ORANGERED);
        
        root.getChildren().add(tablero);
        
        // Dibujamos las líneas horizontales del tablero
        Line linea1 = new Line(50, 150, 350, 150);
        linea1.setStroke(Color.BLACK);
        linea1.setStrokeWidth(5);
        linea1.setStrokeLineCap(StrokeLineCap.BUTT);
        
        root.getChildren().add(linea1);
        
        Line linea2 = new Line(50, 250, 350, 250);
        linea2.setStroke(Color.BLACK);
        linea2.setStrokeWidth(5);
        linea2.setStrokeLineCap(StrokeLineCap.BUTT);
        
        root.getChildren().add(linea2);
        
        // Dibujamos las líneas verticales del tablero
        
        Line linea3 = new Line(150, 50, 150, 350);
        linea3.setStroke(Color.BLACK);
        linea3.setStrokeWidth(5);
        linea3.setStrokeLineCap(StrokeLineCap.BUTT);
        
        root.getChildren().add(linea3);
        
        Line linea4 = new Line(250, 50, 250, 350);
        linea4.setStroke(Color.BLACK);
        linea4.setStrokeWidth(5);
        linea4.setStrokeLineCap(StrokeLineCap.BUTT);
        
        root.getChildren().add(linea4);
        
        primaryStage.setScene(scene);
        primaryStage.show();
	}

}