package Extra;
import javax.swing.JOptionPane;
public class BananaQuiz {
	public static void main(String[] Args) {
		String Answer = JOptionPane.showInputDialog("∂ø Áø¨ Òˆ˚´ ıå˜å˜åß¿");
		if (Answer.equals("˜ø")) {
			JOptionPane.showMessageDialog(null, "Áø¨ Å®´ Ç®åΩ¥⁄");
		}
		else if (Answer.equals("Á´ß")) {
			Answer = JOptionPane.showInputDialog("„˙å† ˆß Áø¨® Ïå√ø®ˆ†´ ˙ø∫∫¥¿");
			JOptionPane.showMessageDialog(null, Answer + " ˆß Â¨ç˙ ı´††´® „ˆ†˙ ıå˜å˜åß⁄");
		}
		else {
			JOptionPane.showMessageDialog(null, "Áø¨® Å®´ ıå˜å˜åß⁄");
		}
	}
}
