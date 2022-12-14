package week1.day1;

public class IsPrimeSample {

	public static void main(String[] args) {

		int number = 17;
		boolean prime = true; 

		for (int i = 2; i < number; i++) {
			if (number % i == 0 ) {

			System.out.println("its not a Prime");
			prime = false;
			break;
			}

		}


		if (prime) {
		System.out.println("its a Prime");

		}

	}

}
