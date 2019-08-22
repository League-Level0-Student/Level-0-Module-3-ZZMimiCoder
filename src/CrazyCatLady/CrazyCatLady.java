package CrazyCatLady;
import java.net.URI;
import javax.swing.JOptionPane;
public class CrazyCatLady {
	public static void main(String[] Args) {
		int Number = Integer.parseInt(JOptionPane.showInputDialog("How Many Cats Do You Have?"));
		if (Number > 2) {
			System.out.println("You're A Crazy Cat Lady");
		}
		else if (Number < 3 && Number > 0) {
			PlayVideo("https://www.youtube.com/watch?v=fJbhvdDEiNU");
		}
		else {
			PlayVideo("https://www.youtube.com/watch?v=vFWliBQWLII****");
		}	
	}
	static void PlayVideo(String VideoURL) {
		try {
			URI Uri = new URI(VideoURL);
			java.awt.Desktop.getDesktop().browse(Uri);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}
}
