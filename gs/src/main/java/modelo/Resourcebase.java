package modelo;

import java.util.Date;

public class Resourcebase {

	private long identificator;
	private long owner;
	private String spacereference;

	// Possible resources in base.

	private float Pmetal;
	private float PCristal;
	private float PCarbone;
	private float Pwater;
	private float Plife;
	private float SolarEnergy;
	private float PFission;
	private float PFusion;

	// Resources in storage

	private long Metal;
	private long Cristal;
	private long Carbone;
	private long Deuterium;
	private long Fissionable;
	private int Energy;
	private int Population;

	// last update of the base
	private Date LastUpdate;	
	private long build_event;
	private Date finishbulding;
	
	//Falta poner la cola
	private String Cola;
	

	private short Store = 0;

	// Level of Mines of resources
	private short MetalMine = 0;
	private short CristalMine = 0;
	private short CarboneMine = 0;
	private short DeuteriumMine = 0;

	private short FissionCentral = 0;
	private short FusionCentral = 0;
	private short SolarCentral = 0;
	private short CarboneCentral = 0;
	private short GeologicalCentral = 0;
	private short PopulationBase = 0;

	// CONSTRUCTORS

	public Resourcebase() {

		this.Pmetal = 0;
		this.PCristal = 0;
		this.PCarbone = 0;
		this.Pwater = 0;
		this.Plife = 0;
		this.SolarEnergy = 0;
		this.PFission = 0;
		this.PFusion = 0;

		this.Store = 0;
		this.Metal = 0;
		this.Cristal = 0;
		this.Carbone = 0;
		this.Deuterium = 0;
		this.Fissionable = 0;
		this.Energy = 0;
		this.Population = 0;
		this.LastUpdate = new Date();
	}

	public Resourcebase(long owner, String spacereference, float Pmetal, float PCristal, float PCarbone, float Pwater, float Plife, float SolarEnergy, float PFission, float PFusion) {

		this.owner = owner;
		this.spacereference = spacereference;

		this.Pmetal = Pmetal;
		this.PCristal = PCristal;
		this.PCarbone = PCarbone;
		this.Pwater = Pwater;
		this.Plife = Plife;
		this.SolarEnergy = SolarEnergy;
		this.PFission = PFission;
		this.PFusion = PFusion;

		this.Store = 0;
		this.Metal = 0;
		this.Cristal = 0;
		this.Carbone = 0;
		this.Deuterium = 0;
		this.Fissionable = 0;
		this.Energy = 0;
		this.Population = 0;
		this.LastUpdate = new Date();

	}

	// FUNCTIONS
	public void IncreaseStore() {

	}

	public void IncreaseMetalMine() {

	}

	public void IncreaseCristalMine() {

	}

	public void IncreaseCarboneMine() {

	}

	public void IncreaseDeuteriumMine() {

	}

	public void IncreaseFissionCentral() {

	}
	public void IncreaseFusionCentral() {

	}
	public void IncreaseSolarCentral() {

	}
	public void IncreaseCarboneCentral() {

	}
	public void IncreaseGeologicalCentral() {

	}
	public void IncreasePopulationBase() {

	}
	
	private boolean IncreaseBuilding(String building){
		
		boolean enough = false;
		
		//Check ability tecnologies
		
		//Calc resources
		
		//check enough resource?
		//if yes delete resources
		
		
		return(enough);
	}
	
	

	// GETS y SETS

	public long getIdentificator() {
		return identificator;
	}

	public void setIdentificator(long identificator) {
		this.identificator = identificator;
	}

	public long getOwner() {
		return owner;
	}

	public void setOwner(long owner) {
		this.owner = owner;
	}

	public long getBuild_event() {
		return build_event;
	}

	public void setBuild_event(long build_event) {
		this.build_event = build_event;
	}

	public Date getFinishbulding() {
		return finishbulding;
	}

	public void setFinishbulding(Date finishbulding) {
		this.finishbulding = finishbulding;
	}

	public String getCola() {
		return Cola;
	}

	public void setCola(String cola) {
		Cola = cola;
	}

	public String getSpacereference() {
		return spacereference;
	}

	public void setSpacereference(String spacereference) {
		this.spacereference = spacereference;
	}

	public short getStore() {
		return Store;
	}

	public void setStore(short store) {
		Store = store;
	}

	public float getPmetal() {
		return Pmetal;
	}

	public void setPmetal(float pmetal) {
		Pmetal = pmetal;
	}

	public float getPCristal() {
		return PCristal;
	}

	public void setPCristal(float pCristal) {
		PCristal = pCristal;
	}

	public float getPCarbone() {
		return PCarbone;
	}

	public void setPCarbone(float pCarbone) {
		PCarbone = pCarbone;
	}

	public float getPwater() {
		return Pwater;
	}

	public void setPwater(float pwater) {
		Pwater = pwater;
	}

	public float getPlife() {
		return Plife;
	}

	public void setPlife(float plife) {
		Plife = plife;
	}

	public float getSolarEnergy() {
		return SolarEnergy;
	}

	public void setSolarEnergy(float solarEnergy) {
		SolarEnergy = solarEnergy;
	}

	public float getPFission() {
		return PFission;
	}

	public void setPFission(float pFission) {
		PFission = pFission;
	}

	public float getPFusion() {
		return PFusion;
	}

	public void setPFusion(float pFusion) {
		PFusion = pFusion;
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

	public Date getLastUpdate() {
		return LastUpdate;
	}

	public void setLastUpdate(Date lastUpdate) {
		LastUpdate = lastUpdate;
	}

	public short getMetalMine() {
		return MetalMine;
	}

	public void setMetalMine(short metalMine) {
		MetalMine = metalMine;
	}

	public short getCristalMine() {
		return CristalMine;
	}

	public void setCristalMine(short cristalMine) {
		CristalMine = cristalMine;
	}

	public short getCarboneMine() {
		return CarboneMine;
	}

	public void setCarboneMine(short carboneMine) {
		CarboneMine = carboneMine;
	}

	public short getDeuteriumMine() {
		return DeuteriumMine;
	}

	public void setDeuteriumMine(short deuteriumMine) {
		DeuteriumMine = deuteriumMine;
	}

	public short getFissionCentral() {
		return FissionCentral;
	}

	public void setFissionCentral(short fissionCentral) {
		FissionCentral = fissionCentral;
	}

	public short getFusionCentral() {
		return FusionCentral;
	}

	public void setFusionCentral(short fusionCentral) {
		FusionCentral = fusionCentral;
	}

	public short getSolarCentral() {
		return SolarCentral;
	}

	public void setSolarCentral(short solarCentral) {
		SolarCentral = solarCentral;
	}

	public short getCarboneCentral() {
		return CarboneCentral;
	}

	public void setCarboneCentral(short carboneCentral) {
		CarboneCentral = carboneCentral;
	}

	public short getGeologicalCentral() {
		return GeologicalCentral;
	}

	public void setGeologicalCentral(short geologicalCentral) {
		GeologicalCentral = geologicalCentral;
	}

	public short getPopulationBase() {
		return PopulationBase;
	}

	public void setPopulationBase(short populationBase) {
		PopulationBase = populationBase;
	}

}
