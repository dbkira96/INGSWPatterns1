package it.unical.mat.INGSW2019.PatternEs1.GameInterface;

import it.unical.mat.INGSW2019.PatternEs1.GameLogic.House;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.Mall;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.Road;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.SnowHouse;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.SnowMall;
import it.unical.mat.INGSW2019.PatternEs1.GameLogic.SnowRoad;

public class SnowMenu extends Menu {

	@Override
	public House makeHouse() {
		
		return new SnowHouse();
	}

	@Override
	public Road makeRoad() {
	
		return new SnowRoad();
	}

	@Override
	public Mall makeMall() {
	
		return new SnowMall();
	}
	
}
