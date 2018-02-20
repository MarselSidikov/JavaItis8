import java.util.Random;
import java.util.Scanner;
class Program {
	public static void main(String args[]) {	
		Random random = new Random();		
		Scanner scanner = new Scanner(System.in);
		
		int computerNumber = random.nextInt(10);
		int userNumber = scanner.nextInt();

		while (computerNumber != userNumber) {
			if (userNumber > computerNumber) {
				System.out.println("Less than");
			} else if (userNumber < computerNumber) {
				System.out.println("More than");
			} else {
				return;
			}
			userNumber = scanner.nextInt();
		}
	}
}