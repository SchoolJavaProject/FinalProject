package colorMatchingGame;

public class randomColorGenerator {

	public static void displayColor() {
		// TODO Auto-generated method stub
		
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		
		
		
			int randomNumber = (1 + (int)(Math.random() * 6) - 1);
			
			
		
		System.out.print(colors[randomNumber] + " ");
		
		
	}

}
