package colorMatchingGame;
import javax.swing.JOptionPane;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput;
		String color1, color2, color3, color4, color5;
		String result1, result2, result3, result4, result5;
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		JOptionPane.showMessageDialog(null, "Colors to choose from are Blue, Red, Green, Yellow, Black, and White");
		color1 = JOptionPane.showInputDialog(null, "Enter your first guess for the color >> ");
		color2 = JOptionPane.showInputDialog(null, "Enter your second guess for the color >> ");
		color3 = JOptionPane.showInputDialog(null, "Enter your third guess for the color >> ");
		color4 = JOptionPane.showInputDialog(null, "Enter your fourth guess for the color >> ");
		color5 = JOptionPane.showInputDialog(null, "Enter your fifth guess for the color >> ");
		if (color1 == randomColors[0])
		{
			result1 = "Correct";
		}
		if (color2 == randomColors[1])
		{
			result2 = "Correct";
		}
		if (color3 == randomColors[2])
		{
			result3 = "Correct";
		}
		if (color4 == randomColors[3])
		{
			result4 = "Correct";
		}
		if (color5 == randomColors[4])	
		{
			result4 = "Correct";
		}
		if (color1 != randomColors[0])
		{
			result1 = "Incorrect please correct";
		}
		if (color2 != randomColors[1])
		{
			result2 = "Incorrect please correct";
		}
		if (color3 != randomColors[2])
		{
			result3 = "Incorrect please correct";
		}
		if (color4 != randomColors[3])
		{
			result4 = "Incorrect please correct";
		}
		if (color5 != randomColors[4])	
		{
			result5 = "Incorrect please correct";
		}
		
	}

}
