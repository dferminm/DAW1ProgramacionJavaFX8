package basicos;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.DropShadow;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.CubicCurve;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Path;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Shape;
import javafx.scene.shape.StrokeType;
import javafx.stage.Stage;

public class Formas extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
	      primaryStage.setTitle("Dibujando formas");
	        Group root = new Group();
	        Scene scene = new Scene(root, 306, 600, Color.WHITE);

	        // Circulos
	        Circle circulo1 = new Circle(
	                100,   // center x
	                100,   // center y
	                50); // radius
	        circulo1.setStrokeWidth(3);
	        circulo1.setStroke(Color.BLACK);
	        circulo1.setFill(Color.RED);
	                
	        Ellipse circulo2 = new Ellipse(
	                200,   // center x
	                100,   // center y
	                35/2,  // radius x
	                25/2); // radius y
	        circulo2.setStroke(Color.BLACK);
	        
	        root.getChildren().addAll(circulo1,circulo2);
	        
	        // Rectángulo
	        Rectangle r=new Rectangle(50,200,200,50);
	        r.setStrokeWidth(3);
	        r.setStroke(Color.BLACK);
	        r.setFill(Color.ORANGERED);
	        
	        root.getChildren().add(r);
	        
	        // Una curva cúbica
	        CubicCurve cubicCurve = new CubicCurve(
	                50,  // x inicial
	                350,  // y inicial
	                40,  // punto de control x1
	                250, // punto de control y1
	                220, // punto de control x2
	                300, // punto de control y2
	                240, // x final
	                350); // y final
	        cubicCurve.setStrokeType(StrokeType.CENTERED);
	        cubicCurve.setStroke(Color.BLACK);
	        cubicCurve.setStrokeWidth(3);
	        cubicCurve.setFill(Color.TRANSPARENT);
	                
	        root.getChildren().add(cubicCurve);
	                
	        
	        Button botón = new Button("Restar Circulos");
	        botón.setLayoutX(50);
	        botón.setLayoutY(375);
	        
	        root.getChildren().add(botón);
	        
	        botón.setOnAction((ActionEvent e) -> {
	        	if (root.getChildren().size()<6) {
		        	circulo2.centerXProperty().set(100);
			        Shape resta = Path.subtract(circulo1, circulo2);
			        resta.setStrokeWidth(1.8);
			        resta.setStroke(Color.BLACK);
			        resta.setFill(Color.rgb(255, 200, 0));
			        resta.setLayoutY(400);
			        
			        // Sombra
			        DropShadow shadow = new DropShadow(
			            10,    // radio
			            2.0f, // offset X
			            2.0f, // offset Y
			            Color.rgb(50, 50, 150, .8));
			        resta.setEffect(shadow);
			        root.getChildren().add(resta);
			        }
            });

	        primaryStage.setScene(scene);
	        primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

}
