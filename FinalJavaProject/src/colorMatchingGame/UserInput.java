package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// Initializing variables
		int userInput[] = new int [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		int randomNumber[] = new int [5];
		int guess1[] = {-1, -1, -1, -1, -1, -1};
		int guess2[] = {-1, -1, -1, -1, -1, -1};
		int guess3[] = {-1, -1, -1, -1, -1, -1};
		int guess4[] = {-1, -1, -1, -1, -1, -1};
		int guess5[] = {-1, -1, -1, -1, -1, -1};
		int guess6[] = {-1, -1, -1, -1, -1, -1};
		String colorInput;
		int attempts = 0;
		int y = 0;
		int highScoreEasy = 2100000;
		int highScoreHard = 2100000;
		String difficultyInput;
		int difficulty;
		
		// Random color generator
		for (int x = 0; x < randomNumber.length; x ++) {
			randomNumber[x] = (1 + (int)(Math.random() * 6) - 1);
		}
		// Prompts the user for the difficulty level.
		difficultyInput = JOptionPane.showInputDialog(null, "Select the difficulty.\nEasy = 0\nHard = 1");
		difficulty = Integer.parseInt(difficultyInput);
		if (difficulty == 0) {
			// It prompts the user to enter a number for guessing the color and tells them if they got it correct or not.
			// This counts as attempt 1.
			for (int x = 0; x < userInput.length; x ++) {
				colorInput = JOptionPane.showInputDialog(null, "Colors to choose from are\n" + colors[0] + " = 0\n" + colors[1] + " = 1\n"
						+ colors[2] + " = 2\n" + colors[3] + " = 3\n" + colors[4] + " = 4\n" + colors[5] + " = 5\nEnter guess "
						+ (x + 1) + " for the color >> ");
				userInput[x] = Integer.parseInt(colorInput);
				while (userInput[x] > 5) {
					colorInput = JOptionPane.showInputDialog(null, "That color is invalid. Colors to choose from are\n"
							+ colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n"
							+ colors[4] + " = 4\n" + colors[5] + " = 5\nEnter guess " + (x + 1) + " for the color >> ");
					userInput[x] = Integer.parseInt(colorInput);
				}
				guess1[x] = userInput[x];
				if (userInput[x] == randomNumber[x]) {
					JOptionPane.showMessageDialog(null, "You guessed correctly.");
				}
				if (userInput[x] != randomNumber[x]) {
					JOptionPane.showMessageDialog(null, "You guessed incorrectly.");
				}
				if (x == userInput.length - 1) {
					attempts ++;
				}
			}
			// While any of the user's guesses are incorrect,
			// it prompts them to correct it and tells them if they got it correct or not.
			// After each cycle, the amount of attempts will increase.
			// If the user guessed a color they have already guessed, it prompts them to enter a different color they haven't guessed yet.
			while (userInput[0] != randomNumber[0] || userInput[1] != randomNumber[1] || userInput[2] != randomNumber[2]
					|| userInput[3] != randomNumber[3] || userInput[4] != randomNumber[4]) {
				if (userInput[y] != randomNumber[y]) {
					colorInput = JOptionPane.showInputDialog(null, "Your guess " + (y + 1) + " is incorrect.\nYou guessed "
							+ guess1[y] + " " + guess2[y] + " " + guess3[y] + " " + guess4[y] + " " + guess5[y] + " " + guess6[y]
							+ "\nColors to choose from are\n" + colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2]
							+ " = 2\n" + colors[3] + " = 3\n" + colors[4] + " = 4\n" + colors[5] + " = 5"
							+ "\nCorrect your guess for the color >> ");
					userInput[y] = Integer.parseInt(colorInput);
					while (userInput[y] == guess1[y] || userInput[y] == guess2[y] || userInput[y] == guess3[y] ||
							userInput[y] == guess4[y] || userInput[y] == guess5[y] || userInput[y] == guess6[y]) {
						colorInput = JOptionPane.showInputDialog(null, "You have already guessed this color.\nYou guessed "
								+ guess1[y] + " " + guess2[y] + " " + guess3[y] + " " + guess4[y] + " " + guess5[y] + " " + guess6[y]
								+ "\nColors to choose from are\n" + colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2]
								+ " = 2\n" + colors[3] + " = 3\n" + colors[4] + " = 4\n" + colors[5] + " = 5"
								+ "\nGuess a different color that you haven't already guessed >> ");
						userInput[y] = Integer.parseInt(colorInput);
					}
					while (userInput[y] > 5) {
						colorInput = JOptionPane.showInputDialog(null, "That color is invalid. Colors to choose from are\n"
								+ colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n"
								+ colors[4] + " = 4\n" + colors[5] + " = 5\nEnter guess " + (y + 1) + " for the color >> ");
						userInput[y] = Integer.parseInt(colorInput);
					}
					if (attempts == 1) {
						guess2[y] = userInput[y];
					}
					if (attempts == 2) {
						guess3[y] = userInput[y];
					}
					if (attempts == 3) {
						guess4[y] = userInput[y];
					}
					if (attempts == 4) {
						guess5[y] = userInput[y];
					}
					if (attempts == 5) {
						guess6[y] = userInput[y];
					}
					if (userInput[y] == randomNumber[y]) {
						JOptionPane.showMessageDialog(null, "You guessed correctly.");
					}
					if (userInput[y] != randomNumber[y]) {
						JOptionPane.showMessageDialog(null, "You guessed incorrectly.");
					}
				}
				y ++;
				if (y > 4) {
					y = 0;
					attempts ++;
				}
			}
			// If attempts is lower than high score, set high score equal to attempts.
			if (attempts < highScoreEasy) {
				highScoreEasy = attempts;
			}
			// It tells the user how many attempts it took them and what the current high score is.
			JOptionPane.showMessageDialog(null, "It took you " + attempts + " attempts to get it correct.\nThe highscore is "
						+ highScoreEasy + ".");
			Menu.main(null);
		}
		if (difficulty == 1) {
			// It prompts the user to enter a number for guessing the color and tells them if they got it correct or not.
			// This counts as attempt 1.
			for (int x = 0; x < userInput.length; x ++) {
				colorInput = JOptionPane.showInputDialog(null, "Colors to choose from are\n" + colors[0] + "= 0\n" + colors[1]
						+ " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n" + colors[4] + " = 4\n" + colors[5]
						+ " = 5\nEnter guess " + (x + 1) + " for the color >> ");
				userInput[x] = Integer.parseInt(colorInput);
				while (userInput[x] > 5) {
					colorInput = JOptionPane.showInputDialog(null, "That color is invalid. Colors to choose from are\n"
							+ colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n"
							+ colors[4] + " = 4\n" + colors[5] + " = 5\nEnter guess " + (y + 1) + " for the color >> ");
					userInput[y] = Integer.parseInt(colorInput);
				}
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
					colorInput = JOptionPane.showInputDialog(null, "Your guess " + (y + 1) + " is incorrect.\nColors to choose from are"
							+ "\n" + colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n"
							+ colors[4] + " = 4\n" + colors[5] + " = 5\nCorrect your guess for the color >> ");
					userInput[y] = Integer.parseInt(colorInput);
					while (userInput[y] > 5) {
						colorInput = JOptionPane.showInputDialog(null, "That color is invalid. Colors to choose from are\n"
								+ colors[0] + " = 0\n" + colors[1] + " = 1\n" + colors[2] + " = 2\n" + colors[3] + " = 3\n"
								+ colors[4] + " = 4\n" + colors[5] + " = 5\nEnter guess " + (y + 1) + " for the color >> ");
						userInput[y] = Integer.parseInt(colorInput);
					}
					if (userInput[y] == randomNumber[y]) {
						JOptionPane.showMessageDialog(null, "You guessed correctly.");
					}
					if (userInput[y] != randomNumber[y]) {
						JOptionPane.showMessageDialog(null, "You guessed incorrectly.");
					}
				}
				y ++;
				if (y > 4) {
					y = 0;
					attempts ++;
				}
			}
			// If attempts is lower than high score, set high score equal to attempts.
			if (attempts < highScoreHard) {
				highScoreHard = attempts;
			}
			// It tells the user how many attempts it took them and what the current high score is.
			JOptionPane.showMessageDialog(null, "It took you " + attempts + " attempts to get it correct.\nThe highscore is "
						+ highScoreHard + ".");
			Menu.main(null);
		}
	}
}