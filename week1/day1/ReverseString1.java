package week1.day1;

public class ReverseString1 {
	public static void main(String[] args) {
		String letters = "varandeepak";

		char[] charArray = letters.toCharArray();

		for (int i = charArray.length-1; i >= 0; i--) {

			System.out.println(charArray[i]);
			
		

			String test = "changeme";
			char[] charArray2 = test.toCharArray();
			for (int j = 0; j < charArray2.length; j++) {

				if (j%2!=0) {
					int upperCase = Character.toUpperCase(charArray2[j]);
					
					System.out.println(upperCase);
					
				}
				}
				
			}


		}

	}