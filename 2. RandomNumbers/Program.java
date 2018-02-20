import java.util.Random;
import java.util.Scanner;
class Program {
	public static void main(String args[]) {
		// генератор чисел
		Random random = new Random();		
		// считыватель с консоли
		Scanner scanner = new Scanner(System.in);
		// компьютер загадывает число
		int computerNumber = random.nextInt(10);
		// пользователь вводит свое число
		int userNumber = scanner.nextInt();
		// пока числа не совпали
		while (computerNumber != userNumber) {
			// если число, которое загадал пользователь больше
			if (userNumber > computerNumber) {
				System.out.println("Less than");
				// если число, которое загадал пользователь меньше
			} else if (userNumber < computerNumber) {
				System.out.println("More than");
			} else {
				// когда равны - завершить программу
				return;
			}
			// считать число заново
			userNumber = scanner.nextInt();
		}
	}
}