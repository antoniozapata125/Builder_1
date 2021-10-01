package Drinks;

import Acces.Bottle;
import Interfa.Item;
import Interfa.Packing;

public abstract class ColdDrink implements Item {
	
	@Override
	public Packing packing() {
		return new Bottle();
	}
	@Override
	public abstract float price();

}
