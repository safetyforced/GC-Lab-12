
public class rockPlayer extends Player {

	public rockPlayer(String n) {
		// TODO Auto-generated constructor stub
		name = n;
		rValue = null;
	}

	@Override
	public String generateRoshambo() {
		// TODO Auto-generated method stub

		Roshambo play = Roshambo.ROCK;
		rValue = play.toString();
		
		return rValue;
	}

}
