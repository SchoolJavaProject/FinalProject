package colorMatchingGame;

public class randomColorGenerator {

	public static void displayColor() {
		// TODO Auto-generated method stub
		
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		int randomNumber[] = new int [5];
		
		for (int x = 0; x <= randomNumber.length; x ++) {
			randomNumber[x] = (1 + (int)(Math.random() * 6) - 1);
			System.out.print(colors[randomNumber[x]] + " ");
		}
		
	}

}
