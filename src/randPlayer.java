import java.util.Random;

public class randPlayer extends Player {

	public randPlayer(String n) {
		name = n;
		rValue = null;
	}

	@Override
	public String generateRoshambo() {
		// TODO Auto-generated method stub
		
		Roshambo play = null;
		Random rand = new Random();
		int rInt = rand.nextInt(3) + 1;
		
		switch (rInt) {
		case 1:
			play = Roshambo.ROCK;
			break;
		case 2:
			play = Roshambo.PAPER;
			break;
		case 3:
			play = Roshambo.SCISSORS;
			break;
		}
		
		rValue = play.toString();
		return rValue;
	}	
}
