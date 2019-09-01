package BirthdayReminder;
import javax.swing.JOptionPane;
public class BirthdayReminder {
	public static void main(String[] args) {
		String MyBirthday = "Ô¨˜´ ¶†˙";
		String MyFriendsBirthday = "Î´ç´µ∫´® ¢†˙";
		String MyTeachersBirthday = "Âå®ç˙ ¡™†˙";
		String Answer = JOptionPane.showInputDialog("„˙øß´ ıˆ®†˙∂å¥¿");
		if (Answer.equals("Â´˙")) {
			JOptionPane.showMessageDialog(null, MyBirthday);
		}
		else if (Answer.equals("Ï®ˆ´˜∂")) {
			JOptionPane.showMessageDialog(null, MyFriendsBirthday);
		}
		else if (Answer.equals("ˇ´åç˙´®")) {
			JOptionPane.showMessageDialog(null, MyTeachersBirthday);
		}
		else {
			JOptionPane.showMessageDialog(null, "ˆ Îø˜æ† ‰´µ´µ∫´® ˇ˙å† ∏´®ßø˜æß ıˆ®†˙∂å¥≥");
		}
	}
}