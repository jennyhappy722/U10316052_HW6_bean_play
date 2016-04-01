//u10316052
//import package
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.scene.shape.*;
import javafx.util.*;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.beans.binding.Bindings;
import javafx.beans.property.*;
import javafx.beans.value.WritableObjectValue;
import javafx.animation.*;
import java.util.*;
import javafx.event.*;
//class


public class LineHW extends Pane{
	//start dot location
	double x=150;
	double y=50;
	//start dot
	public Circle circle;
	Timeline animation;
	//add path location dot 36
	Circle D1 = new Circle(150,60,2);

	Circle D2 = new Circle(140,72,2);
	Circle D3 = new Circle(160,72,2);

	Circle D4 = new Circle(130,90,2);
	Circle D5 = new Circle(150,90,2);
	Circle D6 = new Circle(170,90,2);

	Circle D7 = new Circle(120,108,2);
	Circle D8 = new Circle(140,108,2);
	Circle D9 = new Circle(160,108,2);
	Circle D10 = new Circle(180,108,2);

	Circle D11 = new Circle(110,126,2);
	Circle D12 = new Circle(130,126,2);
	Circle D13 = new Circle(150,126,2);
	Circle D14 = new Circle(170,126,2);
	Circle D15 = new Circle(190,126,2);

	Circle D16 = new Circle(100,144,2);
	Circle D17 = new Circle(120,144,2);
	Circle D18 = new Circle(140,144,2);
	Circle D19 = new Circle(160,144,2);
	Circle D20 = new Circle(180,144,2);
	Circle D21 = new Circle(200,144,2);

	Circle D22 = new Circle(90,162,2);
	Circle D23 = new Circle(110,162,2);
	Circle D24 = new Circle(130,162,2);
	Circle D25 = new Circle(150,162,2);
	Circle D26 = new Circle(170,162,2);
	Circle D27 = new Circle(190,162,2);
	Circle D28 = new Circle(210,162,2);

	Circle D29 = new Circle(80,180,2);
	Circle D30 = new Circle(100,180,2);
	Circle D31 = new Circle(120,180,2);
	Circle D32 = new Circle(140,180,2);
	Circle D33 = new Circle(160,180,2);
	Circle D34 = new Circle(180,180,2);
	Circle D35 = new Circle(200,180,2);
	Circle D36 = new Circle(220,180,2);
	
	Circle D37 = new Circle(80,230,2);
	Circle D38 = new Circle(100,230,2);
	Circle D39 = new Circle(120,230,2);
	Circle D40 = new Circle(140,230,2);
	Circle D41 = new Circle(160,230,2);
	Circle D42 = new Circle(180,230,2);
	Circle D43 = new Circle(200,230,2);
	Circle D44 = new Circle(220,230,2);	
	
	//add path dot
	Circle r1 = new Circle(150,160,2);
	Circle r2 = new Circle(120,180,2);
	Circle r3 = new Circle(140,180,2);
	Circle r4 = new Circle(160,180,2);
	Circle r5 = new Circle(180,180,2);
	Circle r6 = new Circle(200,180,2);
	Circle r7 = new Circle(220,180,2);
	Circle r8 = new Circle(220,180,2);
	Circle r9 = new Circle(220,180,2);
	
	
	//paint shape
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
		
		

		//add to pane
		getChildren().addAll(line,line1,line2,line3,line4,line5,line6,line7,line8,line9,line10,line11,line12,line13,e1,e2,e3,e4,e5,e6,e7,e8,e9,e10,e11,e12,e13,e14,e15,e16,e17,e18,e19,e20,e21,e22,e23,e24,e25,e26,e27,e28);

	}
	//path animation
	public void animation1(Circle circle,Circle Dots1 ,Circle Dots2,Circle Dots3,Circle Dots4,Circle Dots5,Circle Dots6,Circle Dots7,Circle Dots8,Circle Dots9){
    		// Create an animation for moving the ball
		circle=new Circle(x,y,2);
    		Path path = new Path();
    		path.getElements().add(new MoveTo(circle.getCenterX(),circle.getCenterY()));
   		path.getElements().add(new LineTo(Dots1.getCenterX(), Dots1.getCenterY()));
		path.getElements().add(new LineTo(Dots2.getCenterX(), Dots2.getCenterY()));
   		path.getElements().add(new LineTo(Dots3.getCenterX(), Dots3.getCenterY()));
		path.getElements().add(new LineTo(Dots4.getCenterX(), Dots4.getCenterY()));
   		path.getElements().add(new LineTo(Dots5.getCenterX(), Dots5.getCenterY()));
		path.getElements().add(new LineTo(Dots6.getCenterX(), Dots6.getCenterY()));
   		path.getElements().add(new LineTo(Dots7.getCenterX(), Dots7.getCenterY()));
		path.getElements().add(new LineTo(Dots8.getCenterX(), Dots8.getCenterY()));
		path.getElements().add(new LineTo(Dots9.getCenterX(), Dots9.getCenterY()));
		getChildren().addAll(circle);
    		PathTransition pathtransition = new PathTransition(Duration.millis(1000),path,circle);//time,path,object
    		/*pathtransition.setDuration(Duration.seconds(1));
    		pathtransition.setNode(circle);
    		pathtransition.setPath(path);*/
    		//pathtransition.setOrientation(OrientationType.ORTHOGONAL_TO_TANGENT);   	  
    		pathtransition.play();
	}

	
	//path random
	public void rootu(){
		int r = new Random().nextInt(2)+1;
		r1=D1;
		//---------------------------------------------------------------------r1
		if(r==2)
			r2=D2;
		else
			r2=D3;
		
		//---------------------------------------------------------------------r2
		if(r2==D2){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r3=D4;
			else
				r3=D5;
		}

		if(r2==D3){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r3=D5;
			else
				r3=D6;
		}

		//---------------------------------------------------------------------r3
		if(r3==D4){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r4=D7;
			else
				r4=D8;
		}

		if(r3==D5){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r4=D9;
			else
				r4=D8;
		}

		if(r3==D6){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r4=D9;
			else
				r4=D10;
		}
		//---------------------------------------------------------------------r4
		if(r4==D7){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r5=D11;
			else
				r5=D12;
		}

		if(r4==D8){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r5=D13;
			else
				r5=D12;
		}

		if(r4==D9){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r5=D13;
			else
				r5=D14;
		}

		if(r4==D10){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r5=D14;
			else
				r5=D15;
		}
		//---------------------------------------------------------------------r5
		if(r5==D11){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r6=D16;
			else
				r6=D17;
		}

		if(r5==D12){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r6=D18;
			else
				r6=D17;
		}

		if(r5==D13){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r6=D18;
			else
				r6=D19;
		}

		if(r5==D14){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r6=D19;
			else
				r6=D20;
		}

		if(r5==D15){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r6=D20;
			else
				r6=D21;
		}
		
		//---------------------------------------------------------------------r6
		if(r6==D16){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D22;
			else
				r7=D23;
		}

		if(r6==D17){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D24;
			else
				r7=D23;
		}	

		if(r6==D18){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D24;
			else
				r7=D25;
		}	

		if(r6==D19){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D25;
			else
				r7=D26;
		}	

		if(r6==D20){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D26;
			else
				r7=D27;
		}	

		if(r6==D21){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r7=D27;
			else
				r7=D28;
		}
		//---------------------------------------------------------------------r7
		if(r7==D22){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D29;
			else
				r8=D30;
		}

		if(r7==D23){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D31;
			else
				r8=D30;
		}

		if(r7==D24){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D31;
			else
				r8=D32;
		}

		if(r7==D25){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D32;
			else
				r8=D33;
		}

		if(r7==D26){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D33;
			else
				r8=D34;
		}

		if(r7==D27){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D35;
			else
				r8=D34;
		}

		if(r7==D28){
			r = new Random().nextInt(2)+1;
			if(r==2)
				r8=D35;
			else
				r8=D36;
		}
				//--------------------------------------------------------------r8
		if(r8==D29){			
			r9=D37;
		}

		if(r8==D30){			
			r9=D38;
		}

		if(r8==D31){			
			r9=D39;
		}

		if(r8==D32){			
			r9=D40;
		}

		if(r8==D33){			
			r9=D41;
		}

		if(r8==D34){			
			r9=D42;
		}

		if(r8==D35){			
			r9=D43;
		}

		if(r8==D36){			
			r9=D44;
		}
				
	

		
	}
	//get r location
	public Circle getr1(){

		return r1;
	}
	//get r location
	public Circle getr2(){

		return r2;
	}

	//get r location
	public Circle getr3(){

		return r3;
	}
	//get r location
	public Circle getr4(){

		return r4;
	}
	//get r location
	public Circle getr5(){

		return r5;
	}
	//get r location
	public Circle getr6(){

		return r6;
	}
	//get r location
	public Circle getr7(){

		return r7;
	}
	//get r location
	public Circle getr8(){

		return r8;
	}
	public Circle getr9(){

		return r9;
	}
	public Circle getcircle(){

		return circle;
	}



}
