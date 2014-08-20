package lib;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import lib.objet.ElementGame;

public class vars {

	// list of elements of game

	private final List<ElementGame> buildings;
	private final List<ElementGame> tecnologies;
	private final List<ElementGame> defenses;
	private final List<ElementGame> ships;
	private final HashMap<String, Short> indexelement;
	private final HashMap<Short, ElementGame> element;

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
		this.indexelement = new HashMap<String, Short>();
		this.element = new HashMap<Short, ElementGame>();
		
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
		
		indexelement.put("MetalMine", (short) 1);builds++;
		indexelement.put("CristalMine", (short) 2);builds++;
		indexelement.put("CarboneMine", (short) 3);builds++;
		indexelement.put("DeuteriumMine", (short) 4);builds++;
		indexelement.put("CarboneCentral", (short) 5);builds++;
		indexelement.put("GeologicalCentral", (short) 6);builds++;
		indexelement.put("FissionCentral", (short) 7);builds++;
		indexelement.put("SolarCentral", (short) 8);builds++;
		indexelement.put("FusionCentral", (short) 9);builds++;
		indexelement.put("RobotFactory", (short) 10);builds++;
		indexelement.put("NanoFactory", (short) 11);builds++;
		indexelement.put("Store", (short) 12);builds++;
		indexelement.put("Laboratory", (short) 13);builds++;
		indexelement.put("Hangar", (short) 14);builds++;
		indexelement.put("AllizanceDeposit", (short) 15);builds++;
		indexelement.put("AdvanceBase", (short) 16);builds++;
		indexelement.put("Phalanx", (short) 17);builds++;
		indexelement.put("Silo", (short) 18);builds++;
		indexelement.put("StarGate", (short) 19);builds++;
		indexelement.put("QuantumJump", (short) 20);builds++;
		indexelement.put("PopulationBase", (short) 21);builds++;
		
		
	}

	private void LoadBuildings() {

		ElementGame build;
		
		// Metal mine		
		build = new ElementGame((short) 1, "Metal Mine", "sin descriocion", "d");
		build.putPrizes(60, 15, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 1, build);
		this.buildings.add(build);

		// Cristal mine
		
		build = new ElementGame((short) 2, "Cristal Mine", "sin descriocion", "d");
		build.putPrizes(48, 24, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.element.put((short) 2, build);
		this.buildings.add(build);

		// Carbone mine
		
		build = new ElementGame((short) 3, "Carbone Mine", "sin descriocion", "d");
		build.putPrizes(45, 25, 1, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_8);
		this.element.put((short) 3, build);
		this.buildings.add(build);

		// Deuterium mine
		
		build = new ElementGame((short) 4, "Deuterium Mine", "sin descriocion", "d");
		build.putPrizes(225, 75, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 4, build);
		this.buildings.add(build);

		// Carbone central
		
		build = new ElementGame((short) 5, "Carbone Central", "sin descriocion", "d");
		build.putPrizes(50, 20, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 5, build);
		this.buildings.add(build);

		// Geological central
		
		build = new ElementGame((short) 6, "Geological Central", "sin descriocion", "d");
		build.putPrizes(100, 10, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 6, build);
		this.buildings.add(build);

		// Fussion central
		
		build = new ElementGame((short) 7, "Fission Central", "sin descriocion", "d");
		build.putPrizes(900, 360, 180, 100, 500, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 7, build);
		this.buildings.add(build);

		// Solar central
		
		build = new ElementGame((short) 8, "Solar Central", "sin descriocion", "d");
		build.putPrizes(75, 30, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 8, build);
		this.buildings.add(build);

		// Fusion central
		
		build = new ElementGame((short) 9, "Fusion Central", "sin descriocion", "d");
		build.putPrizes(1000, 400, 250, 100, 50, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.element.put((short) 9, build);
		this.buildings.add(build);

		// robot factory
		
		build = new ElementGame((short) 10, "Robot Factory", "sin descriocion", "d");
		build.putPrizes(400, 120, 200, 100, 10, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 10, build);
		this.buildings.add(build);

		// nano factory
		
		build = new ElementGame((short) 11, "Nano Factory", "sin descriocion", "d");
		build.putPrizes(800000, 500000, 100000, 250000, 50000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);
		this.element.put((short) 11, build);

		// Store
		
		build = new ElementGame((short) 12, "Store", "sin descriocion", "d");
		build.putPrizes(10000, 10000, 2000, 500, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 12, build);
		this.buildings.add(build);
		

		// Laboratory
		
		build = new ElementGame((short) 13, "Laboratory", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 100, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 13, build);
		this.buildings.add(build);

		// Hangar
		
		build = new ElementGame((short) 14, "Hangar", "sin descriocion", "d");
		build.putPrizes(400, 200, 100, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 14, build);
		this.buildings.add(build);

		// alliance deposit
		
		build = new ElementGame((short) 15, "Allizance Deposit", "sin descriocion", "d");
		build.putPrizes(40000, 40000, 2000, 5000, 1000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 15, build);
		this.buildings.add(build);

		// Advanced Base
		
		build = new ElementGame((short) 16, "Advance Base", "sin descriocion", "d");
		build.putPrizes(20000, 40000, 2000, 10000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.element.put((short) 16, build);
		this.buildings.add(build);

		// Phalanx
		
		build = new ElementGame((short) 17, "Phalanx", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 17, build);
		this.buildings.add(build);

		// Silo
		
		build = new ElementGame((short) 18, "Silo", "sin descriocion", "d");
		build.putPrizes(20000, 20000, 2000, 1000, 5000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 18, build);
		this.buildings.add(build);

		// StarGate
		
		build = new ElementGame((short) 19, "StarGate", "sin descriocion", "d");
		build.putPrizes(100000, 50000, 10000, 15000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 19, build);
		this.buildings.add(build);

		// QuantumJump
		
		build = new ElementGame((short) 20, "Quantum Jump", "sin descriocion", "d");
		build.putPrizes(2000000, 4000000, 2000000, 500000, 200000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.element.put((short) 20, build);
		this.buildings.add(build);

		// Population Base
		
		build = new ElementGame((short) 21, "PopulationBase", "sin descriocion", "d");
		build.putPrizes(1000, 500, 200, 100, 10, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.element.put((short) 21, build);
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


	public List<ElementGame> getTecnologies() {
		return tecnologies;
	}

	public List<ElementGame> getDefenses() {
		return defenses;
	}

	public List<ElementGame> getShips() {
		return ships;
	}

	public HashMap<Short, ElementGame > getElement() {
		return this.element;
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

	public HashMap<String, Short> getIndexelement() {
		return indexelement;
	}

}
