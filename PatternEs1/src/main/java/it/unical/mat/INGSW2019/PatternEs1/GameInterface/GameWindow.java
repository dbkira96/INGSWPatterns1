package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import java.awt.EventQueue;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

import it.unical.mat.INGSW2019.PatternEs1.GameLogic.GameManager;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.GameObject;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JDialog;

public class GameWindow {
	
	private static int GameType=1;
	private JFrame frame;

	public GameWindow() {		
		initialize();
	}
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 850, 660);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		final JPanel Grid = new JPanel();
		Grid.setBackground(Color.WHITE);
		Grid.setBounds(10, 10, 600, 600);
		Grid.addMouseListener(new MouseAdapter() {

			@Override
			public void mousePressed(MouseEvent e) {
				GameObject ts = GameManager.getInstance().getToInsert();
				if(ts!=null) {
					JLabel lbl = ts.makeLabel();
					lbl.setBounds(e.getX()-(e.getX()%100), e.getY()-(e.getY()%100), 100, 100);
					Grid.add(lbl);
					Grid.repaint();
				}
				
			}
			
		});
		frame.getContentPane().add(Grid);
		
		
		Menu m;
		
		if (GameType==0)
			m= new Menu();
		else if (GameType==1)
			m=new DesertMenu();
		else
			m=new SnowMenu();
		frame.getContentPane().add(m);
		frame.setVisible(true);
	}
}
