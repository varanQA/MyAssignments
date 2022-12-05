package week1.day1;

public class CreateMethodToCallMaths {

	public static void main(String[] args) {
		
		int x = 15;
		int y = 25;

		Maths result = new Maths();
		 System.out.println(result.addition(x, y));
		 System.out.println(result.subraction(x, y));
		 System.out.println(result.multiplication(x, y));
		 System.out.println(result.division(x, y));
	}

}
