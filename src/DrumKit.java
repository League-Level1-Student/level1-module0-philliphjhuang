/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 1
 */

import java.applet.AudioClip;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class DrumKit extends MouseAdapter {

	JLabel drumLabelWithImage;
	JLabel drum2LabelWithImage;
	public static void main(String[] args) throws Exception {
		new DrumKit().getGoing();
	}

	private void getGoing() throws MalformedURLException {
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
		String drum2 = "drum2.jpg";
		// 9. Edit the next line to use your String variable
		drumLabelWithImage = createLabelImage(drum);
		drum2LabelWithImage = createLabelImage(drum2);
		// 10. Add the image to the panel
		y.add(drumLabelWithImage);
		y.add(drum2LabelWithImage);
		// 11. Set the layout of the panel to "new GridLayout()"
		y.setLayout(new GridLayout());
		// 12. call the pack() method on the frame
		x.pack();
		// 13. add a mouse listener to drumLabelWithImage.
		drumLabelWithImage.addMouseListener(this);
		drum2LabelWithImage.addMouseListener(this);
	}

	public void mouseClicked(MouseEvent e) {
		// 14. When the mouse is clicked, print "mouse clicked"
		if (e.getID() == MouseEvent.MOUSE_CLICKED) {
			System.out.println("mouse clicked");
		}

		JLabel drumClicked = (JLabel) e.getSource();
		// 15. Download a drum sound and drop it into your "default package". You can
		// find it on freesound.org. To download it, log in as
		// leagueofamazing/code4life.

		// 16. If they clicked on the drumImage...
		if (drumClicked == drumLabelWithImage) {
			playSound("drumm.wav");

			// 17. ...use the playSound method to play a drum sound.
		} else if(drumClicked == drum2LabelWithImage) {
			playSound("cymbal.wav");
		}
		// 18. Add more images to make a drumkit. Remember to add a mouse listener to
		// each one.

	}

	private JLabel createLabelImage(String drum) throws MalformedURLException {
		URL imageURL = getClass().getResource(drum);
		if (imageURL == null) {
			System.err.println("Could not find image " + drum);
			return new JLabel();
		}
		Icon icon = new ImageIcon(imageURL);
		JLabel imageLabel = new JLabel(icon);
		return imageLabel;
	}

	private void playSound(String drumSound) {
		URL soundURL = getClass().getResource(drumSound);
		if (soundURL == null) {
			System.err.println("Could not find sound " + drumSound);
		}
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(drumSound));

		sound.play();
	}

}
