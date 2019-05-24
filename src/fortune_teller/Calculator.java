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
JButton button3= new JButton("mul");
JButton button4= new JButton("div");
int textfield;
int textfield1;
JTextField field = new JTextField(12);
JTextField field1= new JTextField(12);
JLabel label= new JLabel();

void calculator1() {
	JPanel panel= new JPanel();
	JFrame frame= new JFrame();
	frame.add(panel);

	frame.setSize(300, 300);
	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
	panel.add(button1);
	panel.add(button2);
	panel.add(button3);
	panel.add(button4);
	button1.addActionListener(this);
	button2.addActionListener(this);
	button3.addActionListener(this);
	button4.addActionListener(this);
	button1.setSize(1, 1);
	button2.setSize(1,1);
	button3.setSize(1,1);
	button4.setSize(1,1);
	panel.add(field);
	panel.add(field1);
	panel.add(label);
	


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
	public int multiply(int one6, int one7) {
		int eight= one6 * one7;
		return eight;
		
	}
	public int divide(int one9, int one10) {
		int eleven= one9/one10;
		return eleven;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton ButtonPressed= (JButton) e.getSource();
		String text= field.getText();
		String text1= field1.getText();
		 textfield= Integer.parseInt(text);
		 textfield1= Integer.parseInt(text1);
		 int added;
		 int subtract;
		 int multiply;
		 int divide;
	int answer;
	
		 if(ButtonPressed.equals(button1)) {
		 added=	add(textfield,textfield1);
			answer= added;
		}
		else if (ButtonPressed.equals(button2)) {
			 subtract= subtract(textfield,textfield1);
			 answer= subtract;
		}
		else if(ButtonPressed.equals(button3)) {
			 multiply= multiply(textfield, textfield1);
			 answer= multiply;
		}
		else if(ButtonPressed.equals(button4)) {
			 divide= divide(textfield, textfield1);
			 answer= divide;
		}
		
		label.add(ButtonPressed);
		
	} 
	
	}
