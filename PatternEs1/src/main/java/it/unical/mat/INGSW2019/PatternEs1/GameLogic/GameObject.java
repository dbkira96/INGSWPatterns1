package it.unical.mat.INGSW2019.PatternEs1.GameLogic;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

public abstract class GameObject {
	
	
	
	public String imgFile() {
		return "stub.png";
	}
	public JLabel makeLabel() {
		JLabel lbl = new JLabel("");
		lbl.setIcon(new ImageIcon(getClass().getResource("../../../../../../"+imgFile())));
		return lbl;
	}
}
