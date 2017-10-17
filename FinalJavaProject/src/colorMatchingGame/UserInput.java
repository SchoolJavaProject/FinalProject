package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int userInput;
		String colors[] = {"Blue", "Red"};
		
		
		
		int randomNumber = (1 + (int)(Math.random() * 2) - 1);
		
	JOptionPane.showMessageDialog(null, "Colors to choose from are Blue = 0 , Red= 1, Green = 3, Yellow = 4, Black = 5, and White = 6"+ "");
		String color = JOptionPane.showInputDialog(null, "Enter your first guess for the color >> ");
		userInput = Integer.parseInt(color);
		randomColorGenerator.displayColor();
		
		
		if (userInput == randomNumber && userInput == 0)
		{
			System.out.print(colors[randomNumber] + " ");
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
