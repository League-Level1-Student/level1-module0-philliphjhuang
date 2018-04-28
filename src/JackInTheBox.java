

import java.applet.AudioClip;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.MalformedURLException;
import java.awt.GridLayout;
import java.awt.event.KeyEvent;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;



	
public class JackInTheBox implements MouseListener {
	JLabel button;
	public static void main(String[] args) {
	new JackInTheBox().getGoing();
	}
	private void getGoing()  {
		// 1. Make a JFrame variable and initialize it using "new JFrame()"
		JFrame x = new JFrame();
		// 2. Make the frame visible
		x.setVisible(true);
		// 3. Set the size of the frame
		x.setSize(500, 500);
		// 4. Set the title of the frame
		x.setTitle("Drum");
		// 5. Make a JPanel and initialize it.
		JPanel y = new JPanel();
		// 6. Add the panel to the frame. (The panel is invisible.)
		x.add(y);
		// 7. Download an image of a drum from the Internet. Drop it into your Eclipse
		// project under "default package".

		// 8. Put the name of your image in a String variable.
		String drum = "drum.jpg";
		
		// 9. Edit the next line to use your String variable
		button = createLabelImage(drum);

		// 10. Add the image to the panel
		y.add(button);

		// 11. Set the layout of the panel to "new GridLayout()"
		y.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		x.pack();
		// 13. add a mouse listener to button.
		button.addMouseListener(this);

	}
	public void mouseClicked(MouseEvent e) {
		
		if (e.getID() == MouseEvent.MOUSE_CLICKED) {
			System.out.println("mouse clicked");
			keyCount = keyCount+1;
		}
		System.out.println(keyCount);
		if(keyCount==5) {
		
		showPicture("jackInTheBox.png");
		playSound("homer-woohoo.wav");
		}
	}
		int keyCount = 0;
	
	private void showPicture(String fileName) { 
	     try {
	          JLabel imageLabel = createLabelImage(fileName);
	          JFrame frame = new JFrame();
	          frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	          frame.add(imageLabel);
	          frame.setVisible(true);
	          frame.pack();
	     } catch (Exception e) {
	          e.printStackTrace();
	     }
	}
	private JLabel createLabelImage(String fileNames) {
	     try {
	          java.net.URL imageURL = getClass().getResource(fileNames);
	          if (imageURL == null) {
	               System.err.println("Could not find image " + fileNames);
	               return new JLabel();
	          } else {
	               Icon icon = new ImageIcon(imageURL);
	               JLabel imageLabel = new JLabel(icon);
	               return imageLabel;
	          }
	     } catch (Exception e) {
	          System.err.println("Could not find image " + fileNames);
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
public void mousePressed(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseReleased(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseEntered(MouseEvent e) {
	// TODO Auto-generated method stub
	
}

@Override
public void mouseExited(MouseEvent e) {
	// TODO Auto-generated method stub
	
}


}


