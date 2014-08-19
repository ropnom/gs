package lib;

public class Requirement {
	
	private short elementnumber;
	private short levelrequirement;
	
	public Requirement()
	{
		this.elementnumber = 0;
		this.levelrequirement = 0;
	}
	
	public Requirement(short element, short level)
	{
		this.elementnumber = element;
		this.levelrequirement = level;
	}

	public short getElementnumber() {
		return elementnumber;
	}

	public void setElementnumber(short elementnumber) {
		this.elementnumber = elementnumber;
	}

	public short getLevelrequirement() {
		return levelrequirement;
	}

	public void setLevelrequirement(short levelrequirement) {
		this.levelrequirement = levelrequirement;
	}
	

}
