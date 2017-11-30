package button;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class ButtonFrame extends JFrame {
	private JPanel buttonPanel;
	private static final int DEFAULT_WIDTH = 300;

	private static final int DEFAULT_HEIGHT = 200;

	public static int counter = 1;

	public ButtonFrame() {
		setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);

		// create buttons
		JButton changeButton = new JButton("Change");
		JButton resetButton = new JButton("Reset");
		JButton closeButton = new JButton("Close");

		buttonPanel = new JPanel();

		// add buttons to panel
		buttonPanel.add(changeButton);
		buttonPanel.add(resetButton);
		buttonPanel.add(closeButton);

		// add panel to frame
		add(buttonPanel);

		// create button actions
		ColorAction changeAction = new ColorAction(Color.BLACK);
		CloseWindow closeAction = new CloseWindow();
		ResetAction resetAction = new ResetAction();

		// associate actions with buttons
		changeButton.addActionListener(changeAction);
		resetButton.addActionListener(resetAction);
		closeButton.addActionListener(closeAction);

	}

	/* An action listener that sets the panel's background color */
	private class ColorAction implements ActionListener {
		private Color backgroundColor;

		public ColorAction(Color c) {
			backgroundColor = c;
		}

		public void actionPerformed(ActionEvent event) {

			if (1 % counter == 0) {
				backgroundColor = Color.BLACK;
			} else if (2 % counter == 0) {
				backgroundColor = Color.GREEN;
			} else if (3 % counter == 0) {
				backgroundColor = Color.ORANGE;
			} else if (4 % counter == 0) {
				backgroundColor = Color.PINK;
				counter = 0;
			}

			buttonPanel.setBackground(backgroundColor);
			counter++;

		}
	}
}

class CloseWindow implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		System.exit(0);
	}
}

class ResetAction implements ActionListener {
	public void actionPerformed(ActionEvent e) {
		ButtonFrame.counter = 1;
	}
}