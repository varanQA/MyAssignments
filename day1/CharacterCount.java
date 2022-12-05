package week1.day1;

public class CharacterCount {
	
	public static void main(String[] args) {
		
		String company = "hexaware";
		char expected = 'e';
		int count = 0;
		
		char[] charArray = company.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if (expected == charArray[i]) {
				count++;
				System.out.print(charArray[i] + "=");
				 System.out.println(i);
				
			}
			
		}
		
		System.out.println("Number of count =" + count);
		
	}

}
