package lib.objet;

public class ResourcesBase extends ResourcesTransportables{

	// Resources in base
	protected long money=0;
	protected int Energy = 0;
	protected int Population = 0;
	

	public ResourcesBase()
	{
		super();
		ResourcesBase.setnumrecourses((short) 8);
		
	}
	
	
	public long getMoney() {
		return money;
	}

	public void setMoney(long money) {
		this.money = money;
	}

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

	

}
