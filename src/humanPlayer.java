public class humanPlayer extends Player {

	public  humanPlayer(String n) {
		// TODO Auto-generated constructor stub
		name = n;
		rValue = null;
	}
		
		@Override
		public String generateRoshambo() {
			
			Roshambo play = null;
			int rInt = 0;
			
			System.out.print("please enter a play: (r/p/s): ");
			String rString = validator.getValidString("[rRpPsS]", 1);
			
			if (rString.equalsIgnoreCase("R")) {
				rInt = 1;
			} else if (rString.equalsIgnoreCase("P")) {
				rInt = 2;
			} else if (rString.equalsIgnoreCase("S")) {
				rInt = 3;
			}
			
			
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


