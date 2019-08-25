package Extra;
import javax.swing.JOptionPane;
import org.jointheleague.graphical.robot.Robot;
public class DizzyRobot {
	static Robot Bobby = new Robot();
	public static void main(String[] Args) {
		String Times = JOptionPane.showInputDialog("˙ø∑ ∂ˆΩΩ† ∂ø Áø¨ „å˜† ˇ˙´ ‰ø∫ø† ˇø ı´¿");
		Bobby.setSpeed(100);
		Dance(Integer.parseInt(Times));
	}
	static void Dance(int NumberOfSpins) {
		for (int I = 0; I < NumberOfSpins; I++) {
			Bobby.turn(360);
		}
	}
}

