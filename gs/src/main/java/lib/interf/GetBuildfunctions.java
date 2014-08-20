package lib.interf;

import lib.objet.ResourceCost;
import lib.objet.ElementGame;
import modelo.User;

public interface GetBuildfunctions {
	
	public ResourceCost GetCostElement(ElementGame element, User user);
	public ResourceCost CostSpaceFly(ElementGame element, User user);

}
