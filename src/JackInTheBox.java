

import java.applet.AudioClip;
import java.awt.event.KeyListener;
import java.awt.event.KeyEvent;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;



	
public class JackInTheBox implements KeyListener {

	public void keyPressed(KeyEvent e) {
		System.out.println("Pressed");
		
	}
	public static void main(String[] args) {
		JackInTheBox JINB = new JackInTheBox();
		JINB.showPicture();
	}
	
	private void showPicture(String Jack) { 
	     try {
	    	 
	          JLabel Hi = createLabelImage(Jack);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(Hi);
	          frame.setVisible(true);
	          JButton button = new JButton("Surprise");
	          button.addKeyListener((KeyListener) this);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String JackInTheBox) {
	     try {
	          java.net.URL imageURL = getClass().getResource("jackInTheBox.png");
	          if (imageURL == null) {
	               System.err.println("Could not find image " + JackInTheBox);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + JackInTheBox);
	          return new JLabel();
	     }
	}
	
	
	
	
	
	
	


private void playSound(String sound1) { 
    try {
         AudioClip sound = JApplet.newAudioClip(getClass().getResource("homer-woohoo.wav"));
         sound.play();
    } catch (Exception e) {
         e.printStackTrace();
    }
}
@Override
public void keyTyped(KeyEvent e) {
	// TODO Auto-generated method stub
	
}
@Override
public void keyReleased(KeyEvent e) {
	// TODO Auto-generated method stub

}

}


