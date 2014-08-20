package lib.objet;

public class ResourcesTransportables {

	// Resources in storage
	protected long Metal = 0;
	protected long Cristal  = 0;
	protected long Carbone = 0;
	protected long Deuterium = 0;
	protected long Fissionable = 0;
	
	public ResourcesTransportables(){
		
	}
	
	public long getMetal() {
		return Metal;
	}
	public void setMetal(long metal) {
		Metal = metal;
	}
	public long getCristal() {
		return Cristal;
	}
	public void setCristal(long cristal) {
		Cristal = cristal;
	}
	public long getCarbone() {
		return Carbone;
	}
	public void setCarbone(long carbone) {
		Carbone = carbone;
	}
	public long getDeuterium() {
		return Deuterium;
	}
	public void setDeuterium(long deuterium) {
		Deuterium = deuterium;
	}
	public long getFissionable() {
		return Fissionable;
	}
	public void setFissionable(long fissionable) {
		Fissionable = fissionable;
	}

}
