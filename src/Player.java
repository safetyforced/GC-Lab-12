
public abstract class Player {
	
	String name;
	String rValue;

	public abstract String generateRoshambo();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getrValue() {
		return rValue;
	}

	public void setrValue(String rValue) {
		this.rValue = rValue;
	}

}
