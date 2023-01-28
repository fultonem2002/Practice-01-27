import java.util.Scanner;
public class Demo
{
	public static void main(String args[])
	{
		FarmAnimal animal;
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\nChoose a farm animal to feed:\n\nA. Cow\nB. Pig\nC. Chicken\nD. Goat");
		char c = sc.nextLine().charAt(0);
		switch (c)
		{
			case 'a': case 'A':
				animal = new Cow();
				break;
			case 'b': case 'B':
				animal = new Pig();
				break;

			case 'c': case 'C':
				animal = new Chicken();
				break;

			case 'd': case 'D':
				animal = new Goat();
				break;
			
			default:
				System.out.println("Nope. Start over.");
				animal = new Goat();
				System.exit(0);
		}
		System.out.println("\n\nThe " + animal.name() + " has been fed.\n");
		animal.feed();
		System.out.println("\n\n\n\n");
	}
}
