package lib.manager;

import lib.Constants;
import lib.vars;
import lib.objet.ElementGame;
import lib.objet.ResourceCost;
import modelo.User;

public class GetBuildfunctions {

	public synchronized static ResourceCost GetCostElement(short element, User user, short nano, short robot, short hangar, short laboratory) {
		
		//variables
		ResourceCost coste = new ResourceCost();
		long costetotal;
		
		
		//Resource cost
		coste.setMetal(CostAlgorith(vars., float factor, short level, boolean islevel));
		coste.setCristal(cristal);
		coste.setCarbone(carbone);
		coste.setDeuterium(deuterium);
		coste.setFissionable(fissionable);
		coste.setMoney();
		coste.setPopulation();

		return null;
	}
	
	private long CostAlgorith(int base, float factor, short level, boolean islevel)
	{
		long expense = 0;
		
		if(islevel){			
			expense = (long)(base * Math.pow(factor,level));			
		}else{		
			//falta implementar tecnologias extra
			expense = (long)base ;	
		}
		
		return expense;
	}

	public ResourceCost CostSpaceFly(short element, User user) {
		// TODO Auto-generated method stub
		return null;
	}

	public boolean Isabaialable(ElementGame element, User user, short nano, short robot, short hangar, short laboratory) {
		// TODO Auto-generated method stub
		return false;
	}

	public ResourceCost getCoste() {
		return coste;
	}

	public void setCoste(ResourceCost coste) {
		this.coste = coste;
	}

	public long getCostetotal() {
		return costetotal;
	}

	public void setCostetotal(long costetotal) {
		this.costetotal = costetotal;
	}

}
