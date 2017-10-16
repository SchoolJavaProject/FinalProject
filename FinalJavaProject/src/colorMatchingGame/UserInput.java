package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// Initializing variables
		int userInput[] = new int [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		int randomNumber[] = new int [5];
		String color;
		String colorInput;
		int attempts = 0;
		int y = 0;
		int highScore = 2100000;
		//String answer;
		
		//answer = JOptionPane.showInputDialog(null, "Would you like to play? Yes or no?");
		//while ("yes".equalsIgnoreCase(answer)) {
		// Random color generator
		for (int x = 0; x <= randomNumber.length; x ++) {
			randomNumber[x] = (1 + (int)(Math.random() * 6) - 1);
		}
		// It prompts the user to enter a number for guessing the color and tells them if they got it correct or not.
		// This counts as attempt 1.
		for (int x = 0; x <= userInput.length; x ++) {
			colorInput = JOptionPane.showInputDialog(null, "Colors to choose from are\n" + colors[0] + "= 0\nRed = 1\n"
					+ "Green = 2\nYellow = 3\nBlack = 4\nand White = 5\nEnter guess " + (x + 1) + " for the color >> ");
			userInput[x] = Integer.parseInt(colorInput);
			if (userInput[x] == randomNumber[x]) {
				JOptionPane.showMessageDialog(null, "You guessed correctly.");
			}
			if (userInput[x] != randomNumber[x]) {
				JOptionPane.showMessageDialog(null, "You guessed incorrectly.");
			}
			if (x <= userInput.length - 1) {
				attempts ++;
			}
		}
		// While any of the user's guesses are incorrect,
		// it prompts them to correct it and tells them if they got it correct or not.
		// After each cycle, the amount of attempts will increase.
		while (userInput[0] != randomNumber[0] || userInput[1] != randomNumber[1] || userInput[2] != randomNumber[2]
				|| userInput[3] != randomNumber[3] || userInput[4] != randomNumber[4]) {
			if (userInput[y] != randomNumber[y]) {
				colorInput = JOptionPane.showInputDialog(null, "Your guess " + (y + 1) + " is incorrect.\nColors to choose from are\nBlue = 0\nRed = 1\n"
						+ "Green = 2\nYellow = 3\nBlack = 4\nand White = 5\nCorrect your guess for the color >> ");
				userInput[y] = Integer.parseInt(colorInput);
				if (userInput[y] == randomNumber[y]) {
					JOptionPane.showMessageDialog(null, "You guessed correctly.");
				}
				if (userInput[y] != randomNumber[y]) {
					JOptionPane.showMessageDialog(null, "You guessed incorrectly.");
				}
				y ++;
				if (y > 4) {
					y = 0;
					attempts ++;
				}
			}
		}
		// If attempts is lower than highscore, set highscore equal to attempts.
		if (attempts < highScore) {
			highScore = attempts;
		}
		// It tells the user how many attempts it took them and what the current highscore is.
		JOptionPane.showMessageDialog(null, "It took you " + attempts + " attempts to get it correct.\nThe highscore is " + highscore + ".");
		//answer = JOptionPane.showInputDialog(null, "Would you like to play again?");
		//}
	}

}
