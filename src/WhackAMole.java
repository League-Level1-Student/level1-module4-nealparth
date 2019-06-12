import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class WhackAMole implements ActionListener {
JButton button= new JButton();
JButton button1= new JButton();
JButton button2= new JButton();


	void Gui() {
		JFrame frame= new JFrame();
		frame.setVisible(true);
		frame.setSize(1, 1);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		JPanel panel= new JPanel();
		panel.add(button);
		panel.add(button1);
		panel.add(button2);
		button.addActionListener(this);
		button1.addActionListener(this);
		button2.addActionListener(this);


		frame.add(panel);
		frame.pack();
		
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
