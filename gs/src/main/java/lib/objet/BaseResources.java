package lib.objet;

public class BaseResources extends TransportResources{

	// Resources in base
	protected int Energy = 0;
	protected int Population = 0;
	
	public int getEnergy() {
		return Energy;
	}

	public void setEnergy(int energy) {
		Energy = energy;
	}

	public int getPopulation() {
		return Population;
	}

	public void setPopulation(int population) {
		Population = population;
	}

	public BaseResources()
	{
		super();
		
	}
	

}
