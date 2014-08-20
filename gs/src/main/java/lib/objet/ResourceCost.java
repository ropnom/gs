package lib.objet;

public class ResourceCost extends ResourcesBase{
	
	protected long time = 0;
	
	public ResourceCost() {
		super();
		ResourceCost.setnumrecourses((short) 9);
	}
	public long getTime() {
		return time;
	}
	public void setTime(long time) {
		this.time = time;
	}
	
	public long TotalCost(){
		return(this.Metal + this.Cristal + this.Carbone + this.Deuterium + this.Fissionable + this.Energy + this.Population);
	}

	
}
