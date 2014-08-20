package lib.objet;

public class CostObjet extends BaseResources{
	
	protected long money=0;
	protected long time = 0;
	
	public CostObjet() {
		super();
	}
	public long getMoney() {
		return money;
	}
	public void setMoney(long money) {
		this.money = money;
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}

	
}
