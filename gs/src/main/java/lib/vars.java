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

	private void LoadBuildings() {

		ElementGame build;
		// Metal mine
		element.put("metal_mine", builds);
		build = new ElementGame(builds++, "metal_mine", "sin descriocion", "d");
		build.putPrizes(60, 15, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Cristal mine
		element.put("cristal_mine", builds);
		build = new ElementGame(builds++, "cristal_mine", "sin descriocion", "d");
		build.putPrizes(48, 24, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Carbone mine
		element.put("carbone_mine", builds);
		build = new ElementGame(builds++, "carbone_mine", "sin descriocion", "d");
		build.putPrizes(45, 25, 1, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_8);
		this.buildings.add(build);

		// Deuterium mine
		element.put("deuterium_mine", builds);
		build = new ElementGame(builds++, "deuterium_mine", "sin descriocion", "d");
		build.putPrizes(225, 75, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Carbone central
		element.put("carbone_central", builds);
		build = new ElementGame(builds++, "carbone_central", "sin descriocion", "d");
		build.putPrizes(50, 20, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Geological central
		element.put("geological_central", builds);
		build = new ElementGame(builds++, "geological_central", "sin descriocion", "d");
		build.putPrizes(100, 10, 0, 0, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Fussion central
		element.put("fission_central", builds);
		build = new ElementGame(builds++, "fission_central", "sin descriocion", "d");
		build.putPrizes(900, 360, 180, 100, 500, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Solar central
		element.put("solar_central", builds);
		build = new ElementGame(builds++, "solar_central", "sin descriocion", "d");
		build.putPrizes(75, 30, 0, 10, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_5);
		this.buildings.add(build);

		// Fusion central
		element.put("fusion_central", builds);
		build = new ElementGame(builds++, "fusion_central", "sin descriocion", "d");
		build.putPrizes(1000, 400, 250, 100, 50, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// robot factory
		element.put("robot_factory", builds);
		build = new ElementGame(builds++, "robot_factory", "sin descriocion", "d");
		build.putPrizes(400, 120, 200, 100, 10, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// nano factory
		element.put("nano_factory", builds);
		build = new ElementGame(builds++, "nano_factory", "sin descriocion", "d");
		build.putPrizes(800000, 500000, 100000, 250000, 50000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Store
		element.put("store", builds);
		build = new ElementGame(builds++, "store", "sin descriocion", "d");
		build.putPrizes(10000, 10000, 2000, 500, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Laboratory
		element.put("laboratory", builds);
		build = new ElementGame(builds++, "laboratory", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 100, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Hangar
		element.put("hangar", builds);
		build = new ElementGame(builds++, "hangar", "sin descriocion", "d");
		build.putPrizes(400, 200, 100, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// alliance deposit
		element.put("alizance_deposite", builds);
		build = new ElementGame(builds++, "alizance_deposite", "sin descriocion", "d");
		build.putPrizes(40000, 40000, 2000, 5000, 1000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Advanced Base
		element.put("advanced_base", builds);
		build = new ElementGame(builds++, "advanced_base", "sin descriocion", "d");
		build.putPrizes(20000, 40000, 2000, 10000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_1_6);
		this.buildings.add(build);

		// Phalanx
		element.put("phalanx", builds);
		build = new ElementGame(builds++, "phalanx", "sin descriocion", "d");
		build.putPrizes(200, 400, 200, 100, 0, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Silo
		element.put("silo", builds);
		build = new ElementGame(builds++, "silo", "sin descriocion", "d");
		build.putPrizes(20000, 20000, 2000, 1000, 5000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// StarGate
		element.put("stargate", builds);
		build = new ElementGame(builds++, "stargate", "sin descriocion", "d");
		build.putPrizes(100000, 50000, 10000, 15000, 3000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// QuantumJump
		element.put("quantumjump", builds);
		build = new ElementGame(builds++, "quantumjump", "sin descriocion", "d");
		build.putPrizes(2000000, 4000000, 2000000, 500000, 200000, 0, 0);
		build.putPropierties(Constants.type_building, Constants.factor_2);
		this.buildings.add(build);

		// Population Base
		element.put("population_base", builds);
		build = new ElementGame(builds++, "population_base", "sin descriocion", "d");
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
