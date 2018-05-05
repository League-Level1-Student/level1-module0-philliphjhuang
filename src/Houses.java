import org.jointheleague.graphical.robot.Robot;

public class Houses {

	public static void main(String[] args) {
	
		
	Robot rob = new Robot();	
	rob.setSpeed(50);
	rob.setX(50);
	rob.setY(500);
	rob.penDown();
	rob.setPenWidth(50);
	rob.hide();
		drawHouse(rob, "large","black");
		drawHouse(rob, "large","green");
		drawHouse(rob, "small","green");
		drawHouse(rob, "medium","black");
		drawHouse(rob, "large","green");
		drawHouse(rob, "medium","black");
		drawHouse(rob, "small","black");
		drawHouse(rob, "medium","green");
		drawHouse(rob, "large","black");
		drawHouse(rob, "small","black");
		drawHouse(rob, "medium","green");
	}
	private static void drawFlatRoof(Robot rob) {
	rob.setAngle(90);
	rob.move(50);
		}
	public static void drawHouse(Robot rob , String height , String color) {
		int h = 0;
		if(height=="large") {
			h=250;
			
		} else if(height=="medium") {
			h=120;
		} else if(height=="small") {
			h=60;
		}
		int c = 0;
		if(color=="black") {
			c=0;
		} else if(color=="green") {
			c=255;
		}
		//left wall
		rob.setPenColor(0,c,0);
		rob.setAngle(0);
		rob.move(h);
		if(height=="large") {
			h=250;
			drawFlatRoof(rob);
		} else if(height=="small") {
			h=60;
			drawPointyRoof(rob);
		} else if(height=="medium") {
			h=120;
			drawPointyRoof(rob);
		}
		
		//right wall
		rob.setAngle(180);
		rob.move(h);
		
		//grass
		rob.setAngle(90);
		rob.setPenColor(0, 255, 0);
		rob.move(50);
		
		
	}
	
	
	
	private static void drawPointyRoof(Robot rob) {
	rob.setAngle(45);
	rob.move(35);
	
	rob.setAngle(135);
	rob.move(35);
		}
	

	}


