package fortune_teller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {

JButton button1 = new JButton("add");
JButton button2= new JButton("sub");
int textfield;
int textfield1;
JTextField field = new JTextField(12);
JTextField field1= new JTextField(12);
void calculator1() {
	JPanel panel= new JPanel();
	JFrame frame= new JFrame();
	frame.add(panel);

	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	panel.add(button1);
	panel.add(button2);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button1.setSize(1, 1);
	button2.setSize(1,1);
	panel.add(field);
	panel.add(field1);

	 frame.setVisible(true);
	 frame.pack();
}

	public int add(int one1,int two1) {
		
		int three= one1 + two1;
		return three;
		
		
	}
	public int subtract(int one3, int one4) {
		int five= one3 - one4;
		return five;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		String text= field.getText();
		String text1= field1.getText();
		 textfield= Integer.parseInt(text);
		 textfield1= Integer.parseInt(text1);
		if(button1.equals(e)) {
			int added=	add(textfield,textfield1);
		}
		else if (button2.equals(e)) {
			int subtract= subtract(textfield,textfield1);
		}
		
	} 
	
	}
