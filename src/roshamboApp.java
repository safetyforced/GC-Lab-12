import java.util.Scanner;

public class roshamboApp {

	static Player human = new humanPlayer(null);

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		String userConsent = null;
		int humanVictory = 0;
		int machineVictory = 0;
		Player opponent = null;

		System.out.println("Welcome to Rock, Paper, Scissors!");
		System.out.print("Enter your name: ");
		human.setName(input.nextLine());

		while (true) {
			System.out.print("Would you like to play against Dwayne Johnson or Vin Diesel? (d/v): ");
			String opponentChoice = validator.getValidString("[DdVv]", 1);

			human.generateRoshambo();
			System.out.println(human.getName() + ": " + human.getrValue());

			if (opponentChoice.equalsIgnoreCase("d")) {
				opponent = new rockPlayer("Dwayne Johnson");
				opponent.generateRoshambo();
				System.out.println(opponent.getName() + ": " + opponent.getrValue());

			} else if (opponentChoice.equalsIgnoreCase("v")) {
				opponent = new randPlayer("Vin Diesel");
				opponent.generateRoshambo();
				System.out.println(opponent.getName() + ": " + opponent.getrValue());
			}

			if (human.getrValue().equals("ROCK") && opponent.getrValue().equals("SCISSORS")) {
				System.out.println("You Win!");
				humanVictory++;
			} else if (human.getrValue().equals("ROCK") && opponent.getrValue().equals("PAPER")) {
				System.out.println("You Lose!");
				machineVictory++;
			} else if (human.getrValue().equals("PAPER") && opponent.getrValue().equals("ROCK")) {
				System.out.println("You Win!");
				humanVictory++;
			} else if (human.getrValue().equals("PAPER") && opponent.getrValue().equals("SCISSORS")) {
				System.out.println("You Lose!");
				machineVictory++;
			} else if (human.getrValue().equals("SCISSORS") && opponent.getrValue().equals("PAPER")) {
				System.out.println("You Win");
				humanVictory++;
			} else if (human.getrValue().equals("SCISSORS") && opponent.getrValue().equals("ROCK")) {
				System.out.println("You Lose!");
				machineVictory++;
			} else if (human.getrValue().equals(opponent.getrValue())) {
				System.out.println("Tie!");
			}

			System.out.print("Would you like to play again? (y/n): ");
			userConsent = validator.readYorN("y", "n");

			if (userConsent.equalsIgnoreCase("y")) {
				continue;
			} else {
				System.out.println("You won " + humanVictory + " times and the computer won " + machineVictory + " times.");
				input.close();
				break;
			}
			

		}

	}
}