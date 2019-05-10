package fortune_teller;

/*
 *    Copyright (c) The League of Amazing Programmers 2013-2019
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.Random;

import javax.imageio.ImageIO;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class FortuneTeller extends JPanel implements Runnable, MouseListener {

    JFrame frame = new JFrame();

    int frameWidth = 400;
    int frameHeight = 200;

    FortuneTeller() throws Exception {
    	frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
   	 // 1. Choose an image for your fortune teller and put it in your default package
   	 fortuneTellerImage = ImageIO.read(getClass().getResource("download.jpg"));
   	 // 2. Adjust the frameWidth and frameHeight variables to fit your image nicely (doesn’t need a new line of code)
     // 3. Complete the begin() method in the FortuneTellerRunner class
 	 // 4. add a mouse listener to the frame
   	 frame.addMouseListener(this);

    }



    @Override
    public void mousePressed(MouseEvent e) {
   	 int mouseX = e.getX();
   	 int mouseY = e.getY();
   	 // 5. Print the mouseX variable
System.out.println(mouseX);
System.out.println(mouseY);
   	 // 6. Add the mouseY variable to the previous line so that it prints out too (no new line)
   	 // 7. Adjust your secret location co-ordinates here:
   	 int secretLocationX = 172;
   	 int secretLocationY = 172;
   	 /** If the mouse co-ordinates and secret location are close, we'll let them ask a question. */
   	 if (areClose(mouseX, secretLocationX) && areClose(mouseY, secretLocationY)) {
   		 
   		 // 8. Get the user to enter a question for the fortune teller
String ask= JOptionPane.showInputDialog("ask a question");
   		 // 9. Find a spooky sound and put it in your default package (freesound.org)
   		  AudioClip sound = JApplet.newAudioClip(getClass().getResource("creepy-noise.wav"));
   		
   		 // 10. Play the sound
   		  sound.play();
   		 // 11. Use the pause() method below to wait until your music has finished
pause(5);
if(ask.equals("I'm scared")) {
	JOptionPane.showMessageDialog(null, "you should be");
}
else {
	JOptionPane.showMessageDialog(null, "What are you saying?");
}
class Magic8Ball {
public void main(String[] args) {
	int rand= new Random().nextInt(4);
	System.out.println(rand);
	String ball= JOptionPane.showInputDialog("what is the number");
	if(rand==0){
		JOptionPane.showMessageDialog(null, "Yes");
	}
	else if (rand==1){
		JOptionPane.showMessageDialog(null, "No");
}
	else if (rand==2) {
		JOptionPane.showMessageDialog(null, "Maybe you should ask Google");
	}
	else if (rand==3) {
		JOptionPane.showMessageDialog(null, "Give up");

	}
	
}
}




   		 }

   	 }

   

    private boolean areClose(int mouseX, int secretLocationX) {
   	 return mouseX < secretLocationX + 15 && mouseX > secretLocationX - 15;
    }

    private void pause(int seconds) {
   	 try {
   		 Thread.sleep(1000 * seconds);
   	 } catch (InterruptedException e) {
   		 e.printStackTrace();
   	 }
    }
    
    /**************** don't worry about the stuff under here *******************/
    
    BufferedImage fortuneTellerImage;



    @Override
    public void run() {
   	 frame.add(this);
   	 setPreferredSize(new Dimension(frameWidth, frameHeight));
   	 frame.pack();
   	 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   	 frame.setResizable(false);
   	 frame.setVisible(true);
    }

private void showAnotherImage(String imageName) {
   	 try {
   		 fortuneTellerImage = ImageIO.read(getClass().getResource(imageName));
   	 } catch (Exception e) {
   		 System.err.println("Couldn't find this image: " + imageName);
   	 }
   	 repaint();
    }

    @Override
    public void paintComponent(Graphics g) {
   	 g.drawImage(fortuneTellerImage, 0, 0, null);
    }

    @Override
    public void mouseClicked(MouseEvent e) {}

    @Override
    public void mouseReleased(MouseEvent e) {}

    @Override
    public void mouseEntered(MouseEvent e) {}

    @Override
    public void mouseExited(MouseEvent e) {}

}

// Copyright The League, 2016




