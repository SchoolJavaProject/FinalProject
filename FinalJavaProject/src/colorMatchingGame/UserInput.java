package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput[] = new int [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		int randomNumber[] = new int [5];
		String color;
		String colorInput;
		int attempts = 1;
		int y = 0;
		//String answer
		
		//answer = JOptionPane.showInputDialog(null, "Would you like to play? Yes or no?")
		//while ("no".equalsIgnoreCase(answer)) {
		for (int x = 0; x <= randomNumber.length; x ++) {
			randomNumber[x] = (1 + (int)(Math.random() * 6) - 1);
		}
		
		for (int x = 0; x <= userInput.length; x ++) {
			colorInput = JOptionPane.showInputDialog(null, "Colors to choose from are\n" + colors[0] + "= 0\nRed = 1\n"
					+ "Green = 2\nYellow = 3\nBlack = 4\nand White = 5\nEnter guess " + (x + 1) + " for the color >> ");
			userInput[x] = Integer.parseInt(colorInput);
		}
		
		while (userInput[0] != randomNumber[0] || userInput[1] != randomNumber[1] || userInput[2] != randomNumber[2]
				|| userInput[3] != randomNumber[3] || userInput[4] != randomNumber[4]) {
			attempts ++;
			if (userInput[y] != randomNumber[y]) {
				colorInput = JOptionPane.showInputDialog(null, "You guessed incorrectly.\nColors to choose from are\nBlue = 0\nRed = 1\n"
						+ "Green = 2\nYellow = 3\nBlack = 4\nand White = 5\nCorrect your guess for the color >> ");
				userInput[y] = Integer.parseInt(colorInput);
			}
			if (userInput[y] == randomNumber[y]) {
				System.out.println("You guessed correctly.");
				y ++;
			}
			
		}
		
		if (userInput[0] == randomNumber[0] && userInput[0] == 0)
		{
			color = "Blue";
			System.out.print("The color was " + colors[randomNumber[0]] + " and you guessed " + color);
		}
		//answer = JOptionPane.showInputDialog(null, "Would you like to play again?")
		//}
	}

}
