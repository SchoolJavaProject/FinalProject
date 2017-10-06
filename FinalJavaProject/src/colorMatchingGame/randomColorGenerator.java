package colorMatchingGame;

public class randomColorGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String color = null;
		String colors[] = {"Blue", "Red", "Green", "Yellow", "Black", "White"};
		
		for(int x = 0; x < colors.length; x ++)
		{
			int randomNumber = (1 + (int)(Math.random() * 6) - 1);
			color = colors[randomNumber];
		}
		System.out.print(color + " ");
		System.out.print(color + " ");
		System.out.print(color + " ");
		System.out.print(color + " ");
		System.out.print(color + " ");
		
	}

}
