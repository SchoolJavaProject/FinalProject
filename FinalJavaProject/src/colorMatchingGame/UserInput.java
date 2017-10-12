package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput[] = new int [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		
		
		
		int randomNumber = (1 + (int)(Math.random() * 6) - 1);
		
		for (int x = 0; x <= userInput.length; x ++) {
			String color = JOptionPane.showInputDialog(null, "Colors to choose from are\nBlue = 0\nRed = 1\n"
					+ "Green = 2\nYellow = 3\nBlack = 4\nand White = 5\nEnter a guess for the color >> ");
			userInput[x] = Integer.parseInt(color);
			randomColorGenerator.displayColor();
		
		
			if (userInput[0] == randomNumber && userInput[0] == 0)
			{
				System.out.print("The color was " + colors[randomNumber] + " and you guessed Blue");
			}
		}
//		if (color[2] == randomColors[2])
//		{
//			result[2] = "Correct";
//		}
//		if (color[3] == randomColors[3])
//		{
//			result[3] = "Correct";
//		}
//		if (color[4] == randomColors[4])	
//		{
//			result[4] = "Correct";
//		}
//		if (color[0] != randomColors[0])
//		{
//			result[0] = "Incorrect please correct";
//		}
//		if (color[1] != randomColors[1])
//		{
//			result[1] = "Incorrect please correct";
//		}
//		if (color[2] != randomColors[2])
//		{
//			result[2] = "Incorrect please correct";
//		}
//		if (color[3] != randomColors[3])
//		{
//			result[3] = "Incorrect please correct";
//		}
//		if (color[4] != randomColors[4])	
//		{
//			result[4] = "Incorrect please correct";
//		}
		
	}

}
