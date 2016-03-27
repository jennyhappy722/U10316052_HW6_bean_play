//u10316052
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Line;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.*;
import javafx.util.*;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.property.DoubleProperty;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.util.Duration;

//class
public class LineHW extends Pane{
	
	double x=150;
	double y=50;
	public Circle circle=new Circle(x,y,2);
	Timeline animation;

	public LineHW(){
		//create line 
		Line line=new Line(130,50,130,80);
		Line line1=new Line(170,50,170,80);
		Line line2=new Line(130,80,70,180);
		Line line3=new Line(170,80,230,180);
		Line line4=new Line(70,180,70,240);
		Line line5=new Line(230,180,230,240);
		Line line6=new Line(70,240,230,240);
		Line line7=new Line(90,180,90,240);
		Line line8=new Line(110,180,110,240);
		Line line9=new Line(130,180,130,240);
		Line line10=new Line(150,180,150,240);
		Line line11=new Line(170,180,170,240);
		Line line12=new Line(190,180,190,240);
		Line line13=new Line(210,180,210,240);
		//create dot 28
		Ellipse e1=new Ellipse(90,180,5,5);
		Ellipse e2=new Ellipse(110,180,5,5);
		Ellipse e3=new Ellipse(130,180,5,5);
		Ellipse e4=new Ellipse(150,180,5,5);
		Ellipse e5=new Ellipse(170,180,5,5);
		Ellipse e6=new Ellipse(190,180,5,5);
		Ellipse e7=new Ellipse(210,180,5,5);

		Ellipse e8=new Ellipse(100,162,5,5);
		Ellipse e9=new Ellipse(120,162,5,5);
		Ellipse e10=new Ellipse(140,162,5,5);
		Ellipse e11=new Ellipse(160,162,5,5);
		Ellipse e12=new Ellipse(180,162,5,5);
		Ellipse e13=new Ellipse(200,162,5,5);

		Ellipse e14=new Ellipse(110,144,5,5);
		Ellipse e15=new Ellipse(130,144,5,5);
		Ellipse e16=new Ellipse(150,144,5,5);
		Ellipse e17=new Ellipse(170,144,5,5);
		Ellipse e18=new Ellipse(190,144,5,5);

		Ellipse e19=new Ellipse(120,126,5,5);
		Ellipse e20=new Ellipse(140,126,5,5);
		Ellipse e21=new Ellipse(160,126,5,5);
		Ellipse e22=new Ellipse(180,126,5,5);

		Ellipse e23=new Ellipse(130,108,5,5);
		Ellipse e24=new Ellipse(150,108,5,5);
		Ellipse e25=new Ellipse(170,108,5,5);

		Ellipse e26=new Ellipse(140,90,5,5);
		Ellipse e27=new Ellipse(160,90,5,5);

		Ellipse e28=new Ellipse(150,72,5,5);

		e1.setFill(Color.BLACK);
		//add to pane
		getChildren().addAll(circle,line,line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28);

	}

	public void animation1(){
    		// Create an animation for moving the ball
    		animation = new Timeline(
    		new KeyFrame(Duration.millis(10), e -> moviecirle()));
		new KeyFrame(
    		animation.setCycleCount(Timeline.INDEFINITE);
   		animation.play(); // Start animation
	}

	public void moviecirle(){

		x++;
		y++;
		circle.setCenterX(x);
		circle.setCenterY(y);
		
	}
}
