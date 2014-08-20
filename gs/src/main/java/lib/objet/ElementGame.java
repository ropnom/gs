package lib.objet;

import java.util.ArrayList;
import java.util.List;

import com.sun.research.ws.wadl.Request;

public class ElementGame {
	// each element of the game, the smallest unit, a ship, a defense, a bulding
	// etc...7

	private short identificador;
	private String name;
	private String descripcion;

	// cost of element
	private int Metal = 0;
	private int Cristal = 0;
	private int Carbone = 0;
	private int Deuterium = 0;
	private int Fissionable = 0;
	private int Energy = 0;
	private int Population = 0;

	// type of element and facto increase with level
	private short type = 0;
	private float factor = 1;

	// requeriments
	private List<Requirement> requirements;
	private String requirements_S;

	// image folder
	private String folder;

	public ElementGame() {
		this.identificador = -1;
		this.name = "New element without name";
		this.descripcion = "This element not have description";
		this.requirements = new ArrayList<Requirement>();
		this.folder = "Not found";
	}

	public ElementGame(short identificador, String name, String descripcion, String folder) {
		
		this.identificador = identificador;
		this.name = name;
		this.descripcion = descripcion;
		this.requirements = new ArrayList<Requirement>();
		this.folder = folder;
	}

	// Put resources cost
	public void putPrizes(int metal, int cristal, int deuterium, int carbone, int fissionable, int energy, int population) {
		this.Metal = metal;
		this.Cristal = cristal;
		this.Carbone = carbone;
		this.Deuterium = deuterium;
		this.Fissionable = fissionable;
		this.Energy = energy;
		this.Population = population;
	}
	
	public void putPropierties(short type, float factor){
		this.type = type;
		this.factor = factor;
	}

	// realizar checkd e tecnologia y de si existe ya el requisito para BBDD.
	public void addRequirement(Requirement a) {
		this.requirements.add(a);
	}

	public short getIdentificador() {
		return identificador;
	}

	public void setIdentificador(short identificador) {
		this.identificador = identificador;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public List<Requirement> getRequirements() {
		return requirements;
	}

	public void setRequirements(List<Requirement> requirements) {
		this.requirements = requirements;
	}

	public String getFolder() {
		return folder;
	}

	public void setFolder(String folder) {
		this.folder = folder;
	}

	public int getMetal() {
		return Metal;
	}

	public void setMetal(int metal) {
		Metal = metal;
	}

	public int getCristal() {
		return Cristal;
	}

	public void setCristal(int cristal) {
		Cristal = cristal;
	}

	public int getCarbone() {
		return Carbone;
	}

	public void setCarbone(int carbone) {
		Carbone = carbone;
	}

	public int getDeuterium() {
		return Deuterium;
	}

	public void setDeuterium(int deuterium) {
		Deuterium = deuterium;
	}

	public int getFissionable() {
		return Fissionable;
	}

	public void setFissionable(int fissionable) {
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

	public short getType() {
		return type;
	}

	public void setType(short type) {
		this.type = type;
	}

	public float getFactor() {
		return factor;
	}

	public void setFactor(float factor) {
		this.factor = factor;
	}

}
