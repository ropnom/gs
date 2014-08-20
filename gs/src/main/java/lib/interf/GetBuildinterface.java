package lib.interf;

import lib.objet.ResourceCost;
import lib.objet.ElementGame;
import modelo.User;

public interface GetBuildinterface {
	
	public ResourceCost GetCostElement(short element, User user, short nano, short robot, short hangar, short laboratory);
	
	public ResourceCost CostSpaceFly(short element, User user);
	
	public boolean Isabaialable(ElementGame element, User user, short nano, short robot, short hangar, short laboratory);

}
