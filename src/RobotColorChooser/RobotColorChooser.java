package RobotColorChooser;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
import java.awt.Color;
public class RobotColorChooser {
	public static void main(String[] args) {
		Robot Darren = new Robot();
		while (true) {
			String PenColor = JOptionPane.showInputDialog("What Color?");
			Darren.setPenWidth(10);
			Darren.penDown();
			Darren.setSpeed(50);
			if (PenColor.equals("Red")) {
				Darren.setPenColor(Color.red);
			}
			else if (PenColor.equals("Green")) {
				Darren.setPenColor(Color.green);
			}
			else if (PenColor.equals("Blue")) {
				Darren.setPenColor(Color.blue);
			}
			else if (PenColor.equals("Cyan")) {
				Darren.setPenColor(Color.cyan);
			}
			else if (PenColor.equals("White")) {
				Darren.setPenColor(Color.white);
			}
			else if (PenColor.equals("Black")) {
				Darren.setPenColor(Color.black);
			}
			else if (PenColor.equals("Dark Gray")) {
				Darren.setPenColor(Color.darkGray);
			}
			else if (PenColor.equals("Gray")) {
				Darren.setPenColor(Color.gray);
			}
			else if (PenColor.equals("Light Gray")) {
				Darren.setPenColor(Color.lightGray);
			}
			else if (PenColor.equals("Magenta")) {
				Darren.setPenColor(Color.magenta);
			}
			else if (PenColor.equals("Orange")) {
				Darren.setPenColor(Color.orange);
			}
			else if (PenColor.equals("Pink")) {
				Darren.setPenColor(Color.pink);
			}
			else if (PenColor.equals("Yellow")) {
				Darren.setPenColor(Color.yellow);
			}
			else {
				Darren.setRandomPenColor();
			}
			Darren.move(100);
			Darren.turn(120);
			Darren.move(100);
			Darren.turn(120);
			Darren.move(100);
			Darren.turn(120);
		}
	}
}
