import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {

	public void showButton() {

		System.out.print("Button");
		JFrame frame = new JFrame();
		frame.setVisible(true);
		JButton button = new JButton("Fortune");
		frame.add(button);
		frame.pack();
		button.addActionListener(this);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

	public static void main(String[] args) {
		FortuneCookie fc = new FortuneCookie();
		fc.showButton();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null, "Woohoo");
		int rand = new Random().nextInt(5);
		
		if (rand == 0) {
			JOptionPane.showMessageDialog(null, "Something bad will happen to you today.");
		} else if (rand == 1) {
			JOptionPane.showMessageDialog(null, "Today will be a peaceful day for you.");
		} else if (rand == 2) {
			JOptionPane.showMessageDialog(null, "Today you are the lucky star!");
		} else if (rand == 3) {
			JOptionPane.showMessageDialog(null, "You will have the worst luck for the rest of the year.");
		} else {
			JOptionPane.showMessageDialog(null, "Nothing will happen to you.");
		}
	}
}
