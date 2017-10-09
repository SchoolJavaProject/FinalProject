package colorMatchingGame;
import javax.swing.JOptionPane;
import colorMatchingGame.randomColorGenerator;
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String userInput;
		String color1, color2, color3, color4, color5;
		String result;
		JOptionPane.showMessageDialog(null, "Colors to choose from are Blue, Red, Green, Yellow, Black, and White");
		color1 = JOptionPane.showInputDialog(null, "Enter your first guess for the color >> ");
		color2 = JOptionPane.showInputDialog(null, "Enter your second guess for the color >> ");
		color3 = JOptionPane.showInputDialog(null, "Enter your third guess for the color >> ");
		color4 = JOptionPane.showInputDialog(null, "Enter your fourth guess for the color >> ");
		color5 = JOptionPane.showInputDialog(null, "Enter your fifth guess for the color >> ");
		if (color1 == color[0])
		{
			result = "Correct";
		}
		if (color2 == color[1])
		{
			result = "Correct";
		}
		if (color3 == color[2])
		{
			result = "Correct";
		}
		if (color4 == color[3])
		{
			result = "Correct";
		}
		if (color5 == color[4])	
		{
			result = "Correct";
		}
		if (color1 != color[0])
		{
			result = "Incorrect please correct";
		}
		if (color2 != color[1])
		{
			result = "Incorrect please correct";
		}
		if (color3 != color[2])
		{
			result = "Incorrect please correct";
		}
		if (color4 != color[3])
		{
			result = "Incorrect please correct";
		}
		if (color5 != color[4])	
		{
			result = "Incorrect please correct";
		}
		
		
	}

}
