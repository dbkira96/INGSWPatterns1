package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import it.unical.mat.INGSW2019.PatternEs1.GameLogic.DesertHouse;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.DesertMall;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.House;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.Mall;


public class DesertMenu extends Menu {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public House makeHouse() {
		
		return new DesertHouse();
	}

	@Override
	public Mall makeMall() {
		
		return new DesertMall();
	}
	
	
}
