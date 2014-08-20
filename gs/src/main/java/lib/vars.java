package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lib.objet.ElementGame;

public class vars {

	// list of elements of game

	private List<ElementGame> buildings;
	private List<ElementGame> tecnologies;
	private List<ElementGame> defenses;
	private List<ElementGame> ships;
	private HashMap<String, Short> element;

	// identificator number
	private static short builds = 1;
	private static short tecnologie = 100;
	private static short spaceships = 200;
	private static short defense = 500;

	public vars() {
		this.buildings = new ArrayList<ElementGame>();
		this.tecnologies = new ArrayList<ElementGame>();
		this.defenses = new ArrayList<ElementGame>();
		this.ships = new ArrayList<ElementGame>();
		this.element = new HashMap<String, Short>();

		LoadElements();
	}

	// load buldings
	public void LoadElements() {

		LoadBuildings();
		LoadTecnologies();
		LoadShips();
		LoadDefenses();

	}

	public void Write() {

		for (int i = 0; i < this.buildings.size(); i++) {
			System.out.println("|  " + this.buildings.get(i).getIdentificador() + " : " + this.buildings.get(i).getName() + "  ");
			System.out.println("|  Metal:" + this.buildings.get(i).getMetal() + "  Cristal:" + this.buildings.get(i).getCristal() + "  Carbone:" + this.buildings.get(i).getCarbone() + "  Deuterio:" + this.buildings.get(i).getDeuterium() + "  ");
			System.out.println("------------------------------------------------------------");
		}
	}
	private void CreateElementNumeration(){
		
		element.put("MetalMine", (short) 1);builds++;
		element.put("CristalMine", (short) 2);builds++;
		element.put("CarboneMine", (short) 3);builds++;
		element.put("DeuteriumMine", (short) 4);builds++;
		element.put("CarboneCentral", (short) 5);builds++;
		element.put("GeologicalCentral", (short) 6);builds++;
		element.put("FissionCentral", (short) 7);builds++;
		element.put("SolarCentral", (short) 8);builds++;
		element.put("FusionCentral", (short) 9);builds++;
		element.put("RobotFactory", (short) 10);builds++;
		element.put("NanoFactory", (short) 11);builds++;
		element.put("Store", (short) 12);builds++;
		element.put("Laboratory", (short) 13);builds++;
		element.put("Hangar", (short) 14);builds++;
		element.put("AllizanceDeposit", (short) 15);builds++;
		element.put("AdvanceBase", (short) 16);builds++;
		element.put("Phalanx", (short) 17);builds++;
		element.put("Silo", (short) 18);builds++;
		element.put("StarGate", (short) 19);builds++;
		element.put("QuantumJump", (short) 20);builds++;
		element.put("PopulationBase", (short) 21);builds++;
		
		
	}

	private void LoadBuildings() {

		ElementGame build;
		
		// Metal mine		
		build = new ElementGame((short) 1, "Metal Mine", "sin descriocion", "d");
		build.putPrizes(60, 15, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Cristal mine
		
		build = new ElementGame((short) 2, "Cristal Mine", "sin descriocion", "d");
		build.putPrizes(48, 24, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Carbone mine
		
		build = new ElementGame((short) 3, "Carbone Mine", "sin descriocion", "d");
		build.putPrizes(45, 25, 1, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_8);
		this.buildings.add(build);

		// Deuterium mine
		
		build = new ElementGame((short) 4, "Deuterium Mine", "sin descriocion", "d");
		build.putPrizes(225, 75, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Carbone central
		
		build = new ElementGame((short) 5, "Carbone Central", "sin descriocion", "d");
		build.putPrizes(50, 20, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Geological central
		
		build = new ElementGame((short) 6, "Geological Central", "sin descriocion", "d");
		build.putPrizes(100, 10, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Fussion central
		
		build = new ElementGame((short) 7, "Fission Central", "sin descriocion", "d");
		build.putPrizes(900, 360, 180, 100, 500, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Solar central
		
		build = new ElementGame((short) 8, "Solar Central", "sin descriocion", "d");
		build.putPrizes(75, 30, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Fusion central
		
		build = new ElementGame((short) 9, "Fusion Central", "sin descriocion", "d");
		build.putPrizes(1000, 400, 250, 100, 50, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// robot factory
		
		build = new ElementGame((short) 10, "Robot Factory", "sin descriocion", "d");
		build.putPrizes(400, 120, 200, 100, 10, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// nano factory
		
		build = new ElementGame((short) 11, "Nano Factory", "sin descriocion", "d");
		build.putPrizes(800000, 500000, 100000, 250000, 50000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Store
		
		build = new ElementGame((short) 12, "Store", "sin descriocion", "d");
		build.putPrizes(10000, 10000, 2000, 500, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Laboratory
		
		build = new ElementGame((short) 13, "Laboratory", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 100, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Hangar
		
		build = new ElementGame((short) 14, "Hangar", "sin descriocion", "d");
		build.putPrizes(400, 200, 100, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// alliance deposit
		
		build = new ElementGame((short) 15, "Allizance Deposit", "sin descriocion", "d");
		build.putPrizes(40000, 40000, 2000, 5000, 1000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Advanced Base
		
		build = new ElementGame((short) 16, "Advance Base", "sin descriocion", "d");
		build.putPrizes(20000, 40000, 2000, 10000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Phalanx
		
		build = new ElementGame((short) 17, "Phalanx", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Silo
		
		build = new ElementGame((short) 18, "Silo", "sin descriocion", "d");
		build.putPrizes(20000, 20000, 2000, 1000, 5000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// StarGate
		
		build = new ElementGame((short) 19, "StarGate", "sin descriocion", "d");
		build.putPrizes(100000, 50000, 10000, 15000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// QuantumJump
		
		build = new ElementGame((short) 20, "Quantum Jump", "sin descriocion", "d");
		build.putPrizes(2000000, 4000000, 2000000, 500000, 200000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Population Base
		
		build = new ElementGame((short) 21, "PopulationBase", "sin descriocion", "d");
		build.putPrizes(1000, 500, 200, 100, 10, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);
		
	}

	private void LoadTecnologies() {

	}

	private void LoadShips() {

	}

	private void LoadDefenses() {

	}

	public List<ElementGame> getBuildings() {
		return buildings;
	}

	public void setBuildings(List<ElementGame> buildings) {
		this.buildings = buildings;
	}

	public List<ElementGame> getTecnologies() {
		return tecnologies;
	}

	public void setTecnologies(List<ElementGame> tecnologies) {
		this.tecnologies = tecnologies;
	}

	public List<ElementGame> getDefenses() {
		return defenses;
	}

	public void setDefenses(List<ElementGame> defenses) {
		this.defenses = defenses;
	}

	public List<ElementGame> getShips() {
		return ships;
	}

	public void setShips(List<ElementGame> ships) {
		this.ships = ships;
	}

	public HashMap<String, Short> getElement() {
		return element;
	}

	public void setElement(HashMap<String, Short> element) {
		this.element = element;
	}

	public static short getBuilds() {
		return builds;
	}

	public static void setBuilds(short builds) {
		vars.builds = builds;
	}

	public static short getTecnologie() {
		return tecnologie;
	}

	public static void setTecnologie(short tecnologie) {
		vars.tecnologie = tecnologie;
	}

	public static short getSpaceships() {
		return spaceships;
	}

	public static void setSpaceships(short spaceships) {
		vars.spaceships = spaceships;
	}

	public static short getDefense() {
		return defense;
	}

	public static void setDefense(short defense) {
		vars.defense = defense;
	}

}
