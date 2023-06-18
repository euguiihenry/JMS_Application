package app.view;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.jms.*;

public class Error {
	/* Global Variables:
	=========================================================================================*/
		private JFrame frame = new JFrame("Error Message");
		
	/* Methods:
	=========================================================================================*/
		public void showError(JMSException e) {
			this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			JOptionPane.showMessageDialog(frame, "An error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		public void showMessage(String message) {
			this.frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
			JOptionPane.showMessageDialog(frame, message);
		}
}
