package it.unical.mat.INGSW2019.PatternEs1.GameLogic;

import java.awt.EventQueue;

import it.unical.mat.INGSW2019.PatternEs1.GameInterface.GameWindow;

public class GameManager {
	private static String GameType="Normal";
	protected static GameManager singleton =null;
	public static GameWindow window;
	private GameObject toInsert=null;
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					 window = new GameWindow();
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static GameManager getInstance() {
		if(singleton==null)
			singleton = new GameManager();
		return singleton;
	}

	public GameObject getToInsert() {
		return toInsert;
	}

	public void setToInsert(GameObject toInsert) {
		this.toInsert = toInsert;
	}
	
}
