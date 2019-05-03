import java.awt.event.KeyListener;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TypingTutor {
	char currentLetter = generateRandomLetter();

	
public static void main(String[] args) {
}

void type() {
	JFrame frame= new JFrame();
	frame.setVisible(true);
	frame.pack();
	JLabel label= new JLabel();
label.add(frame);
	label.equals(currentLetter);
	label.setFont(label.getFont().deriveFont(28.0f));
	label.setHorizontalAlignment(JLabel.CENTER);
	frame.addKeyListener(null);
	label.resetKeyboardActions();
	label.updateUI();
	
	
	
}
void KeyReleased() {

	
}

char generateRandomLetter() {
    Random r = new Random();
    return (char) (r.nextInt(26) + 'a');
}

}

