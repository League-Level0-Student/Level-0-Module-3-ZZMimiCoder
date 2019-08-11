package HighLow;
import java.util.Random;
import javax.swing.JOptionPane;
public class HighLowGame {
	public static void main(String[] Args) { 
		int RandomNumber = new Random().nextInt(101);
		for (int X = 0; X < 11; X++) {
			int Answer = Integer.parseInt(JOptionPane.showInputDialog("What Is Your Guess?"));
			if (Answer == RandomNumber) {
				JOptionPane.showMessageDialog(null, "You Win!");
				System.exit(0);
			}
			else if (Answer < RandomNumber) {
				JOptionPane.showMessageDialog(null, "Too Low!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Too High!");
			}
		}
		JOptionPane.showMessageDialog(null, "You Lose!");
	}
}