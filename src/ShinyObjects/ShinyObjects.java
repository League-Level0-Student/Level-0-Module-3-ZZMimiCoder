package ShinyObjects;
import java.applet.AudioClip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.JApplet;
import javax.swing.JOptionPane;
public class ShinyObjects {
	public static void main(String[] args) {
		int Times = Integer.parseInt(JOptionPane.showInputDialog("How Many Shiny Objects?"));
		for (int X = 0; X < Times; X++) {
			PlaySound();
		}
	}
	public static void PlaySound() {
		try {
			AudioClip Sound = JApplet.newAudioClip(ShinyObjects.class.getResource("ShinyObjects.wav"));
			Sound.play();
			Thread.sleep(3400);
		} catch (Exception Ex) {
			Ex.printStackTrace();
		}
	}
}
