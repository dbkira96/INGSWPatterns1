package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class GameWindow {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameWindow window = new GameWindow();
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
	public GameWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel Grid = new JPanel();
		Grid.setBounds(10, 10, 600, 600);
		frame.getContentPane().add(Grid);
		
		Menu m = new Menu();
		
		frame.getContentPane().add(m);
	}
}
