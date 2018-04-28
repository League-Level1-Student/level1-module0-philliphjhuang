import org.jointheleague.graphical.robot.Robot;

import javafx.scene.paint.Color;

public class Houses {
	public static void main(String[] args) {
	String small = "60";
	String medium = "120";
	String large = "250";
		
	Robot rob = new Robot();	
	rob.setSpeed(50);
	rob.setX(900);
	rob.setY(500);
	rob.penDown();
	rob.setPenWidth(50);
	}
	
public void drawGrass() {
	rob.setAngle(270);
	rob.setPenColor(0,255,0);
	rob.move(50);
}

public void drawHouse() {
	rob.setAngle(0);
	rob.setPenColor(68,155,16);
	rob.move(400);
}
	rob.setAngle(270);
	rob.move(50);
	rob.setAngle(180);
	rob.move(400);
	
	rob.setPenColor(0,255,0);
	
	
	
	
	
	}
}
