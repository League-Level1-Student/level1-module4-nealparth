import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class PracticeTest {
	JButton button1= new JButton();
	JButton button2= new JButton();
 void riddle() {
	 JFrame frame= new JFrame();
	 frame.setVisible(true);
	 frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	 JLabel label= new JLabel();
	 frame.add(label);
	 JTextField field= new JTextField();
	 frame.add(field);
	 frame.add(button1);
	 frame.add(button2);
	 
	 
 }
}
