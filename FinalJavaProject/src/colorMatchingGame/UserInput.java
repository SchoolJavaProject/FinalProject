package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput;
		String [] color = new String [5];
		String [] result = new String [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		JOptionPane.showMessageDialog(null, "Colors to choose from are Blue, Red, Green, Yellow, Black, and White");
		color[0] = JOptionPane.showInputDialog(null, "Enter your first guess for the color >> ");
		color[1] = JOptionPane.showInputDialog(null, "Enter your second guess for the color >> ");
		color[2] = JOptionPane.showInputDialog(null, "Enter your third guess for the color >> ");
		color[3] = JOptionPane.showInputDialog(null, "Enter your fourth guess for the color >> ");
		color[4] = JOptionPane.showInputDialog(null, "Enter your fifth guess for the color >> ");
		if (color[0] == randomColorGenerator.displayRandomGenerator())
		{
			result[0] = "Correct";
		}
		if (color[1] == randomColors[1])
		{
			result[1] = "Correct";
		}
		if (color[2] == randomColors[2])
		{
			result[2] = "Correct";
		}
		if (color[3] == randomColors[3])
		{
			result[3] = "Correct";
		}
		if (color[4] == randomColors[4])	
		{
			result[4] = "Correct";
		}
		if (color[0] != randomColors[0])
		{
			result[0] = "Incorrect please correct";
		}
		if (color[1] != randomColors[1])
		{
			result[1] = "Incorrect please correct";
		}
		if (color[2] != randomColors[2])
		{
			result[2] = "Incorrect please correct";
		}
		if (color[3] != randomColors[3])
		{
			result[3] = "Incorrect please correct";
		}
		if (color[4] != randomColors[4])	
		{
			result[4] = "Incorrect please correct";
		}
		
	}

}
