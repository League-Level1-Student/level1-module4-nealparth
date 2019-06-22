import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {

	JPanel panel= new JPanel();
	JButton button1= new JButton();
	void Gui() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setSize(1, 1);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		
		

		frame.add(panel);
		frame.pack();
		//drawButtons(new Random().nextInt(20));
		
	}
	void drawButtons(int random) {
	for(int i=0;i<20;i++) {

		panel.add(button1);
		button1.addActionListener(this);
		if(i==random) {
			button1.setText("mole");
			
		}
		
			}
		
	}
	public void actionPerformed(ActionEvent e) {
		JButton buttonPressed = (JButton) e.getSource();
if(buttonPressed.equals(button1)) {
	JOptionPane.showMessageDialog(null, "you hit it");
}
else {
	JOptionPane.showMessageDialog(null, "you missed");
}
	}
}
