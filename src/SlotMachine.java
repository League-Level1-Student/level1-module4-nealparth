import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Random;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class SlotMachine implements ActionListener {
	String cherry = "download.jpg";
	String orange = "download-1.jpg";
	String lime = "download-2.jpg";

	JLabel label1;
	JLabel label2;
	JLabel label3;
	JPanel panel;
	JButton button1 = new JButton("Spin");
	JFrame frame= new JFrame();

	private JLabel createLabelImage(String fileName) {
		URL imageURL = getClass().getResource(fileName);
		if (imageURL == null) {
			System.err.println("Could not find image " + fileName);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	void reels() {
	 frame = new JFrame();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
		frame.setSize(200, 200);
		panel = new JPanel();
		frame.add(panel);

		label1 = createLabelImage(cherry);

		label2 = createLabelImage(orange);

		label3 = createLabelImage(lime);
		button1.addActionListener(this);

		panel.add(label1);
		panel.add(label2);
		panel.add(label3);
		panel.add(button1);

		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		int random= new Random().nextInt(3);
		
		if(random==0) {
			panel.add(label1);
		}
		else if(random==1) {
			panel.add(label2);
		}
		else if(random==2) {
			panel.add(label3);
		}
		frame.pack();
	}
}
