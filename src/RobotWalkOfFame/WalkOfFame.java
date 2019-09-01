package RobotWalkOfFame;
import org.jointheleague.graphical.robot.Robot;
public class WalkOfFame {
	public static void main(String[] Args) {
		Robot Bobby = new Robot();
		Bobby.setX(100);
		Bobby.hide();
		Bobby.setSpeed(100);
		for (int Y = 0; Y < 14; Y++) {
			Bobby.penDown();
			for (int X = 0; X < 5; X++) {
				Bobby.move(30);
				Bobby.turn(144);	
			}
			Bobby.penUp();
			Bobby.setAngle(90);
			Bobby.move(50);
		}
	}
}
