package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import it.unical.mat.INGSW2019.PatternEs1.GameLogic.GameManager;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.GameObject;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.House;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.Mall;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.Road;

public class Menu extends JPanel {

	/**
	 * 
	 */
	private static int posX=620;
	private static int posY=10;
	private static int width=200;
	private static int height=600;
	
	private static final long serialVersionUID = 1L;
	
	public Menu(){
		super();
		initialize();
		
	}
	public void initialize() {
		setBackground(Color.WHITE);
		setBounds(posX, posY, width, height);
		
		
		JLabel lbl = makeHouse().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
             public void mousePressed(MouseEvent e) {
                GameManager.getInstance().setToInsert( makeHouse());
             }
		} );
		add(lbl);
		
		lbl = makeRoad().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
            public void mousePressed(MouseEvent e) {
               GameManager.getInstance().setToInsert( makeRoad());
            }
		} );
		add(lbl);
		lbl = makeMall().makeLabel();
		lbl.addMouseListener(new MouseAdapter() {
			 @Override
            public void mousePressed(MouseEvent e) {
               GameManager.getInstance().setToInsert( makeMall());
            }
		} );
		add(lbl);
	
	}
		
	
	public House makeHouse() {
		return new House();
	}
	public Road makeRoad() {
		return new Road();
	}
	public Mall makeMall() {
		return new Mall();
	}
	
}
