package colorMatchingGame;

public class randomColorGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] randomColors = new String [5];
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		
		for(int x = 0; x < randomColors.length; x ++)
		{
			int randomNumber = (1 + (int)(Math.random() * 6) - 1);
			randomColors[x] = colors[randomNumber];
		}
		System.out.print(randomColors[0] + " ");
		System.out.print(randomColors[1] + " ");
		System.out.print(randomColors[2] + " ");
		System.out.print(randomColors[3] + " ");
		System.out.print(randomColors[4] + " ");
		
	}

}
