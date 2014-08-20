package lib.interf;

import lib.objet.CostObjet;
import lib.objet.ElementGame;
import modelo.User;

public interface GetBuildfunctions {
	
	public CostObjet GetCostElement(ElementGame element, User user);
	public CostObjet CostSpaceFly(ElementGame element, User user);

}
