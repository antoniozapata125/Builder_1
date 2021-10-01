package Burgers;

import Acces.Wrapper;
import Interfa.Item;
import Interfa.Packing;

public abstract class Burger implements Item {

@Override
public Packing packing() {
	return new Wrapper();
}
@Override
public abstract float price();

}
