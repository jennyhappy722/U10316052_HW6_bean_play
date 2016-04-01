import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.*;

public class Test extends Application{

	@Override
	public void start(Stage primaryStage){
		LineHW linehw=new LineHW();		


		Scene scene = new Scene(linehw, 300, 300);
    		primaryStage.setTitle("game"); // Set the stage title
    		primaryStage.setScene(scene); // Place the scene in the stage
    		scene.setOnMouseClicked(e ->{
		linehw.rootu();
		linehw.animation1(linehw.getcircle(),linehw.getr1(),linehw.getr2(),linehw.getr3(),linehw.getr4(),linehw.getr5(),linehw.getr6(),linehw.getr7(),linehw.getr8(),linehw.getr9());
		});
    
    		primaryStage.show();


	}
}
