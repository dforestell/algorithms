import java.util.Scanner;
import java.util.Random;

public class PickNumber {

	public static void main(String[] args) {
		Random rand = new Random();
		int  n = rand.nextInt(10) + 1;

		System.out.println("I picked a number 1-10, can you guess it?");
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt(); 

		while (number != n){
			if (number < 1 || number > 10){
				System.out.println("That number is not in our range!!! Try again.");
				number = sc.nextInt();
			}
			else if (number > n) {
				System.out.println("Nope, too high.  Try again");
				number = sc.nextInt();
			}
			else if (number < n) {
				System.out.println("Nope, too low. Try again");
				number = sc.nextInt();
			}
		}

		System.out.println("You got it my number was " + n );
	}
}