import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {
 String d;
public static void main(String[] args) {
	

}

void makeButtons() {

	
	System.out.println(d);
	JFrame frame= new JFrame();
	frame.setVisible(true);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	frame.pack();
	JPanel panel= new JPanel();
	frame.add(panel);
	JButton button1= new JButton("joke");
	JButton button2= new JButton("punchline");
	panel.add(button1);
	frame.pack();
	panel.add(button2);
	frame.pack();
	button1.addActionListener(this);
	button2.addActionListener(this);
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	
}
}
