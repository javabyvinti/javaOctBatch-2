package javaclass;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FirstFile {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FirstFile window = new FirstFile();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FirstFile() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("First");
		rdbtnNewRadioButton.setBounds(111, 68, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("Second");
		rdbtnNewRadioButton_1.setBounds(111, 95, 109, 23);
		frame.getContentPane().add(rdbtnNewRadioButton_1);
		
		JButton btnClickHere = new JButton("Click Here");
		
		btnClickHere.addActionListener(new ActionListener() { //Event Listener
			
			public void actionPerformed(ActionEvent e) { //Event Handler
				System.out.println("You clicked on Button");
			}
		});
		btnClickHere.setBounds(167, 154, 142, 23);
		frame.getContentPane().add(btnClickHere);
	}
}
