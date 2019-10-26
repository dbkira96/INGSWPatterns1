package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import java.util.LinkedList;

import javax.swing.JPanel;

import it.unical.mat.INGSW2019.PatternEs1.GameLogic.GameObject;

public class Grid extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private LinkedList<GameObject> objects;
	
	private static int squareSize=100;
	
	public Grid() {
		setBounds(10, 10, 600, 600);
	}
	 public void addObject(GameObject o, int row,int column) {
		 
	 }

}
