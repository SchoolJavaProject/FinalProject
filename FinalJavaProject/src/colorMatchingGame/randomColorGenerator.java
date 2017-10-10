package colorMatchingGame;

public class randomColorGenerator {

	private static int randomNumber;

	public static String displayRandomGenerator(String randomColor1, String randomColor2, String randomColor3,
			String randomColor4, String randomColor5)
	{
		// TODO Auto-generated method stub
		String color1 = "Blue";
		String color2 = "Red";
		String color3 = "Green";
		String color4 = "Yellow";
		String color5 = "Black";
		String color6 = "White";
		for(int x = 0; x < 6; x ++)
		{
			if (x == 0) {
			randomNumber = (1 + (int)(Math.random() * 6) - 1);
				if (randomNumber == 0) {
					randomColor1 = color1;
				}
				if (randomNumber == 1) {
					randomColor1 = color2;
				}
			}
		}
	}

}
