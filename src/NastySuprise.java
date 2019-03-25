import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class NastySuprise implements ActionListener {
	JButton trick= new JButton("trick");
	JButton treat= new JButton("treat");

public static void main(String[] args) {
	NastySuprise sup= new NastySuprise();
	sup.showButton();
}
public void showButton() {
	
	JFrame bot= new JFrame();
	bot.setVisible(true);	
	bot.add(trick);
	bot.pack();
	bot.add(treat);
	bot.pack();
	trick.addActionListener(this);
	treat.addActionListener(this);

}
public void actionPerformed(ActionEvent e) {
	System.out.println("Button Clicked");
	if(e.getSource()==trick) {
	showPictureFromTheInternet("https://images.unsplash.com/photo-1499195333224-3ce974eecb47?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=500&q=60");
	}
	else if(e.getSource()==treat) {
	showPictureFromTheInternet("https://s3-us-west-1.amazonaws.com/k1w1-aha-blog/uploads-v2/2017/10/scary-co-workers.jpeg");
	}
}
	
private void showPictureFromTheInternet(String imageUrl) {
    try {
         URL url = new URL(imageUrl);
         Icon icon = new ImageIcon(url);
         JLabel imageLabel = new JLabel(icon);
         JFrame frame = new JFrame();
         frame.add(imageLabel);
         frame.setVisible(true);
         frame.pack();
    } catch (MalformedURLException e) {
         e.printStackTrace();
    }
}
}


